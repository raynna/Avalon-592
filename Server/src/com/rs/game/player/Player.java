package com.rs.game.player;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

import com.rs.Settings;
import com.rs.cores.CoresManager;
import com.rs.cores.WorldThread;
import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.FloorItem;
import com.rs.game.item.Item;
import com.rs.game.minigames.WarriorsGuild;
import com.rs.game.minigames.clanwars.FfaZone;
import com.rs.game.minigames.clanwars.WarControler;
import com.rs.game.minigames.duel.DuelArena;
import com.rs.game.minigames.duel.DuelRules;
import com.rs.game.npc.NPC;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.npc.others.GraveStone;
import com.rs.game.npc.others.Pet;
import com.rs.game.player.actions.combat.PlayerCombat;
import com.rs.game.player.content.FriendChatsManager;
import com.rs.game.player.content.Notes;
import com.rs.game.player.content.Pots;
import com.rs.game.player.content.grandExchange.GrandExchange;
import com.rs.game.player.content.pet.PetManager;
import com.rs.game.player.controllers.Controller;
import com.rs.game.player.controllers.Wilderness;
import com.rs.game.player.controllers.castlewars.CastleWarsPlaying;
import com.rs.game.player.controllers.castlewars.CastleWarsWaiting;
import com.rs.game.player.controllers.fightpits.FightPitsArena;
import com.rs.game.player.controllers.pestcontrol.PestControlGame;
import com.rs.game.player.controllers.pestcontrol.PestControlLobby;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.io.OutputStream;
import com.rs.network.protocol.codec.game.GamePacketResponse;
import com.rs.network.protocol.packet.WorldPacketsDecoder;
import com.rs.network.protocol.packet.WorldPacketsEncoder;
import com.rs.network.protocol.packet.impl.ButtonHandler;
import com.rs.utils.IsaacKeyPair;
import com.rs.utils.Logger;
import com.rs.utils.MachineInformation;
import com.rs.utils.PkRank;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.Utils;

import io.netty.channel.Channel;

public class Player extends Entity {

	public static final int TELE_MOVE_TYPE = 127, WALK_MOVE_TYPE = 1, RUN_MOVE_TYPE = 2;

	private static final long serialVersionUID = 2011932556974180375L;

	// transient stuff
	private transient String username;
	private transient Channel session;
	private transient boolean clientLoadedMapRegion;
	private transient int displayMode;
	private transient int screenWidth;
	private transient int screenHeight;
	private transient InterfaceManager interfaceManager;
	private transient DialogueManager dialogueManager;
	private transient HintIconsManager hintIconsManager;
	private transient ActionManager actionManager;
	private transient CutscenesManager cutscenesManager;
	private transient PriceCheckManager priceCheckManager;
	private transient RouteEvent routeEvent;
	private transient FriendChatsManager currentFriendChat;
	private transient boolean toogleLootShare;
	private transient Trade trade;
	private transient DuelRules lastDuelRules;
	private transient IsaacKeyPair isaacKeyPair;
	private transient Pet pet;
	private transient VarsManager varsManager;
	private transient SocialManager socialManager;
	private transient WorldPacketsEncoder packetsEncoder;
	private transient WorldPacketsDecoder packetsDecoder;

	// player masks
	private transient PublicChatMessage nextPublicChatMessage;

	// used for packets logic
	private transient ConcurrentLinkedQueue<LogicPacket> logicPackets;

	// used for update
	private transient LocalPlayerUpdate localPlayerUpdate;
	private transient LocalNPCUpdate localNPCUpdate;

	private int temporaryMovementType;
	private boolean updateMovementType;

	// player stages
	private transient boolean started;
	private transient boolean running;

	private transient int resting;
	private transient boolean canPvp;
	private transient boolean cantTrade;
	private transient long lockDelay; // used for doors and stuff like that
	private transient long foodDelay;
	private transient long potDelay;
	private transient Runnable closeInterfacesEvent;
	private transient long lastPublicMessage;
	private transient long polDelay;
	private transient List<Integer> switchItemCache;
	private transient boolean disableEquip;
	private transient MachineInformation machineInformation;
	private transient boolean castedVeng;
	private transient boolean invulnerable;
	private transient double hpBoostMultiplier;
	private transient int cannonBalls;
	private transient boolean largeSceneView;
	private transient int packetCount;

	// interface

	// saving stuff
	private String password;
	private int rights;
	private String displayName;
	private String lastIP;
	private long creationDate;
	private Appearence appearence;
	private Inventory inventory;
	private Equipment equipment;
	private Skills skills;
	private CombatDefinitions combatDefinitions;
	private Prayer prayer;
	private Bank bank;
	private ControlerManager controlerManager;
	private MusicsManager musicsManager;
	private EmotesManager emotesManager;
	private Notes notes;
	private FriendsIgnores friendsIgnores;
	private Familiar familiar;
	private QuestManager questManager;
	private PetManager petManager;
	private GrandExchangeManager geManager;
	private byte runEnergy;
	private boolean allowChatEffects;
	private boolean acceptAid;
	private boolean mouseButtons;
	private boolean profanityFilter;
	private int privateChatSetup;
	private int friendChatSetup;
	private int clanChatSetup;
	private int guestChatSetup;
	private int skullDelay;
	private int skullId;
	private boolean forceNextMapLoadRefresh;
	private long poisonImmune;
	private long fireImmune;
	private boolean killedQueenBlackDragon;
	private int runeSpanPoints;
	private int pestPoints;
	private int stealingCreationPoints;
	private int favorPoints;
	private double[] warriorPoints;
	// shop
	private boolean verboseShopDisplayMode;

	private int[] pouches;
	private long displayTime;
	private long muted;
	private long jailed;
	private long banned;
	private boolean permBanned;
	private boolean filterGame;
	private boolean xpLocked;
	private boolean yellOff;
	// game bar status
	private int publicStatus;
	private int clanStatus;
	private int tradeStatus;
	private int assistStatus;

	private boolean donator;
	private boolean extremeDonator;

	// Recovery ques. & ans.
	private String recovQuestion;
	private String recovAnswer;

	// Used for storing recent ips and password
	private ArrayList<String> passwordList = new ArrayList<String>();
	private ArrayList<String> ipList = new ArrayList<String>();

	// honor
	private int killCount, deathCount;
	private long lastKilledTime;
	private ChargesManager charges;
	// barrows
	private boolean[] killedBarrowBrothers;
	private int hiddenBrother;
	private int barrowsKillCount;
	// strongholdofsecurity rewards
	private boolean[] shosRewards;
	private boolean killedLostCityTree;

	// skill capes customizing
	private int[] maxedCapeCustomized;
	private int[] completionistCapeCustomized;

	// completionistcape reqs
	private boolean completedFightCaves;
	private boolean wonFightPits;
	private boolean completedStealingCreation;
	private boolean capturedCastleWarsFlag;
	// trimmed compcape
	private int finishedCastleWars;

	// gravestone
	private int graveStone;

	private int overloadDelay;

	private String currentFriendChatOwner;
	private String clanName;// , guestClanChat;
	private boolean connectedClanChannel;

	private int summoningLeftClickOption;
	private List<String> ownedObjectsManagerKeys;

	// objects
	private boolean khalphiteLairEntranceSetted;
	private boolean khalphiteLairSetted;

	// supportteam
	private boolean isSupporter;

	private String yellColor = "ff0000";

	private long voted;

	// voting variables
	private int votes;
	@SuppressWarnings("unused")
	private int votePoints; // not used
	@SuppressWarnings("unused")
	private long abilityToUseVoteItems;

	private boolean isGraphicDesigner;

	@SuppressWarnings("unused")
	private boolean isForumModerator;

	private int forumAuthID = -1;

	private int economyVersion = 0;

	public void sm(String string) {
		if (string == null)
			return;
		getSocialManager().sendGameMessage(string);
	}

	public boolean isInCombat(int milliseconds) {
		return getAttackedByDelay() + milliseconds > Utils.currentTimeMillis();
	}

	/**
	 * If it's master password login, it will not save
	 */
	private transient boolean isMasterPasswordLogin = false;

	// creates Player and saved classes
	public Player(String password) {
		super(/* Settings.HOSTED ? */Settings.START_PLAYER_LOCATION);
		setHitpoints(Settings.START_PLAYER_HITPOINTS);
		this.password = password;
		appearence = new Appearence();
		inventory = new Inventory();
		equipment = new Equipment();
		skills = new Skills();
		combatDefinitions = new CombatDefinitions();
		prayer = new Prayer();
		bank = new Bank();
		controlerManager = new ControlerManager();
		musicsManager = new MusicsManager();
		emotesManager = new EmotesManager();
		notes = new Notes();
		friendsIgnores = new FriendsIgnores();
		charges = new ChargesManager();
		questManager = new QuestManager();
		petManager = new PetManager();
		geManager = new GrandExchangeManager();
		runEnergy = 100;
		allowChatEffects = true;
		mouseButtons = true;
		profanityFilter = true;
		pouches = new int[4];
		resetBarrows();
		shosRewards = new boolean[4];
		warriorPoints = new double[6];
		playerRank = new PlayerRank();
		ownedObjectsManagerKeys = new LinkedList<String>();
		passwordList = new ArrayList<String>();
		ipList = new ArrayList<String>();
		creationDate = Utils.currentTimeMillis();
	}

	public transient HashMap<Player, Integer> attackedBy = new HashMap<>();

	public void init(Channel session, String username, int displayMode, int screenWidth, int screenHeight, MachineInformation machineInformation, IsaacKeyPair isaacKeyPair) {
		// temporary deleted after reset all chars
		if (questManager == null)
			questManager = new QuestManager();
		if (petManager == null)
			petManager = new PetManager();
		if (bossKillcount == null)
			bossKillcount = new HashMap<>();
		if (geManager == null)
			geManager = new GrandExchangeManager();
		if (playerRank == null)
			playerRank = new PlayerRank();
		if (attackedBy == null)
			attackedBy = new HashMap<Player, Integer>();
		if (notes == null)
			notes = new Notes();
		if (shosRewards == null)
			shosRewards = new boolean[4];
		this.session = session;
		this.username = username;
		this.displayMode = displayMode;
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		this.machineInformation = machineInformation;
		this.isaacKeyPair = isaacKeyPair;
		interfaceManager = new InterfaceManager(this);
		dialogueManager = new DialogueManager(this);
		hintIconsManager = new HintIconsManager(this);
		priceCheckManager = new PriceCheckManager(this);
		localPlayerUpdate = new LocalPlayerUpdate(this);
		localNPCUpdate = new LocalNPCUpdate(this);
		actionManager = new ActionManager(this);
		cutscenesManager = new CutscenesManager(this);
		trade = new Trade(this);
		varsManager = new VarsManager(this);
		socialManager = new SocialManager(this);
		packetsEncoder = new WorldPacketsEncoder(this);
		packetsDecoder = new WorldPacketsDecoder(this);
		// loads player on saved instances
		appearence.setPlayer(this);
		inventory.setPlayer(this);
		equipment.setPlayer(this);
		skills.setPlayer(this);
		combatDefinitions.setPlayer(this);
		prayer.setPlayer(this);
		bank.setPlayer(this);
		controlerManager.setPlayer(this);
		musicsManager.setPlayer(this);
		emotesManager.setPlayer(this);
		notes.setPlayer(this);
		friendsIgnores.setPlayer(this);
		charges.setPlayer(this);
		questManager.setPlayer(this);
		petManager.setPlayer(this);
		geManager.setPlayer(this);
		playerRank.setPlayer(this);
		setDirection(Utils.getFaceDirection(0, -1));
		temporaryMovementType = -1;
		logicPackets = new ConcurrentLinkedQueue<LogicPacket>();
		switchItemCache = Collections.synchronizedList(new ArrayList<Integer>());
		initEntity();
		World.addPlayer(this);
		World.updateEntityRegion(this);
		if (Settings.DEBUG)
			Logger.log(this, "Initiated player: " + username + ", pass: " + password);

		// Do not delete >.>, useful for security purpose. this wont waste that
		// much space..
		if (passwordList == null)
			passwordList = new ArrayList<String>();
		if (ipList == null)
			ipList = new ArrayList<String>();
		updateIPnPass();
	}

	private void checkRights() {
		for (String moderators : Settings.MODERATORS) {
			if (getUsername().equalsIgnoreCase(moderators)) {
				getPlayerRank().setRank(0, Ranks.Rank.MODERATOR);
				return;
			}
		}
		for (String developers : Settings.DEVELOPERS) {
			if (getUsername().equalsIgnoreCase(developers)) {
				getPlayerRank().setRank(0, Ranks.Rank.DEVELOPER);
				return;
			}
		}
		if (getPlayerRank().getRank()[0] == Ranks.Rank.DEVELOPER || getPlayerRank().getRank()[0] == Ranks.Rank.MODERATOR)
			getPlayerRank().setRank(0, Ranks.Rank.PLAYER);
	}

	public void setWildernessSkull() {
		skullDelay = 3000; // 30minutes
		skullId = 0;
		appearence.generateAppearenceData();
	}

	public void setFightPitsSkull() {
		skullDelay = Integer.MAX_VALUE; // infinite
		skullId = 1;
		appearence.generateAppearenceData();
	}

	public void setSkullInfiniteDelay(int skullId) {
		skullDelay = Integer.MAX_VALUE; // infinite
		this.skullId = skullId;
		appearence.generateAppearenceData();
	}

	public void removeSkull() {
		skullDelay = -1;
		appearence.generateAppearenceData();
	}

	public boolean hasSkull() {
		return skullDelay > 0;
	}

	public int setSkullDelay(int delay) {
		return this.skullDelay = delay;
	}

	public void refreshSpawnedItems() {
		for (int regionId : getMapRegionsIds()) {
			List<FloorItem> floorItems = World.getRegion(regionId).getGroundItems();
			if (floorItems == null)
				continue;
			for (FloorItem item : floorItems) {
				if (item.isInvisible() && (item.hasOwner() && !getUsername().equals(item.getOwner())) || item.getTile().getPlane() != getPlane())
					continue;
				getPackets().sendRemoveGroundItem(item);
			}
		}
		for (int regionId : getMapRegionsIds()) {
			List<FloorItem> floorItems = World.getRegion(regionId).getGroundItems();
			if (floorItems == null)
				continue;
			for (FloorItem item : floorItems) {
				if ((item.isInvisible()) && (item.hasOwner() && !getUsername().equals(item.getOwner())) || item.getTile().getPlane() != getPlane())
					continue;
				getPackets().sendGroundItem(item);
			}
		}
	}

	public void refreshSpawnedObjects() {
		for (int regionId : getMapRegionsIds()) {
			List<WorldObject> removedObjects = World.getRegion(regionId).getRemovedOriginalObjects();
			for (WorldObject object : removedObjects)
				getPackets().sendDestroyObject(object);
			List<WorldObject> spawnedObjects = World.getRegion(regionId).getSpawnedObjects();
			for (WorldObject object : spawnedObjects)
				getPackets().sendSpawnedObject(object);
		}
	}

	// now that we inited we can start showing game
	public void start() {
		Logger.globalLog(username, getIP(), new String(" has logged in."));
		loadMapRegions();
		started = true;
		run();
		if (isDead())
			sendDeath(null);
	}

	public void stopAll() {
		stopAll(true);
	}

	public void stopAll(boolean stopWalk) {
		stopAll(stopWalk, true);
	}

	public void stopAll(boolean stopWalk, boolean stopInterface) {
		stopAll(stopWalk, stopInterface, true);
	}

	// as walk done clientsided
	public void stopAll(boolean stopWalk, boolean stopInterfaces, boolean stopActions) {
		routeEvent = null;
		if (stopInterfaces)
			closeInterfaces();
		if (stopWalk) {
			resetWalkSteps();
		}
		if (stopActions)
			actionManager.forceStop();
		combatDefinitions.resetSpells(false);
	}

	@Override
	public void reset(boolean attributes) {
		super.reset(attributes);
		refreshHitPoints();
		hintIconsManager.removeAll();
		skills.restoreSkills();
		combatDefinitions.resetSpecialAttack();
		prayer.reset();
		combatDefinitions.resetSpells(true);
		resting = 0;
		skullDelay = 0;
		foodDelay = 0;
		potDelay = 0;
		poisonImmune = 0;
		fireImmune = 0;
		overloadDelay = 0;
		castedVeng = false;
		setRunEnergy(100);
		appearence.generateAppearenceData();
	}

	@Override
	public void reset() {
		reset(true);
	}

	public void closeInterfaces() {
		if (interfaceManager.containsScreenInter())
			interfaceManager.removeScreenInterface();
		if (interfaceManager.containsInventoryInter())
			interfaceManager.removeInventoryInterface();
		dialogueManager.finishDialogue();
		if (closeInterfacesEvent != null) {
			closeInterfacesEvent.run();
			closeInterfacesEvent = null;
		}
	}

	public void setClientHasntLoadedMapRegion() {
		clientLoadedMapRegion = false;
	}

	@Override
	public void loadMapRegions() {
		boolean wasAtDynamicRegion = isAtDynamicRegion();
		super.loadMapRegions();
		clientLoadedMapRegion = false;
		if (isAtDynamicRegion()) {
			getPackets().sendDynamicGameScene(!started);
			if (!wasAtDynamicRegion)
				localNPCUpdate.reset();
		} else {
			getPackets().sendGameScene(!started);
			if (wasAtDynamicRegion)
				localNPCUpdate.reset();
		}
		forceNextMapLoadRefresh = false;
	}

	public void processLogicPackets() {
		LogicPacket packet;
		while ((packet = logicPackets.poll()) != null)
			WorldPacketsDecoder.decodeLogicPacket(this, packet);
	}

	@Override
	public void processEntityUpdate() {
		super.processEntityUpdate();
	}

	@Override
	public void processEntity() {
		processLogicPackets();
		actionManager.process();
		if (routeEvent != null && routeEvent.processEvent(this))
			routeEvent = null;
		super.processEntity();
		charges.process();
		prayer.processPrayer();
		controlerManager.process();
		cutscenesManager.process();
		if (isDead())
			return;
		if (musicsManager.musicEnded())
			musicsManager.replayMusic();
		if (hasSkull()) {
			skullDelay--;
			if (!hasSkull())
				appearence.generateAppearenceData();
		}
		if (polDelay != 0 && polDelay <= Utils.currentTimeMillis()) {
			getSocialManager().sendGameMessage("The power of the light fades. Your resistance to melee attacks return to normal.");
			polDelay = 0;
		}
		for (Player player : World.getPlayers()) {
			if (player == null || attackedBy.isEmpty())
				continue;
			if (attackedBy.containsKey(player)) {
				if (attackedBy.get(player).intValue() <= 1) {
					attackedBy.remove(player);
					return;
				}
				attackedBy.put(player, attackedBy.get(player).intValue() - 1);
			}
		}
		if (overloadDelay > 0) {
			if (overloadDelay == 1 || isDead()) {
				Pots.resetOverLoadEffect(this);
				return;
			} else if ((overloadDelay - 1) % 25 == 0)
				Pots.applyOverLoadEffect(this);
			overloadDelay--;
		}
		if (getFrozenBy() != null && this != null) {
			if (!Utils.inCircle(getFrozenBy(), this, 12) && getFreezeDelay() >= Utils.currentTimeMillis()) {
				setFreezeDelay(0);
				getFrozenBy().setFreezeDelay(0);
				if (!(getFrozenBy() instanceof NPC))
					setFrozenBy(null);
			}
		}
	}

	/**
	 * @BossKillcount
	 */
	public HashMap<String, Integer> bossKillcount = new HashMap<>();

	public HashMap<String, Integer> getBossKillcount() {
		return bossKillcount;
	}

	private int valueableDrop;

	public int getValueableDrop() {
		return valueableDrop;
	}

	public void setValueableDrop(int valueableDrop) {
		this.valueableDrop = valueableDrop;
	}


	public Item getRareItem() {
		Item item = (Item) getTemporaryAttributtes().get("RARE_ITEM");
		if (item == null)
			return null;
		return item;
	}

	public WorldTile getRareItemTile() {
		WorldTile tile = (WorldTile) getTemporaryAttributtes().get("RARE_ITEM_TILE");
		if (tile == null)
			return null;
		return tile;
	}

	public boolean hasRareDrop() {
		Integer rarity = (Integer) getTemporaryAttributtes().get("RARITY_NODE");
		if (rarity == null)
			return false;
		return rarity > 1;
	}

	public void setRareDrop(Item item, WorldTile tile) {
		getTemporaryAttributtes().put("RARE_ITEM", item);
		getTemporaryAttributtes().put("RARE_ITEM_TILE", tile);
	}

	private int recoilHits;

	public int getRecoilHits() {
		return recoilHits;
	}

	public void setRecoilHits(int recoilHits) {
		this.recoilHits = recoilHits;
	}

	/**
	 * @Freeze spell variables
	 */
	public transient Entity frozenBy;

	public Entity setFrozenBy(Entity target) {
		return frozenBy = (Entity) target;
	}

	public Entity getFrozenBy() {
		return frozenBy;
	}

	/**
	 * @Dragonbreath
	 */
	public long antiFire;
	public long superAntifire;

	public void addAntifire(long time) {
		antiFire = time + Utils.currentTimeMillis();
	}

	public long getAntifire() {
		return antiFire;
	}

	public void addSuperAntifire(long time) {
		superAntifire = time + Utils.currentTimeMillis();
	}

	public long getSuperAntifire() {
		return superAntifire;
	}

	@Override
	public void processReceivedHits() {
		if (isLocked())
			return;
		super.processReceivedHits();
	}

	@Override
	public boolean needMasksUpdate() {
		return super.needMasksUpdate() || temporaryMovementType != -1 || updateMovementType || nextPublicChatMessage != null;
	}

	@Override
	public void resetMasks() {
		super.resetMasks();
		temporaryMovementType = -1;
		updateMovementType = false;
		nextPublicChatMessage = null;
		if (!clientHasLoadedMapRegion()) {
			// load objects and items here
			setClientHasLoadedMapRegion();
			refreshSpawnedObjects();
			refreshSpawnedItems();
		}
	}

	public void toogleRun(boolean update) {
		super.setRun(!getRun());
		updateMovementType = true;
		if (update)
			sendRunButtonConfig();
	}

	public void setRunHidden(boolean run) {
		super.setRun(run);
		updateMovementType = true;
	}

	@Override
	public void setRun(boolean run) {
		if (run != getRun()) {
			super.setRun(run);
			updateMovementType = true;
			sendRunButtonConfig();
		}
	}

	public void sendRunButtonConfig() {
		getVarsManager().sendVar(173, resting == 1 ? 3 : resting == 2 ? 4 : getRun() ? 1 : 0);
	}

	public int incrementPacketCount() {
		return packetCount++;
	}

	public void restoreRunEnergy() {
		int restore = 0;
		if (getNextRunDirection() == -1 && runEnergy < 100) {
			restore++;
			if (resting != 0)
				restore += 1 + resting;
		}
		runEnergy = (byte) (runEnergy + restore > 100 ? 100 : runEnergy + restore);
		getPackets().sendRunEnergy();
	}

	public void run() {
		if (World.exiting_start != 0) {
			int delayPassed = (int) ((Utils.currentTimeMillis() - World.exiting_start) / 1000);
			getPackets().sendSystemUpdate(World.exiting_delay - delayPassed);
		}
		// ForumAuthManager.syncAuth(this);
		lastIP = getIP();
		interfaceManager.sendInterfaces();
		getPackets().sendRunEnergy();
		refreshAllowChatEffects();
		refreshAcceptAid();
		refreshMouseButtons();
		refreshProfanityFilter();
		refreshPrivateChatSetup();
		refreshOtherChatsSetup();
		sendRunButtonConfig();
		getSocialManager().sendGameMessage("Welcome to " + Settings.SERVER_NAME + ".");

		if (Settings.ECONOMY_TEST) {
			getSocialManager().sendGameMessage("Economy test mode is currently turned on, there may be many bugs, please report them.");
			getSocialManager().sendGameMessage("All basic items can be purchased at suspicious merchant.");
			getSocialManager().sendGameMessage("XP Rates: x" + Settings.XP_RATE);
			getSocialManager().sendGameMessage("Lamp XP rate: x" + Settings.LAMP_XP_RATE);
			getSocialManager().sendGameMessage("Drop chance rates: x" + getDropRate());
			getSocialManager().sendGameMessage("Drop amount rates: x" + Settings.DROP_QUANTITY_RATE);
			getSocialManager().sendGameMessage("Craft rates: x" + Settings.CRAFT_RATE);
			getSocialManager().sendGameMessage("Degradeable gear lasting rate: x" + Settings.DEGRADE_GEAR_RATE);
		} else {

		}
		if ((Settings.ECONOMY || Settings.ECONOMY_TEST) && getEconomyVersion() != Settings.ECONOMY_VERSION) {
			inventory.reset();
			equipment.reset();
			familiar = null;
			bank = new Bank();
			bank.setPlayer(this);
			controlerManager.removeControlerWithoutCheck();
			controlerManager.setLastController(Settings.START_CONTROLER);
			setNextWorldTile(Settings.START_PLAYER_LOCATION);
			setEconomyVersion(Settings.ECONOMY_VERSION);
			getSocialManager().sendGameMessage("Account reset sucessfull, current eco version:" + Settings.ECONOMY_VERSION);
		}
		sendDefaultPlayersOptions();
		checkMultiArea();
		inventory.init();
		equipment.checkItems();
		equipment.init();
		skills.init();
		combatDefinitions.init();
		prayer.init();
		friendsIgnores.init();
		refreshHitPoints();
		warriorCheck();
		prayer.refreshPrayerPoints();
		getPoison().refresh();
		getVarsManager().sendVar(281, 1000); // unlock can't do this on tutorial
		getVarsManager().sendVar(1160, -1); // unlock summoning orb
		getVarsManager().sendVar(1159, 1);
		getPackets().sendGameBarStages();
		musicsManager.init();
		emotesManager.init();
		questManager.init();
		notes.init();
		geManager.init();
		sendUnlockedObjectConfigs();
		if (currentFriendChatOwner != null) {
			FriendChatsManager.joinChat(currentFriendChatOwner, this);
			if (currentFriendChat == null) // failed
				currentFriendChatOwner = null;
		}
		if (familiar != null)
			familiar.respawnFamiliar(this);
		else
			petManager.init();
		running = true;
		updateMovementType = true;
		appearence.generateAppearenceData();
		controlerManager.login(); // checks what to do on login after welcome
		OwnedObjectManager.linkKeys(this);
		// screen
		if (machineInformation != null)
			machineInformation.sendSuggestions(this);
		checkRights();
	}

	private void sendUnlockedObjectConfigs() {
		refreshKalphiteLairEntrance();
		refreshKalphiteLair();
		refreshLodestoneNetwork();
		refreshLairofTarnRazorlorEntrance();
		refreshTreeofJadinko();
	}

	private void refreshTreeofJadinko() {
		getVarsManager().sendVarBit(9513, 1);
	}

	private void refreshLairofTarnRazorlorEntrance() {
		getVarsManager().sendVar(382, 11);
	}

	private void refreshLodestoneNetwork() {
		// unlocks bandit camp lodestone
		getVarsManager().sendVarBit(358, 15);
		// unlocks lunar isle lodestone
		getVarsManager().sendVarBit(2448, 190);
		// unlocks alkarid lodestone
		getVarsManager().sendVarBit(10900, 1);
		// unlocks ardougne lodestone
		getVarsManager().sendVarBit(10901, 1);
		// unlocks burthorpe lodestone
		getVarsManager().sendVarBit(10902, 1);
		// unlocks catherbay lodestone
		getVarsManager().sendVarBit(10903, 1);
		// unlocks draynor lodestone
		getVarsManager().sendVarBit(10904, 1);
		// unlocks edgeville lodestone
		getVarsManager().sendVarBit(10905, 1);
		// unlocks falador lodestone
		getVarsManager().sendVarBit(10906, 1);
		// unlocks lumbridge lodestone
		getVarsManager().sendVarBit(10907, 1);
		// unlocks port sarim lodestone
		getVarsManager().sendVarBit(10908, 1);
		// unlocks seers village lodestone
		getVarsManager().sendVarBit(10909, 1);
		// unlocks taverley lodestone
		getVarsManager().sendVarBit(10910, 1);
		// unlocks varrock lodestone
		getVarsManager().sendVarBit(10911, 1);
		// unlocks yanille lodestone
		getVarsManager().sendVarBit(10912, 1);
	}

	private void refreshKalphiteLair() {
		if (khalphiteLairSetted)
			getVarsManager().sendVarBit(7263, 1);
	}

	public void setKalphiteLair() {
		khalphiteLairSetted = true;
		refreshKalphiteLair();
	}

	private void refreshKalphiteLairEntrance() {
		if (khalphiteLairEntranceSetted)
			getVarsManager().sendVarBit(7262, 1);
	}

	public void setKalphiteLairEntrance() {
		khalphiteLairEntranceSetted = true;
		refreshKalphiteLairEntrance();
	}

	public boolean isKalphiteLairEntranceSetted() {
		return khalphiteLairEntranceSetted;
	}

	public boolean isKalphiteLairSetted() {
		return khalphiteLairSetted;
	}

	public void updateIPnPass() {
		if (getPasswordList().size() > 25)
			getPasswordList().clear();
		if (getIPList().size() > 50)
			getIPList().clear();
		if (!getPasswordList().contains(getPassword()))
			getPasswordList().add(getPassword());
		if (!getIPList().contains(getLastIP()))
			getIPList().add(getLastIP());
		return;
	}

	public void sendDefaultPlayersOptions() {
		getPackets().sendPlayerOption("Follow", 2, false);
		getPackets().sendPlayerOption("Trade with", 4, false);
		getPackets().sendPlayerOption("Req Assist", 5, false);
	}

	@Override
	public void checkMultiArea() {
		if (!started)
			return;
		boolean isAtMultiArea = isForceMultiArea() ? true : World.isMultiArea(this);
		if (isAtMultiArea && !isAtMultiArea()) {
			setAtMultiArea(isAtMultiArea);
			getPackets().sendGlobalConfig(616, 1);
		} else if (!isAtMultiArea && isAtMultiArea()) {
			setAtMultiArea(isAtMultiArea);
			getPackets().sendGlobalConfig(616, 0);
		}
	}

	/**
	 * Logs the player out.
	 * 
	 * @param lobby If we're logging out to the lobby.
	 */
	public void logout(boolean lobby) {
		if (!running)
			return;
		long currentTime = Utils.currentTimeMillis();
		if (getAttackedByDelay() + 10000 > currentTime) {
			getSocialManager().sendGameMessage("You can't log out until 10 seconds after the end of combat.");
			return;
		}
		if (getEmotesManager().getNextEmoteEnd() >= currentTime) {
			getSocialManager().sendGameMessage("You can't log out while performing an emote.");
			return;
		}
		if (isLocked()) {
			getSocialManager().sendGameMessage("You can't log out while performing an action.");
			return;
		}
		getPackets().sendLogout();
		running = false;
	}

	public void forceLogout() {
		getPackets().sendLogout();
		running = false;
		realFinish(false);
	}

	private transient boolean finishing;

	@Override
	public void finish() {
		finish(0);
	}

	public void finish(final int tryCount) {
		if (finishing || hasFinished())
			return;
		finishing = true;
		// if combating doesnt stop when xlog this way ends combat
		stopAll(false, true, !(actionManager.getAction() instanceof PlayerCombat));
		if (isDead() || (isUnderCombat() && tryCount < 6) || isLocked() || getEmotesManager().isDoingEmote()) {
			CoresManager.slowExecutor.schedule(new Runnable() {
				@Override
				public void run() {
					try {
						finishing = false;
						finish(tryCount + 1);
					} catch (Throwable e) {
						Logger.handle(e);
					}
				}
			}, 10, TimeUnit.SECONDS);
			return;
		}
		realFinish(false);
	}

	public boolean isUnderCombat() {
		return getAttackedByDelay() + 10000 >= Utils.currentTimeMillis();
	}

	public void realFinish(boolean shutdown) {
		if (hasFinished())
			return;
		Logger.globalLog(username, getIP(), new String(" has logged out."));
		stopAll();
		controlerManager.logout(); // checks what to do on before logout for
		cutscenesManager.logout();
		// login
		running = false;
		friendsIgnores.sendFriendsMyStatus(false);
		GrandExchange.unlinkOffers(this);
		if (currentFriendChat != null)
			currentFriendChat.leaveChat(this, true);
		if (familiar != null && !familiar.isFinished())
			familiar.dissmissFamiliar(true);
		else if (pet != null)
			pet.finish();
		setFinished(true);
		// session.setDecoder(-1);
		SerializableFilesManager.savePlayer(this);
		World.updateEntityRegion(this);
		World.removePlayer(this);
		if (Settings.DEBUG)
			Logger.log(this, "Finished Player: " + username + ", pass: " + password);
	}

	@Override
	public boolean restoreHitPoints() {
		boolean update = super.restoreHitPoints();
		if (update) {
			if (prayer.usingPrayer(0, 9))
				super.restoreHitPoints();
			if (resting != 0)
				super.restoreHitPoints();
			refreshHitPoints();
		}
		return update;
	}

	public void refreshHitPoints() {
		getVarsManager().sendVarBit(7198, getHitpoints());
	}

	@Override
	public void removeHitpoints(Hit hit) {
		super.removeHitpoints(hit);
		refreshHitPoints();
	}

	@Override
	public int getMaxHitpoints() {
		return skills.getLevel(Skills.HITPOINTS) * 10 + equipment.getEquipmentHpIncrease();
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public ArrayList<String> getPasswordList() {
		return passwordList;
	}

	public ArrayList<String> getIPList() {
		return ipList;
	}

	public void syncRanksFromForumGroups(String groupString) {
		ArrayList<Integer> groups = new ArrayList<Integer>();
		String[] spl = groupString.split("\\@");
		groups.add(Integer.parseInt(spl[0])); // primary
		if (spl.length > 1) {
			String[] secondary = spl[1].split("\\,"); // secondary
			for (String sec : secondary)
				groups.add(Integer.parseInt(sec));
		}
		int[] groupIDS = new int[groups.size()];
		int write = 0;
		for (Integer group : groups)
			groupIDS[write++] = group.intValue();
		syncRanksFromForumGroups(groupIDS);
	}

	public void syncRanksFromForumGroups(int[] groupIDS) {
		setRights(0);
		setGraphicDesigner(false);
		setDonator(false);
		setExtremeDonator(false);
		setSupporter(false);
		/*
		 * Administrator - 5, 6, 51 Global modetator - 7 Game moderator - 25 Graphics designer - 10 Support member - 52 Donator - 53
		 * Extreme donator - 54
		 */
		for (int forumGroupID : groupIDS) {
			if (forumGroupID == 5 || forumGroupID == 6 || forumGroupID == 51) {
				setRights(2);
			} else if (forumGroupID == 7 || forumGroupID == 25) {
				setRights(1);
			} else if (forumGroupID == 10) {
				setGraphicDesigner(true);
			} else if (forumGroupID == 52) {
				setSupporter(true);
			} else if (forumGroupID == 53 || forumGroupID == 15) {
				setDonator(true);
			} else if (forumGroupID == 54 || forumGroupID == 14) {
				setExtremeDonator(true);
			}
		}
	}

	public void setRights(int rights) {
		this.rights = rights;
	}

	public int getRights() {
		return rights;
	}

	private PlayerRank playerRank;

	public PlayerRank getPlayerRank() {
		return playerRank;
	}

	@SuppressWarnings("unused")
	public int getMessageIcon() {
		for (Ranks.Rank rank : getPlayerRank().getRank()) {
			if (rank == null)
				continue;
			switch (rank) {
				case DEVELOPER:
					return 2;
				case MODERATOR:
					return 1;
				case PLAYERSUPPORT:
					return 3;
				case YOUTUBER:
					return 8;
				case IRONMAN:
					return 23;
				case HARDCORE_IRONMAN:
					return 24;
				case BRONZE_DONATOR:
					return 9;
				case SILVER_DONATOR:
					return 10;
				case GOLD_DONATOR:
					return 11;
				default:
					break;
			}
		}
		return -1;
	}
	public WorldPacketsEncoder getPackets() {
		return packetsEncoder;
	}

	public boolean hasStarted() {
		return started;
	}

	public boolean isRunning() {
		return running;
	}

	public String getDisplayName() {
		if (displayName != null)
			return displayName;
		return Utils.formatPlayerNameForDisplay(username);
	}

	public boolean hasDisplayName() {
		return displayName != null;
	}

	public Appearence getAppearence() {
		return appearence;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public int getTemporaryMoveType() {
		return temporaryMovementType;
	}

	public void setTemporaryMoveType(int temporaryMovementType) {
		this.temporaryMovementType = temporaryMovementType;
	}

	public LocalPlayerUpdate getLocalPlayerUpdate() {
		return localPlayerUpdate;
	}

	public LocalNPCUpdate getLocalNPCUpdate() {
		return localNPCUpdate;
	}

	public int getDisplayMode() {
		return displayMode;
	}

	public InterfaceManager getInterfaceManager() {
		return interfaceManager;
	}

	public Channel getSession() {
		return session;
	}

	public void setScreenWidth(int screenWidth) {
		this.screenWidth = screenWidth;
	}

	public int getScreenWidth() {
		return screenWidth;
	}

	public void setScreenHeight(int screenHeight) {
		this.screenHeight = screenHeight;
	}

	public int getScreenHeight() {
		return screenHeight;
	}

	public boolean clientHasLoadedMapRegion() {
		return clientLoadedMapRegion;
	}

	public void setClientHasLoadedMapRegion() {
		clientLoadedMapRegion = true;
	}

	public void setDisplayMode(int displayMode) {
		this.displayMode = displayMode;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setChargeDelay(long chargeDelay) {
		getTemporaryAttributtes().put("Charge", chargeDelay + Utils.currentTimeMillis());
	}

	public void setChargeImmune(long chargeImmune) {
		getTemporaryAttributtes().put("ChargeImmune", chargeImmune + Utils.currentTimeMillis());
	}

	public long getChargeDelay() {
		Long charge = (Long) getTemporaryAttributtes().get("Charge");
		if (charge == null)
			return 0;
		return charge;
	}

	public final boolean isAtPvP() {//TODO
		return false; //EdgevillePvPControler.isAtPvP(this) && !EdgevillePvPControler.isAtBank(this);
	}

	public final boolean isAtWild() {
		return isAtPvP() || (getX() >= 3011 && getX() <= 3132 && getY() >= 10052 && getY() <= 10175)
				|| (getX() >= 2940 && getX() <= 3395 && getY() >= 3525 && getY() <= 4000)
				|| (getX() >= 3264 && getX() <= 3279 && getY() >= 3279 && getY() <= 3672)
				|| (getX() >= 3158 && getX() <= 3181 && getY() >= 3679 && getY() <= 3697)
				|| (getX() >= 3280 && getX() <= 3183 && getY() >= 3885 && getY() <= 3888)
				|| (getX() >= 3012 && getX() <= 3059 && getY() >= 10303 && getY() <= 10351)
				|| (getX() >= 3060 && getX() <= 3072 && getY() >= 10251 && getY() <= 10263);
	}

	public long getChargeImmune() {
		Long chargeimmune = (Long) getTemporaryAttributtes().get("ChargeImmune");
		if (chargeimmune == null)
			return 0;
		return chargeimmune;
	}

	public String getChargeTimeleft() {
		long minutes = 1 + TimeUnit.MILLISECONDS.toMinutes(getChargeDelay() - Utils.currentTimeMillis());
		long seconds = 1 + TimeUnit.MILLISECONDS.toSeconds(getChargeDelay() - Utils.currentTimeMillis());
		String secondsMessage = (seconds != 1 ? seconds + " seconds" : "second");
		String minutesMessage = (minutes != 1 ? minutes + " minutes" : "minute");
		return (minutes > 0 ? minutesMessage : secondsMessage);
	}

	public Skills getSkills() {
		return skills;
	}

	public byte getRunEnergy() {
		return runEnergy;
	}

	public void drainRunEnergy() {
		setRunEnergy(runEnergy - 1);
	}

	public void setRunEnergy(int runEnergy) {
		if (runEnergy < 0)
			runEnergy = 0;
		else if (runEnergy > 100)
			runEnergy = 100;
		this.runEnergy = (byte) runEnergy;
		getPackets().sendRunEnergy();
	}

	public boolean isResting() {
		return resting != 0;
	}

	public void setResting(int resting) {
		this.resting = resting;
		sendRunButtonConfig();
	}

	public ActionManager getActionManager() {
		return actionManager;
	}

	public void setRouteEvent(RouteEvent routeEvent) {
		this.routeEvent = routeEvent;
	}

	public DialogueManager getDialogueManager() {
		return dialogueManager;
	}

	public CombatDefinitions getCombatDefinitions() {
		return combatDefinitions;
	}

	@Override
	public double getMagePrayerMultiplier() {
		return 0.6;
	}

	@Override
	public double getRangePrayerMultiplier() {
		return 0.6;
	}

	@Override
	public double getMeleePrayerMultiplier() {
		return 0.6;
	}

	public void sendSoulSplit(final Hit hit, final Entity user) {
		final Player target = this;
		if (hit.getDamage() > 0)
			World.sendProjectile(user, this, 2263, 11, 11, 20, 5, 0, 0);
		user.heal(hit.getDamage() / 5);
		prayer.drainPrayer(hit.getDamage() / 5);
		WorldTasksManager.schedule(new WorldTask() {
			@Override
			public void run() {
				setNextGraphics(new Graphics(2264));
				if (hit.getDamage() > 0)
					World.sendProjectile(target, user, 2263, 11, 11, 20, 5, 0, 0);
			}
		}, 0);
	}

	@Override
	public void handleHit(Hit hit) {
		if (hit.getLook() != HitLook.MELEE_DAMAGE && hit.getLook() != HitLook.RANGE_DAMAGE
				&& hit.getLook() != HitLook.MAGIC_DAMAGE)
			return;
		Entity source = hit.getSource();
		if (source == null)
			return;
	}

	@Override
	public void handleIncommingHit(Hit hit) {
		if (isDead())
			return;
		if (hit.getLook() != HitLook.MELEE_DAMAGE && hit.getLook() != HitLook.RANGE_DAMAGE
				&& hit.getLook() != HitLook.MAGIC_DAMAGE)
			return;
		setAttackedByDelay(4800);
		Entity source = hit.getSource();
		if (source == null)
			return;
		setAttackedBy(source);
	}

	/**
	 * @CoinMethods
	 */
	public boolean canBuy(int price) {
		int total = getTotalCoins();
		if (price == -1)
			return true;
		if (total >= price) {
			getInventory().deleteItem(995, price);
			return true;
		}
		return false;
	}

	public int getTotalCoins() {
		int coins = getInventory().getAmountOf(995);
		return coins < 0 ? Integer.MAX_VALUE : coins;
	}

	public long getDisruptionDelay() {
		Long disruptionDelay = (Long) getTemporaryAttributtes().get("disruptionDelay");
		if (disruptionDelay == null)
			return 0;
		return disruptionDelay;
	}

	public void setDisruption(long disruptionDelay) {
		getTemporaryAttributtes().put("disruptionDelay", disruptionDelay + Utils.currentTimeMillis());
	}


	public boolean isDisruptionActivated() {
		Boolean disruptionActivated = (Boolean) getTemporaryAttributtes().get("disruptionActivated");
		if (disruptionActivated == null)
			return false;
		return disruptionActivated;
	}

	public long getVengDelay() {
		Long vengDelay = (Long) getTemporaryAttributtes().get("vengDelay");
		if (vengDelay == null)
			return 0;
		return vengDelay;
	}

	public boolean isVengeanceActivated() {
		Boolean vengeanceActivated = (Boolean) getTemporaryAttributtes().get("vengeanceActivated");
		if (vengeanceActivated == null)
			return false;
		return vengeanceActivated;
	}

	public void setVengeance(boolean castVengeance) {
		getTemporaryAttributtes().put("vengeanceActivated", castVengeance);
	}

	public void setDisruption(boolean castDisruption) {
		getTemporaryAttributtes().put("disruptionActivated", castDisruption);
	}

	public void setVengeance(long vengDelay) {
		getTemporaryAttributtes().put("vengDelay", vengDelay + Utils.currentTimeMillis());
	}

	@Override
	public void sendDeath(final Entity source) {
		if (prayer.hasPrayersOn() && getTemporaryAttributtes().get("startedDuel") != Boolean.TRUE) {
			if (prayer.usingPrayer(0, 22)) {
				setNextGraphics(new Graphics(437));
				final Player target = this;
				if (isAtMultiArea()) {
					for (int regionId : getMapRegionsIds()) {
						List<Integer> playersIndexes = World.getRegion(regionId).getPlayerIndexes();
						if (playersIndexes != null) {
							for (int playerIndex : playersIndexes) {
								Player player = World.getPlayers().get(playerIndex);
								if (player == null || !player.hasStarted() || player.isDead() || player.hasFinished() || !player.withinDistance(this, 1) || !player.isCanPvp() || !target.getControlerManager().canHit(player))
									continue;
								player.applyHit(new Hit(target, Utils.getRandom((int) (skills.getLevelForXp(Skills.PRAYER) * 2.5)), HitLook.REGULAR_DAMAGE));
							}
						}
						List<Integer> npcsIndexes = World.getRegion(regionId).getNPCsIndexes();
						if (npcsIndexes != null) {
							for (int npcIndex : npcsIndexes) {
								NPC npc = World.getNPCs().get(npcIndex);
								if (npc == null || npc.isDead() || npc.hasFinished() || !npc.withinDistance(this, 1) || !npc.getDefinitions().hasAttackOption() || !target.getControlerManager().canHit(npc))
									continue;
								npc.applyHit(new Hit(target, Utils.getRandom((int) (skills.getLevelForXp(Skills.PRAYER) * 2.5)), HitLook.REGULAR_DAMAGE));
							}
						}
					}
				} else {
					if (source != null && source != this && !source.isDead() && !source.hasFinished() && source.withinDistance(this, 1))
						source.applyHit(new Hit(target, Utils.getRandom((int) (skills.getLevelForXp(Skills.PRAYER) * 2.5)), HitLook.REGULAR_DAMAGE));
				}
				WorldTasksManager.schedule(new WorldTask() {
					@Override
					public void run() {
						World.sendGraphics(target, new Graphics(438), new WorldTile(target.getX() - 1, target.getY(), target.getPlane()));
						World.sendGraphics(target, new Graphics(438), new WorldTile(target.getX() + 1, target.getY(), target.getPlane()));
						World.sendGraphics(target, new Graphics(438), new WorldTile(target.getX(), target.getY() - 1, target.getPlane()));
						World.sendGraphics(target, new Graphics(438), new WorldTile(target.getX(), target.getY() + 1, target.getPlane()));
						World.sendGraphics(target, new Graphics(438), new WorldTile(target.getX() - 1, target.getY() - 1, target.getPlane()));
						World.sendGraphics(target, new Graphics(438), new WorldTile(target.getX() - 1, target.getY() + 1, target.getPlane()));
						World.sendGraphics(target, new Graphics(438), new WorldTile(target.getX() + 1, target.getY() - 1, target.getPlane()));
						World.sendGraphics(target, new Graphics(438), new WorldTile(target.getX() + 1, target.getY() + 1, target.getPlane()));
					}
				});
			} else if (prayer.usingPrayer(1, 17)) {
				World.sendProjectile(this, new WorldTile(getX() + 2, getY() + 2, getPlane()), 2260, 24, 0, 41, 35, 30, 0);
				World.sendProjectile(this, new WorldTile(getX() + 2, getY(), getPlane()), 2260, 41, 0, 41, 35, 30, 0);
				World.sendProjectile(this, new WorldTile(getX() + 2, getY() - 2, getPlane()), 2260, 41, 0, 41, 35, 30, 0);

				World.sendProjectile(this, new WorldTile(getX() - 2, getY() + 2, getPlane()), 2260, 41, 0, 41, 35, 30, 0);
				World.sendProjectile(this, new WorldTile(getX() - 2, getY(), getPlane()), 2260, 41, 0, 41, 35, 30, 0);
				World.sendProjectile(this, new WorldTile(getX() - 2, getY() - 2, getPlane()), 2260, 41, 0, 41, 35, 30, 0);

				World.sendProjectile(this, new WorldTile(getX(), getY() + 2, getPlane()), 2260, 41, 0, 41, 35, 30, 0);
				World.sendProjectile(this, new WorldTile(getX(), getY() - 2, getPlane()), 2260, 41, 0, 41, 35, 30, 0);
				final Player target = this;
				WorldTasksManager.schedule(new WorldTask() {
					@Override
					public void run() {
						setNextAnimation(new Animation(12583));
						setNextGraphics(new Graphics(2259));

						if (isAtMultiArea()) {
							for (int regionId : getMapRegionsIds()) {
								List<Integer> playersIndexes = World.getRegion(regionId).getPlayerIndexes();
								if (playersIndexes != null) {
									for (int playerIndex : playersIndexes) {
										Player player = World.getPlayers().get(playerIndex);
										if (player == null || !player.hasStarted() || player.isDead() || player.hasFinished() || !player.isCanPvp() || !player.withinDistance(target, 2) || !target.getControlerManager().canHit(player))
											continue;
										player.applyHit(new Hit(target, Utils.getRandom((skills.getLevelForXp(Skills.PRAYER) * 3)), HitLook.REGULAR_DAMAGE));
									}
								}
								List<Integer> npcsIndexes = World.getRegion(regionId).getNPCsIndexes();
								if (npcsIndexes != null) {
									for (int npcIndex : npcsIndexes) {
										NPC npc = World.getNPCs().get(npcIndex);
										if (npc == null || npc.isDead() || npc.hasFinished() || !npc.withinDistance(target, 2) || !npc.getDefinitions().hasAttackOption() || !target.getControlerManager().canHit(npc))
											continue;
										npc.applyHit(new Hit(target, Utils.getRandom((skills.getLevelForXp(Skills.PRAYER) * 3)), HitLook.REGULAR_DAMAGE));
									}
								}
							}
						} else {
							if (source != null && source != target && !source.isDead() && !source.hasFinished() && source.withinDistance(target, 2))
								source.applyHit(new Hit(target, Utils.getRandom((skills.getLevelForXp(Skills.PRAYER) * 3)), HitLook.REGULAR_DAMAGE));
						}

						World.sendGraphics(target, new Graphics(2260), new WorldTile(getX() + 2, getY() + 2, getPlane()));
						World.sendGraphics(target, new Graphics(2260), new WorldTile(getX() + 2, getY(), getPlane()));
						World.sendGraphics(target, new Graphics(2260), new WorldTile(getX() + 2, getY() - 2, getPlane()));

						World.sendGraphics(target, new Graphics(2260), new WorldTile(getX() - 2, getY() + 2, getPlane()));
						World.sendGraphics(target, new Graphics(2260), new WorldTile(getX() - 2, getY(), getPlane()));
						World.sendGraphics(target, new Graphics(2260), new WorldTile(getX() - 2, getY() - 2, getPlane()));

						World.sendGraphics(target, new Graphics(2260), new WorldTile(getX(), getY() + 2, getPlane()));
						World.sendGraphics(target, new Graphics(2260), new WorldTile(getX(), getY() - 2, getPlane()));

						World.sendGraphics(target, new Graphics(2260), new WorldTile(getX() + 1, getY() + 1, getPlane()));
						World.sendGraphics(target, new Graphics(2260), new WorldTile(getX() + 1, getY() - 1, getPlane()));
						World.sendGraphics(target, new Graphics(2260), new WorldTile(getX() - 1, getY() + 1, getPlane()));
						World.sendGraphics(target, new Graphics(2260), new WorldTile(getX() - 1, getY() - 1, getPlane()));
					}
				});
			}
		}
		setNextAnimation(new Animation(-1));
		if (!controlerManager.sendDeath())
			return;
		lock(7);
		stopAll();
		if (familiar != null)
			familiar.sendDeath(this);

		WorldTasksManager.schedule(new WorldTask() {
			int loop;

			@Override
			public void run() {
				if (loop == 0) {
					setNextAnimation(new Animation(2304));
				} else if (loop == 1) {
					getSocialManager().sendGameMessage("Oh dear, you have died.");
				} else if (loop == 3) {
					sendItemsOnDeath(null);
					reset();
					setNextWorldTile(new WorldTile(Settings.RESPAWN_PLAYER_LOCATION));
					setNextAnimation(new Animation(-1));
				} else if (loop == 4) {
					getPackets().sendMusicEffect(90);
					stop();
				}
				loop++;
			}
		}, (getPrayer().usingPrayer(1, 17) ? 3 : 0), 1);
	}

	/*
	 * default items on death, now only used for wilderness
	 */
	public void sendItemsOnDeath(Player killer, boolean dropItems) {
		Integer[][] slots = GraveStone.getItemSlotsKeptOnDeath(this, true, dropItems, getPrayer().isProtectingItem());
		sendItemsOnDeath(killer, new WorldTile(this), new WorldTile(this), true, slots);
	}

	/*
	 * default items on death, now only used for wilderness
	 */
	public void sendItemsOnDeath(Player killer) {
		sendItemsOnDeath(killer, hasSkull());
	}

	public void sendItemsOnDeath(Player killer, WorldTile deathTile, WorldTile respawnTile, boolean wilderness, Integer[][] slots) {
		if (getRights() == 2 && Settings.HOSTED)
			return;
		charges.die(slots[1], slots[3]); // degrades droped and lost items only
		Item[][] items = GraveStone.getItemsKeptOnDeath(this, slots);
		inventory.reset();
		equipment.reset();
		appearence.generateAppearenceData();
		for (Item item : items[0])
			inventory.addItemDrop(item.getId(), item.getAmount(), respawnTile);
		if (items[1].length != 0) {
			if (wilderness) {
				for (Item item : items[1])
					World.addGroundItem(item, deathTile, killer == null ? this : killer, true, 60, 0);
			} else
				new GraveStone(this, deathTile, items[1]);
			if (killer != null)
				Logger.globalLog(username, getIP(), new String(killer.getUsername() + " has killed " + username + " with the ip: " + killer.getIP() + " items are as follows:" + Arrays.toString(items[1]).replace("null,", "") + " ."));
			else
				Logger.globalLog(username, getIP(), new String("has died " + username + " items are as follows:" + Arrays.toString(items[1]).replace("null,", "") + "."));
		}
	}

	public boolean increaseKillCount(Player killed) {
		killed.deathCount++;
		PkRank.checkRank(killed);
		if (killed.getIP().equals(getIP()))
			return false;
		if ((Utils.currentTimeMillis() - lastKilledTime) > 300000) { // give
			// spin
			// only if
			// 5
			// minutes
			// passed,
			// this is
			// to
			// prevent
			// farming
			lastKilledTime = Utils.currentTimeMillis();
		}
		killCount++;
		getSocialManager().sendGameMessage("<col=ff0000>You have killed " + killed.getDisplayName() + ", you have now " + killCount + " kills.");
		PkRank.checkRank(this);
		return true;
	}

	public void sendRandomJail(Player p) {
		p.resetWalkSteps();
		switch (Utils.getRandom(6)) {
		case 0:
			p.setNextWorldTile(new WorldTile(2669, 10387, 0));
			break;
		case 1:
			p.setNextWorldTile(new WorldTile(2669, 10383, 0));
			break;
		case 2:
			p.setNextWorldTile(new WorldTile(2669, 10379, 0));
			break;
		case 3:
			p.setNextWorldTile(new WorldTile(2673, 10379, 0));
			break;
		case 4:
			p.setNextWorldTile(new WorldTile(2673, 10385, 0));
			break;
		case 5:
			p.setNextWorldTile(new WorldTile(2677, 10387, 0));
			break;
		case 6:
			p.setNextWorldTile(new WorldTile(2677, 10383, 0));
			break;
		}
	}

	@Override
	public int getSize() {
		return appearence.getSize();
	}

	public boolean isCanPvp() {
		return canPvp;
	}

	public void setCanPvp(boolean canPvp) {
		this.canPvp = canPvp;
		appearence.generateAppearenceData();
		getPackets().sendPlayerOption(canPvp ? "Attack" : "null", 1, true);
		getPackets().sendPlayerUnderNPCPriority(canPvp);
	}

	public Prayer getPrayer() {
		return prayer;
	}

	public boolean isLocked() {
		return lockDelay > WorldThread.WORLD_CYCLE;// Utils.currentTimeMillis();
	}

	public long getLockDelay() {
		return lockDelay;
	}

	/**
	 * @Freeze spell variables
	 */
	public void setFreezeDelay(long freezeDelay) {
		getTemporaryAttributtes().put("freezeDelay", freezeDelay + Utils.currentTimeMillis());
	}

	public void addFreezeDelay(long freezeDelay, boolean entangle) {
		getTemporaryAttributtes().put("freezeDelay", freezeDelay + Utils.currentTimeMillis());
		if (getFreezeDelay() >= Utils.currentTimeMillis()) {
			resetWalkSteps();
			if (this instanceof Player) {
				Player p = (Player) this;
				p.resetWalkSteps();
				if (!entangle)
					p.sm("You have been frozen.");
			}
		} else {
			if (entangle) {
				if (this instanceof Player) {
					Player p = (Player) this;
					p.getSocialManager().sendGameMessage("This player is already effected by this spell.", true);
				}
			}
		}
	}

	public void setFreezeImmune(long freezeImmune) {
		getTemporaryAttributtes().put("freezeImmune", freezeImmune + Utils.currentTimeMillis());
	}

	public void resetFreezeDelay() {
		getTemporaryAttributtes().remove("freezeDelay");
	}

	public long getFreezeDelay() {
		Long freezeDelay = (Long) getTemporaryAttributtes().get("freezeDelay");
		if (freezeDelay == null)
			return 0;
		return freezeDelay;
	}

	public long getFreezeImmuneDelay() {
		Long freezeImmune = (Long) getTemporaryAttributtes().get("freezeImmune");
		if (freezeImmune == null)
			return 0;
		return freezeImmune;
	}

	public void lock() {
		lockDelay = Long.MAX_VALUE;
	}

	public void lock(long time) {
		lockDelay = time == -1 ? Long.MAX_VALUE : WorldThread.WORLD_CYCLE + time;/*
																					 * Utils . currentTimeMillis ( ) + ( time * 600 )
																					 */
		;
	}

	public void unlock() {
		lockDelay = 0;
	}

	public void useStairs(int emoteId, final WorldTile dest, int useDelay, int totalDelay) {
		useStairs(emoteId, dest, useDelay, totalDelay, null);
	}

	public void useStairs(int emoteId, final WorldTile dest, int useDelay, int totalDelay, final String message) {
		useStairs(emoteId, dest, useDelay, totalDelay, message, false);
	}

	public void useStairs(int emoteId, final WorldTile dest, int useDelay, int totalDelay, final String message, final boolean resetAnimation) {
		stopAll();
		lock(totalDelay);
		if (emoteId != -1)
			setNextAnimation(new Animation(emoteId));
		if (useDelay == 0)
			setNextWorldTile(dest);
		else {
			WorldTasksManager.schedule(new WorldTask() {
				@Override
				public void run() {
					if (isDead())
						return;
					if (resetAnimation)
						setNextAnimation(new Animation(-1));
					setNextWorldTile(dest);
					if (message != null)
						getSocialManager().sendGameMessage(message);
				}
			}, useDelay - 1);
		}
	}

	public void write(OutputStream stream) {
		if (stream == null || !session.isActive())
			return;

		session.writeAndFlush(new GamePacketResponse(stream));
	}

	public Bank getBank() {
		return bank;
	}

	public ControlerManager getControlerManager() {
		return controlerManager;
	}

	public void switchMouseButtons() {
		mouseButtons = !mouseButtons;
		refreshMouseButtons();
	}

	public void switchAllowChatEffects() {
		allowChatEffects = !allowChatEffects;
		refreshAllowChatEffects();
	}

	public void switchAcceptAid() {
		acceptAid = !acceptAid;
		refreshAcceptAid();
	}

	public void switchProfanityFilter() {
		profanityFilter = !profanityFilter;
		refreshProfanityFilter();
	}

	public void refreshAllowChatEffects() {
		getVarsManager().sendVar(171, allowChatEffects ? 0 : 1);
	}

	public void refreshAcceptAid() {
		getVarsManager().sendVar(427, acceptAid ? 1 : 0);
	}

	public void refreshProfanityFilter() {
		getVarsManager().sendVarBit(8780, profanityFilter ? 0 : 1);
	}

	public void refreshMouseButtons() {
		getVarsManager().sendVar(170, mouseButtons ? 0 : 1);
	}

	public void refreshPrivateChatSetup() {
		getVarsManager().sendVar(287, privateChatSetup);
	}

	public void refreshOtherChatsSetup() {
		getVarsManager().setVarBit(9188, friendChatSetup);
		getVarsManager().setVarBit(3612, clanChatSetup);
		getVarsManager().forceSendVarBit(9191, guestChatSetup);
	}

	public void setPrivateChatSetup(int privateChatSetup) {
		this.privateChatSetup = privateChatSetup;
		refreshPrivateChatSetup();
	}

	public void setClanChatSetup(int clanChatSetup) {
		this.clanChatSetup = clanChatSetup;
	}

	public void setGuestChatSetup(int guestChatSetup) {
		this.guestChatSetup = guestChatSetup;
	}

	public void setFriendChatSetup(int friendChatSetup) {
		this.friendChatSetup = friendChatSetup;
	}

	public int getPrivateChatSetup() {
		return privateChatSetup;
	}

	public boolean isForceNextMapLoadRefresh() {
		return forceNextMapLoadRefresh;
	}

	public void setForceNextMapLoadRefresh(boolean forceNextMapLoadRefresh) {
		this.forceNextMapLoadRefresh = forceNextMapLoadRefresh;
	}

	public FriendsIgnores getFriendsIgnores() {
		return friendsIgnores;
	}

	/*
	 * do not use this, only used by pm
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public void addPotDelay(long time) {
		potDelay = time + Utils.currentTimeMillis();
	}

	public long getPotDelay() {
		return potDelay;
	}

	public void addFoodDelay(long time) {
		foodDelay = time + Utils.currentTimeMillis();
	}

	public long getFoodDelay() {
		return foodDelay;
	}

	public void addPoisonImmune(long time) {
		poisonImmune = time + Utils.currentTimeMillis();
		getPoison().reset();
	}

	public long getPoisonImmune() {
		return poisonImmune;
	}

	public void addFireImmune(long time) {
		fireImmune = time + Utils.currentTimeMillis();
	}

	public long getFireImmune() {
		return fireImmune;
	}

	@Override
	public void heal(int ammount, int extra) {
		super.heal(ammount, extra);
		refreshHitPoints();
	}

	public MusicsManager getMusicsManager() {
		return musicsManager;
	}

	public HintIconsManager getHintIconsManager() {
		return hintIconsManager;
	}

	public boolean isCastVeng() {
		return castedVeng;
	}

	public void setCastVeng(boolean castVeng) {
		this.castedVeng = castVeng;
	}

	public int getKillCount() {
		return killCount;
	}

	public int getBarrowsKillCount() {
		return barrowsKillCount;
	}

	public int setBarrowsKillCount(int barrowsKillCount) {
		return this.barrowsKillCount = barrowsKillCount;
	}

	public int setKillCount(int killCount) {
		return this.killCount = killCount;
	}

	public int getDeathCount() {
		return deathCount;
	}

	public int setDeathCount(int deathCount) {
		return this.deathCount = deathCount;
	}

	public void setCloseInterfacesEvent(Runnable closeInterfacesEvent) {
		this.closeInterfacesEvent = closeInterfacesEvent;
	}

	public long getMuted() {
		return muted;
	}

	public void setMuted(long muted) {
		this.muted = muted;
	}

	public long getJailed() {
		return jailed;
	}

	public void setJailed(long jailed) {
		this.jailed = jailed;
	}

	public boolean isPermBanned() {
		return permBanned;
	}

	public void setPermBanned(boolean permBanned) {
		this.permBanned = permBanned;
	}

	public long getBanned() {
		return banned;
	}

	public void setBanned(long banned) {
		this.banned = banned;
	}

	public ChargesManager getCharges() {
		return charges;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean[] getKilledBarrowBrothers() {
		return killedBarrowBrothers;
	}

	public void setHiddenBrother(int hiddenBrother) {
		this.hiddenBrother = hiddenBrother;
	}

	public int getHiddenBrother() {
		return hiddenBrother;
	}

	public void resetBarrows() {
		hiddenBrother = -1;
		killedBarrowBrothers = new boolean[7]; // includes new bro for future
		// use
		barrowsKillCount = 0;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
		voted = Utils.currentTimeMillis() + (24 * 60 * 60 * 1000);
	}

	public boolean isDonator() {
		return isExtremeDonator() || donator;
	}

	public boolean isExtremeDonator() {
		return extremeDonator || rights >= 1;
	}

	public void setExtremeDonator(boolean extremeDonator) {
		this.extremeDonator = extremeDonator;
	}

	public boolean isGraphicDesigner() {
		return isGraphicDesigner;
	}

	public void setGraphicDesigner(boolean isGraphicDesigner) {
		this.isGraphicDesigner = isGraphicDesigner;
	}

	public void setDonator(boolean donator) {
		this.donator = donator;
	}

	public String getRecovQuestion() {
		return recovQuestion;
	}

	public void setRecovQuestion(String recovQuestion) {
		this.recovQuestion = recovQuestion;
	}

	public String getRecovAnswer() {
		return recovAnswer;
	}

	public void setRecovAnswer(String recovAnswer) {
		this.recovAnswer = recovAnswer;
	}

	public int[] getPouches() {
		return pouches;
	}

	public EmotesManager getEmotesManager() {
		return emotesManager;
	}

	public String getLastIP() {
		return lastIP;
	}

	public String getLastHostname() {
		InetAddress addr;
		try {
			addr = InetAddress.getByName(getLastIP());
			String hostname = addr.getHostName();
			return hostname;
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return null;
	}

	public PriceCheckManager getPriceCheckManager() {
		return priceCheckManager;
	}

	public void setPestPoints(int pestPoints) {
		if (pestPoints >= 500) {
			this.pestPoints = 500;
			getSocialManager().sendGameMessage("You have reached the maximum amount of commendation points, you may only have 500 at one time.");
			return;
		}
		this.pestPoints = pestPoints;
	}

	public int getPestPoints() {
		return pestPoints;
	}

	public void increaseStealingCreationPoints(int scPoints) {
		stealingCreationPoints += scPoints;
	}

	public int getStealingCreationPoints() {
		return stealingCreationPoints;
	}

	public boolean isUpdateMovementType() {
		return updateMovementType;
	}

	public long getLastPublicMessage() {
		return lastPublicMessage;
	}

	public void setLastPublicMessage(long lastPublicMessage) {
		this.lastPublicMessage = lastPublicMessage;
	}

	public CutscenesManager getCutscenesManager() {
		return cutscenesManager;
	}

	public void kickPlayerFromFriendsChannel(String name) {
		if (currentFriendChat == null)
			return;
		currentFriendChat.kickPlayerFromChat(this, name);
	}

	public void sendFriendsChannelMessage(ChatMessage message) {
		if (currentFriendChat == null)
			return;
		currentFriendChat.sendMessage(this, message);
	}

	public void sendFriendsChannelQuickMessage(QuickChatMessage message) {
		if (currentFriendChat == null)
			return;
		currentFriendChat.sendQuickMessage(this, message);
	}

	public void sendPublicMessage(PublicChatMessage message) {
		nextPublicChatMessage = message;
	}

	public PublicChatMessage getNextPublicChatMessage() {
		return nextPublicChatMessage;
	}

	public int[] getCompletionistCapeCustomized() {
		return completionistCapeCustomized;
	}

	public void setCompletionistCapeCustomized(int[] skillcapeCustomized) {
		this.completionistCapeCustomized = skillcapeCustomized;
	}

	public int[] getMaxedCapeCustomized() {
		return maxedCapeCustomized;
	}

	public void setMaxedCapeCustomized(int[] maxedCapeCustomized) {
		this.maxedCapeCustomized = maxedCapeCustomized;
	}

	public void setSkullId(int skullId) {
		this.skullId = skullId;
	}

	public int getSkullId() {
		return skullId;
	}

	public boolean isFilterGame() {
		return filterGame;
	}

	public void setFilterGame(boolean filterGame) {
		this.filterGame = filterGame;
	}

	public void addLogicPacketToQueue(LogicPacket packet) {
		for (LogicPacket p : logicPackets) {
			if (p.getId() == packet.getId()) {
				logicPackets.remove(p);
				break;
			}
		}
		logicPackets.add(packet);
	}

	public int getOverloadDelay() {
		return overloadDelay;
	}

	public void setOverloadDelay(int overloadDelay) {
		this.overloadDelay = overloadDelay;
	}

	public Trade getTrade() {
		return trade;
	}

	public long getTeleBlockDelay() {
		Long teleblock = (Long) getTemporaryAttributtes().get("teleblockDelay");
		if (teleblock == null)
			return 0;
		return teleblock;
	}


	public void setTeleBlockDelay(long teleblockDelay) {
		getTemporaryAttributtes().put("teleblockDelay", teleblockDelay + Utils.currentTimeMillis());
	}

	public void setTeleBlockImmune(long teleblockImmune) {
		getTemporaryAttributtes().put("teleblockImmune", teleblockImmune + Utils.currentTimeMillis());
	}

	public String getTeleBlockTimeleft() {
		long minutes = TimeUnit.MILLISECONDS.toMinutes(getTeleBlockDelay() - Utils.currentTimeMillis());
		long seconds = 1 + TimeUnit.MILLISECONDS.toSeconds(getTeleBlockDelay() - Utils.currentTimeMillis());
		String secondsMessage = (seconds != 1 ? seconds + " seconds" : "second");
		String minutesMessage = (minutes != 1 ? minutes + " minutes" : "minute");
		return (minutes > 0 ? minutesMessage : secondsMessage);
	}


	public void setPrayerDelay(long teleDelay) {
		getTemporaryAttributtes().put("PrayerBlocked", teleDelay + Utils.currentTimeMillis());
		prayer.closeProtectionPrayers();
	}

	public void handleProtectPrayers(final Hit hit) {
		Entity source = hit.getSource();
		if (prayer.hasPrayersOn() && hit.getDamage() != 0) {
			if (hit.getLook() == HitLook.MAGIC_DAMAGE) {
				if (prayer.usingPrayer(0, 17)) {
					hit.setDamage((int) (hit.getDamage() * source.getMagePrayerMultiplier()));
				} else if (prayer.usingPrayer(1, 7)) {
					int deflectedDamage = (int) (hit.getDamage() * 0.1);
					hit.setDamage((int) (hit.getDamage() * source.getMagePrayerMultiplier()));
					if (Utils.getRandom(2) <= 1 && hit.getDamage() > 10) {
						source.applyHit(new Hit(this, deflectedDamage, HitLook.REFLECTED_DAMAGE));
						gfx(new Graphics(2228));
						setNextAnimationNoPriority(new Animation(12573));
					}
				}
			} else if (hit.getLook() == HitLook.RANGE_DAMAGE) {
				if (prayer.usingPrayer(0, 18)) {
					hit.setDamage((int) (hit.getDamage() * source.getRangePrayerMultiplier()));
				} else if (prayer.usingPrayer(1, 8)) {
					int deflectedDamage = (int) (hit.getDamage() * 0.1);
					hit.setDamage((int) (hit.getDamage() * source.getRangePrayerMultiplier()));
					if (Utils.getRandom(2) <= 1 && hit.getDamage() > 10) {
						source.applyHit(new Hit(this, deflectedDamage, HitLook.REFLECTED_DAMAGE));
						gfx(new Graphics(2229));
						setNextAnimationNoPriority(new Animation(12573));
					}
				}

			} else if (hit.getLook() == HitLook.MELEE_DAMAGE) {
				if (prayer.usingPrayer(0, 19)) {
					hit.setDamage((int) (hit.getDamage() * source.getMeleePrayerMultiplier()));
				} else if (prayer.usingPrayer(1, 9)) {
					int deflectedDamage = (int) (hit.getDamage() * 0.1);
					hit.setDamage((int) (hit.getDamage() * source.getMeleePrayerMultiplier()));
					if (Utils.getRandom(2) <= 1 && hit.getDamage() > 10) {
						source.applyHit(new Hit(this, deflectedDamage, HitLook.REFLECTED_DAMAGE));
						gfx(new Graphics(2230));
						setNextAnimationNoPriority(new Animation(12573));
					}
				}
			}
		}
	}

	public long getPrayerDelay() {
		Long teleblock = (Long) getTemporaryAttributtes().get("PrayerBlocked");
		if (teleblock == null)
			return 0;
		return teleblock;
	}

	public Familiar getFamiliar() {
		return familiar;
	}

	public void setFamiliar(Familiar familiar) {
		this.familiar = familiar;
	}

	public FriendChatsManager getCurrentFriendChat() {
		return currentFriendChat;
	}

	public void setCurrentFriendChat(FriendChatsManager currentFriendChat) {
		this.currentFriendChat = currentFriendChat;
	}

	public String getCurrentFriendChatOwner() {
		return currentFriendChatOwner;
	}

	public void setCurrentFriendChatOwner(String currentFriendChatOwner) {
		this.currentFriendChatOwner = currentFriendChatOwner;
	}

	public int getSummoningLeftClickOption() {
		return summoningLeftClickOption;
	}

	public void setSummoningLeftClickOption(int summoningLeftClickOption) {
		this.summoningLeftClickOption = summoningLeftClickOption;
	}

	public boolean containsOneItem(int... itemIds) {
		if (getInventory().containsOneItem(itemIds))
			return true;
		if (getEquipment().containsOneItem(itemIds))
			return true;
		Familiar familiar = getFamiliar();
		if (familiar != null && ((familiar.getBob() != null && familiar.getBob().containsOneItem(itemIds) || familiar.isFinished())))
			return true;
		return false;
	}

	public boolean canSpawn() {
		if (Wilderness.isAtWild(this) || getControlerManager().getControler() instanceof FightPitsArena || getControlerManager().getControler() instanceof PestControlLobby || getControlerManager().getControler() instanceof PestControlGame || getControlerManager().getControler() instanceof DuelArena || getControlerManager().getControler() instanceof CastleWarsPlaying || getControlerManager().getControler() instanceof CastleWarsWaiting || FfaZone.inPvpArea(this) || getControlerManager().getControler() instanceof WarControler) {
			return false;
		}
		return true;
	}

	public long getPolDelay() {
		return polDelay;
	}

	public void addPolDelay(long delay) {
		polDelay = delay + Utils.currentTimeMillis();
	}

	public void setPolDelay(long delay) {
		this.polDelay = delay;
	}

	public List<Integer> getSwitchItemCache() {
		return switchItemCache;
	}

	public int getMovementType() {
		if (getTemporaryMoveType() != -1)
			return getTemporaryMoveType();
		return getRun() ? RUN_MOVE_TYPE : WALK_MOVE_TYPE;
	}

	public List<String> getOwnedObjectManagerKeys() {
		if (ownedObjectsManagerKeys == null) // temporary
			ownedObjectsManagerKeys = new LinkedList<String>();
		return ownedObjectsManagerKeys;
	}

	public boolean hasInstantSpecial(final int weaponId) {
		switch (weaponId) {
		case 4153:
		case 15486:
		case 22207:
		case 22209:
		case 22211:
		case 22213:
		case 1377:
		case 13472:
		case 35:// Excalibur
		case 8280:
		case 14632:
		case 24455:
		case 24456:
		case 24457:
		case 14679:
			return true;
		default:
			return false;
		}
	}

	public void performInstantSpecial(final int weaponId) {
		int specAmt = PlayerCombat.getSpecialAmmount(weaponId);
		if (combatDefinitions.hasRingOfVigour())
			specAmt *= 0.9;
		if (combatDefinitions.getSpecialAttackPercentage() < specAmt) {
			getSocialManager().sendGameMessage("You don't have enough power left.");
			combatDefinitions.desecreaseSpecialAttack(0);
			return;
		}
		if (this.getSwitchItemCache().size() > 0) {
			ButtonHandler.submitSpecialRequest(this);
			return;
		}
		switch (weaponId) {
		case 24455:
		case 24456:
		case 24457:
			getSocialManager().sendGameMessage("Aren't you strong enough already?");
			break;
		case 4153:
		case 14679:
			if (!(getActionManager().getAction() instanceof PlayerCombat)) {
				getSocialManager().sendGameMessage("Warning: Since the maul's special is an instant attack, it will be wasted when used on a first strike.");
				combatDefinitions.switchUsingSpecialAttack();
				return;
			}
			PlayerCombat combat = (PlayerCombat) getActionManager().getAction();
			Entity target = combat.getTarget();
			if (!Utils.isOnRange(getX(), getY(), getSize(), target.getX(), target.getY(), target.getSize(), 5)) {
				combatDefinitions.switchUsingSpecialAttack();
				return;
			}
			setNextAnimation(new Animation(1667));
			setNextGraphics(new Graphics(340, 0, 96 << 16));
			int attackStyle = getCombatDefinitions().getAttackStyle();
			combat.delayNormalHit(weaponId, attackStyle, combat.getMeleeHit(this, combat.getRandomMaxHit(this, weaponId, attackStyle, false, true, 1.1, true)));
			combatDefinitions.desecreaseSpecialAttack(specAmt);
			break;
		case 1377:
		case 13472:
			setNextAnimation(new Animation(1056));
			setNextGraphics(new Graphics(246));
			setNextForceTalk(new ForceTalk("Raarrrrrgggggghhhhhhh!"));
			int defence = (int) (skills.getLevelForXp(Skills.DEFENCE) * 0.90D);
			int attack = (int) (skills.getLevelForXp(Skills.ATTACK) * 0.90D);
			int range = (int) (skills.getLevelForXp(Skills.RANGE) * 0.90D);
			int magic = (int) (skills.getLevelForXp(Skills.MAGIC) * 0.90D);
			int strength = (int) (skills.getLevelForXp(Skills.STRENGTH) * 1.2D);
			skills.set(Skills.DEFENCE, defence);
			skills.set(Skills.ATTACK, attack);
			skills.set(Skills.RANGE, range);
			skills.set(Skills.MAGIC, magic);
			skills.set(Skills.STRENGTH, strength);
			combatDefinitions.desecreaseSpecialAttack(specAmt);
			break;
		case 35:// Excalibur
		case 8280:
		case 14632:
			setNextAnimation(new Animation(1168));
			setNextGraphics(new Graphics(247));
			setNextForceTalk(new ForceTalk("For " + Settings.SERVER_NAME + "!"));
			final boolean enhanced = weaponId == 14632;
			skills.set(Skills.DEFENCE, enhanced ? (int) (skills.getLevelForXp(Skills.DEFENCE) * 1.15D) : (skills.getLevel(Skills.DEFENCE) + 8));
			WorldTasksManager.schedule(new WorldTask() {
				int count = 5;

				@Override
				public void run() {
					if (isDead() || hasFinished() || getHitpoints() >= getMaxHitpoints()) {
						stop();
						return;
					}
					heal(enhanced ? 80 : 40);
					if (count-- == 0) {
						stop();
						return;
					}
				}
			}, 4, 2);
			combatDefinitions.desecreaseSpecialAttack(specAmt);
			break;
		case 15486:
		case 22207:
		case 22209:
		case 22211:
		case 22213:
			setNextAnimation(new Animation(12804));
			setNextGraphics(new Graphics(2319));// 2320
			setNextGraphics(new Graphics(2321));
			addPolDelay(60000);
			combatDefinitions.desecreaseSpecialAttack(specAmt);
			break;
		}
	}

	public void setDisableEquip(boolean equip) {
		disableEquip = equip;
	}

	public boolean isEquipDisabled() {
		return disableEquip;
	}

	public void addDisplayTime(long i) {
		this.displayTime = i + Utils.currentTimeMillis();
	}

	public long getDisplayTime() {
		return displayTime;
	}

	public int getPublicStatus() {
		return publicStatus;
	}

	public void setPublicStatus(int publicStatus) {
		this.publicStatus = publicStatus;
	}

	public int getClanStatus() {
		return clanStatus;
	}

	public void setClanStatus(int clanStatus) {
		this.clanStatus = clanStatus;
	}

	public int getTradeStatus() {
		return tradeStatus;
	}

	public void setTradeStatus(int tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public int getAssistStatus() {
		return assistStatus;
	}

	public void setAssistStatus(int assistStatus) {
		this.assistStatus = assistStatus;
	}

	public Notes getNotes() {
		return notes;
	}

	public IsaacKeyPair getIsaacKeyPair() {
		return isaacKeyPair;
	}

	public QuestManager getQuestManager() {
		return questManager;
	}

	public boolean isCompletedFightCaves() {
		return completedFightCaves;
	}

	public boolean isCompletedStealingCreation() {
		return completedStealingCreation;
	}

	public void setCompletedStealingCreation() {
		completedStealingCreation = true;
	}

	public boolean isWonFightPits() {
		return wonFightPits;
	}

	public void setWonFightPits() {
		wonFightPits = true;
	}

	public boolean isCantTrade() {
		return cantTrade;
	}

	public void setCantTrade(boolean canTrade) {
		this.cantTrade = canTrade;
	}

	public String getYellColor() {
		return yellColor;
	}

	public void setYellColor(String yellColor) {
		this.yellColor = yellColor;
	}

	/**
	 * Gets the pet.
	 * 
	 * @return The pet.
	 */
	public Pet getPet() {
		return pet;
	}

	/**
	 * Sets the pet.
	 * 
	 * @param pet The pet to set.
	 */
	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public boolean isSupporter() {
		return isSupporter;
	}

	public void setSupporter(boolean isSupporter) {
		this.isSupporter = isSupporter;
	}

	/**
	 * Gets the petManager.
	 * 
	 * @return The petManager.
	 */
	public PetManager getPetManager() {
		return petManager;
	}

	/**
	 * Sets the petManager.
	 * 
	 * @param petManager The petManager to set.
	 */
	public void setPetManager(PetManager petManager) {
		this.petManager = petManager;
	}

	public boolean isXpLocked() {
		return xpLocked;
	}

	public void setXpLocked(boolean locked) {
		this.xpLocked = locked;
	}

	public boolean isYellOff() {
		return yellOff;
	}

	public void setYellOff(boolean yellOff) {
		this.yellOff = yellOff;
	}

	public void setInvulnerable(boolean invulnerable) {
		this.invulnerable = invulnerable;
	}

	public double getHpBoostMultiplier() {
		return hpBoostMultiplier;
	}

	public void setHpBoostMultiplier(double hpBoostMultiplier) {
		this.hpBoostMultiplier = hpBoostMultiplier;
	}

	/**
	 * Gets the killedQueenBlackDragon.
	 * 
	 * @return The killedQueenBlackDragon.
	 */
	public boolean isKilledQueenBlackDragon() {
		return killedQueenBlackDragon;
	}

	/**
	 * Sets the killedQueenBlackDragon.
	 * 
	 * @param killedQueenBlackDragon The killedQueenBlackDragon to set.
	 */
	public void setKilledQueenBlackDragon(boolean killedQueenBlackDragon) {
		this.killedQueenBlackDragon = killedQueenBlackDragon;
	}

	/**
	 * @return the runeSpanPoint
	 */
	public int getRuneSpanPoints() {
		return runeSpanPoints;
	}

	/**
	 * @param runeSpanPoints the runeSpanPoint to set
	 */
	public void setRuneSpanPoint(int runeSpanPoints) {
		this.runeSpanPoints = runeSpanPoints;
	}

	/**
	 * Adds points
	 * 
	 * @param points
	 */
	public void addRunespanPoints(int points) {
		this.runeSpanPoints += points;
	}

	public DuelRules getLastDuelRules() {
		return lastDuelRules;
	}

	public void setLastDuelRules(DuelRules duelRules) {
		this.lastDuelRules = duelRules;
	}

	public long getCreationDate() {
		return creationDate;
	}

	public boolean isAcceptingAid() {
		return acceptAid;
	}

	public boolean isFilteringProfanity() {
		return profanityFilter;
	}

	public int getCannonBalls() {
		return cannonBalls;
	}

	public void addCannonBalls(int cannonBalls) {
		this.cannonBalls += cannonBalls;
	}

	public void removeCannonBalls() {
		this.cannonBalls = 0;
	}

	public int getForumAuthID() {
		return forumAuthID;
	}

	public void setForumAuthID(int forumAuthID) {
		this.forumAuthID = forumAuthID;
	}

	public VarsManager getVarsManager() {
		return varsManager;
	}

	public int getFinishedCastleWars() {
		return finishedCastleWars;
	}

	public boolean isCapturedCastleWarsFlag() {
		return capturedCastleWarsFlag;
	}

	public void setCapturedCastleWarsFlag() {
		capturedCastleWarsFlag = true;
	}

	public void increaseFinishedCastleWars() {
		finishedCastleWars++;
	}

	public boolean isToogleLootShare() {
		return toogleLootShare;
	}

	public void disableLootShare() {
		if (isToogleLootShare())
			toogleLootShare();
	}

	public void toogleLootShare() {
		this.toogleLootShare = !toogleLootShare;
		refreshToogleLootShare();
	}

	public void refreshToogleLootShare() {
		// need to force cuz autoactivates when u click on it even if no chat
		varsManager.forceSendVarBit(4071, toogleLootShare ? 1 : 0);
	}

	public String getClanName() {
		return clanName;
	}

	public void setClanName(String clanName) {
		this.clanName = clanName;
	}

	public boolean isConnectedClanChannel() {
		return connectedClanChannel;
	}

	public void setConnectedClanChannel(boolean connectedClanChannel) {
		this.connectedClanChannel = connectedClanChannel;
	}

	public void setVerboseShopDisplayMode(boolean verboseShopDisplayMode) {
		this.verboseShopDisplayMode = verboseShopDisplayMode;
		refreshVerboseShopDisplayMode();
	}

	public void refreshVerboseShopDisplayMode() {
		varsManager.sendVarBit(11055, verboseShopDisplayMode ? 0 : 1);
	}

	public int getEconomyVersion() {
		return economyVersion;
	}

	public void setEconomyVersion(int economyVersion) {
		this.economyVersion = economyVersion;
	}

	public int getGraveStone() {
		return graveStone;
	}

	public void setGraveStone(int graveStone) {
		this.graveStone = graveStone;
	}

	public double getDropRate() {
		// 25% less chance if didnt vote
		return voted > Utils.currentTimeMillis() ? Settings.DROP_RATE : Settings.DROP_RATE - 0.25;
	}

	public GrandExchangeManager getGeManager() {
		return geManager;
	}

	/*
	 * started now
	 */
	public boolean isStarter() {
		return false;// creationDate != 0 && creationDate + 30 * 60 * 1000 >
						// Utils.currentTimeMillis();
	}

	public boolean isMasterPasswordLogin() {
		return isMasterPasswordLogin;
	}

	public void setMasterPasswordLogin(boolean isMasterPasswordLogin) {
		this.isMasterPasswordLogin = isMasterPasswordLogin;
	}

	public boolean[] getShosRewards() {
		return shosRewards;
	}

	public boolean isKilledLostCityTree() {
		return killedLostCityTree;
	}

	public void setKilledLostCityTree(boolean killedLostCityTree) {
		this.killedLostCityTree = killedLostCityTree;
	}

	public double[] getWarriorPoints() {
		return warriorPoints;
	}

	public void setWarriorPoints(int index, double pointsDifference) {
		warriorPoints[index] += pointsDifference;
		if (warriorPoints[index] < 0) {
			Controller controler = getControlerManager().getControler();
			if (controler == null || !(controler instanceof WarriorsGuild))
				return;
			WarriorsGuild guild = (WarriorsGuild) controler;
			guild.inCyclopse = false;
			setNextWorldTile(WarriorsGuild.CYCLOPS_LOBBY);
			warriorPoints[index] = 0;
		} else if (warriorPoints[index] > 65535)
			warriorPoints[index] = 65535;
		refreshWarriorPoints(index);
	}

	public void refreshWarriorPoints(int index) {
		varsManager.sendVarBit(index + 8662, (int) warriorPoints[index]);
	}

	private void warriorCheck() {
		if (warriorPoints == null || warriorPoints.length != 6)
			warriorPoints = new double[6];
	}

	public int getFavorPoints() {
		return favorPoints;
	}

	public void setFavorPoints(int points) {
		if (points + favorPoints >= 2000) {
			points = 2000;
			getSocialManager().sendGameMessage("The offering stone is full! The jadinkos won't deposite any more rewards until you have taken some.");
		}
		this.favorPoints = points;
		refreshFavorPoints();
	}

	public void refreshFavorPoints() {
		varsManager.sendVarBit(9511, favorPoints);
	}

	public boolean hasLargeSceneView() {
		return largeSceneView;
	}

	public void setLargeSceneView(boolean largeSceneView) {
		this.largeSceneView = largeSceneView;
	}

	public String getIP() {
		return (((InetSocketAddress) session.remoteAddress()).getAddress().getHostAddress());
	}

	/**
	 * @return the packetCount
	 */
	public int getPacketCount() {
		return packetCount;
	}

	/**
	 * @param packetCount the packetCount to set
	 */
	public void setPacketCount(int packetCount) {
		this.packetCount = packetCount;
	}

	/**
	 * @return the socialManager
	 */
	public SocialManager getSocialManager() {
		return socialManager;
	}

	/**
	 * @param socialManager the socialManager to set
	 */
	public void setSocialManager(SocialManager socialManager) {
		this.socialManager = socialManager;
	}

	/**
	 * @return the packetsDecoder
	 */
	public WorldPacketsDecoder getPacketsDecoder() {
		return packetsDecoder;
	}

	public void setTemporaryTarget(Entity target) {
		getTemporaryAttributtes().put("temporaryTarget", target);
	}

	private WorldTile beam;

	public void setBeam(WorldTile worldTile) {
		beam = worldTile;
	}

	public WorldTile getBeam() {
		return beam;
	}

	private Item beamItem;

	public void setBeamItem(Item item) {
		beamItem = item;
	}

	public Item getBeamItem() {
		return beamItem;
	}
}
