package com.rs.game.player.content;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.TimerTask;

import com.rs.Launcher;
import com.rs.Settings;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.game.Animation;
import com.rs.game.ForceTalk;
import com.rs.game.Graphics;
import com.rs.game.Hit;
import com.rs.game.Hit.HitLook;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.npc.NPC;
import com.rs.game.player.Player;
import com.rs.game.player.Ranks;
import com.rs.game.player.Skills;
import com.rs.game.player.VariableKeys;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;
import com.rs.utils.Censor;
import com.rs.utils.Encrypt;
import com.rs.utils.IPBanL;
import com.rs.utils.SerializableFilesManager;
import com.rs.utils.Utils;

/*
 * doesnt let it be extended
 */
public final class Commands {

	/*
	 * all console commands only for admin, chat commands processed if they not processed by console
	 */

	/**
	 * returns if command was processed
	 */
	public static boolean processCommand(Player player, String command, boolean console, boolean clientCommand) {
		if (command.length() == 0)
			return false;
		String[] cmd = command.toLowerCase().split(" ");
		if (cmd.length == 0)
			return false;
		if (player.getPlayerRank().getRank()[0] == Ranks.Rank.DEVELOPER
				&& (processAdminCommand(player, cmd, console, clientCommand))) {
			archiveLogs(player, cmd);
			return true;
		}
		return processNormalCommand(player, cmd, console, clientCommand);
	}

	public static boolean processPunishmentCommand(final Player player, String[] cmd, boolean console, boolean clientCommand) {
		if (clientCommand)
			return false;

		switch (cmd[0].toLowerCase()) {
		case "spawnnpcs":
			for (int i = 0; i < Integer.parseInt(cmd[2]); i++)
				World.spawnNPC(Integer.parseInt(cmd[1]), player, -1, true, true);
			return true;
		case "nexcontroler":
			player.getControlerManager().startControler("ZGDControler");
			return true;
		case "changepassother":
			if (player.getRights() < 2) {
				player.getSocialManager().sendGameMessage("Admin+ only!");
				return true;
			}

			String name = cmd[1];
			Player target = SerializableFilesManager.loadPlayer(Utils.formatPlayerNameForProtocol(name));
			if (target == null) {
				player.getSocialManager().sendGameMessage("Target not found.");
				return true;
			}
			target.setUsername(Utils.formatPlayerNameForProtocol(name));
			target.setPassword(Encrypt.encryptSHA1(cmd[2]));
			player.getSocialManager().sendGameMessage("Password changed.");
			SerializableFilesManager.savePlayer(target);
			return true;
		case "ipban":
			if (player.getRights() < 1) {
				player.getSocialManager().sendGameMessage("Mod+ only!");
				return true;
			}

			name = "";
			for (int i = 1; i < cmd.length; i++)
				name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			target = World.getPlayerByDisplayName(name);
			boolean loggedIn = true;
			if (target == null) {
				target = SerializableFilesManager.loadPlayer(Utils.formatPlayerNameForProtocol(name));
				if (target != null)
					target.setUsername(Utils.formatPlayerNameForProtocol(name));
				loggedIn = false;
			}
			if (target != null) {
				if (target.getRights() == 2)
					return true;
				IPBanL.ban(target, loggedIn);
				player.getSocialManager().sendGameMessage("You've permanently ipbanned " + (loggedIn ? target.getDisplayName() : name) + ".");
			} else {
				player.getSocialManager().sendGameMessage("Couldn't find player " + name + ".");
			}
			return true;
		case "permban":
			if (player.getRights() < 1) {
				player.getSocialManager().sendGameMessage("Mod+ only!");
				return true;
			}

			name = "";
			for (int i = 1; i < cmd.length; i++)
				name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			target = World.getPlayerByDisplayName(name);
			if (target != null) {
				if (target.getRights() == 2)
					return true;
				target.setPermBanned(true);
				target.getSocialManager().sendGameMessage("You've been perm banned by " + Utils.formatPlayerNameForDisplay(player.getUsername()) + ".");
				player.getSocialManager().sendGameMessage("You have perm banned: " + target.getDisplayName() + ".");
				target.getSession().close();
				SerializableFilesManager.savePlayer(target);
			} else {
				target = SerializableFilesManager.loadPlayer(Utils.formatPlayerNameForProtocol(name));
				if (target.getRights() == 2)
					return true;
				target.setPermBanned(true);
				player.getSocialManager().sendGameMessage("You have perm banned: " + Utils.formatPlayerNameForDisplay(name) + ".");
				SerializableFilesManager.savePlayer(target);
			}
			return true;
		case "ban":
			if (player.getRights() < 1) {
				player.getSocialManager().sendGameMessage("Mod+ only!");
				return true;
			}

			name = "";
			for (int i = 1; i < cmd.length; i++)
				name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			target = World.getPlayerByDisplayName(name);
			if (target != null) {
				target.setBanned(Utils.currentTimeMillis() + (48 * 60 * 60 * 1000));
				target.getSession().close();
				player.getSocialManager().sendGameMessage("You have banned 48 hours: " + target.getDisplayName() + ".");
			} else {
				name = Utils.formatPlayerNameForProtocol(name);
				if (!SerializableFilesManager.containsPlayer(name)) {
					player.getSocialManager().sendGameMessage("Account name " + Utils.formatPlayerNameForDisplay(name) + " doesn't exist.");
					return true;
				}
				target = SerializableFilesManager.loadPlayer(name);
				target.setUsername(name);
				target.setBanned(Utils.currentTimeMillis() + (48 * 60 * 60 * 1000));
				player.getSocialManager().sendGameMessage("You have banned 48 hours: " + Utils.formatPlayerNameForDisplay(name) + ".");
				SerializableFilesManager.savePlayer(target);
			}
			return true;
		case "unban":
			if (player.getRights() < 2) {
				player.getSocialManager().sendGameMessage("Admin+ only!");
				return true;
			}

			name = "";
			for (int i = 1; i < cmd.length; i++)
				name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			target = World.getPlayerByDisplayName(name);
			if (target != null) {
				IPBanL.unban(target);
				player.getSocialManager().sendGameMessage("You have unbanned: " + target.getDisplayName() + ".");
			} else {
				name = Utils.formatPlayerNameForProtocol(name);
				if (!SerializableFilesManager.containsPlayer(name)) {
					player.getSocialManager().sendGameMessage("Account name " + Utils.formatPlayerNameForDisplay(name) + " doesn't exist.");
					return true;
				}
				target = SerializableFilesManager.loadPlayer(name);
				target.setUsername(name);
				IPBanL.unban(target);
				player.getSocialManager().sendGameMessage("You have unbanned: " + target.getDisplayName() + ".");
				SerializableFilesManager.savePlayer(target);
			}
			return true;
		case "mute":
			name = "";
			for (int i = 1; i < cmd.length; i++)
				name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			target = World.getPlayerByDisplayName(name);
			if (target != null) {
				target.setMuted(Utils.currentTimeMillis() + (player.getRights() >= 1 ? (48 * 60 * 60 * 1000) : (1 * 60 * 60 * 1000)));
				target.getSocialManager().sendGameMessage("You've been muted for " + (player.getRights() >= 1 ? " 48 hours by " : "1 hour by ") + Utils.formatPlayerNameForDisplay(player.getUsername()) + ".");
				player.getSocialManager().sendGameMessage("You have muted " + (player.getRights() >= 1 ? " 48 hours by " : "1 hour by ") + target.getDisplayName() + ".");
			} else {
				name = Utils.formatPlayerNameForProtocol(name);
				if (!SerializableFilesManager.containsPlayer(name)) {
					player.getSocialManager().sendGameMessage("Account name " + Utils.formatPlayerNameForDisplay(name) + " doesn't exist.");
					return true;
				}
				target = SerializableFilesManager.loadPlayer(name);
				target.setUsername(name);
				target.setMuted(Utils.currentTimeMillis() + (player.getRights() >= 1 ? (48 * 60 * 60 * 1000) : (1 * 60 * 60 * 1000)));
				player.getSocialManager().sendGameMessage("You have muted " + (player.getRights() >= 1 ? " 48 hours by " : "1 hour by ") + target.getDisplayName() + ".");
				SerializableFilesManager.savePlayer(target);
			}
			return true;
		case "unmute":
			if (player.getRights() < 1) {
				player.getSocialManager().sendGameMessage("Mod+ only!");
				return true;
			}

			name = "";
			for (int i = 1; i < cmd.length; i++)
				name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			target = World.getPlayerByDisplayName(name);
			if (target != null) {
				target.setMuted(0);
				target.getSocialManager().sendGameMessage("You've been unmuted by " + Utils.formatPlayerNameForDisplay(player.getUsername()) + ".");
				player.getSocialManager().sendGameMessage("You have unmuted: " + target.getDisplayName() + ".");
				SerializableFilesManager.savePlayer(target);
			} else {
				target = (Player) SerializableFilesManager.loadPlayer(Utils.formatPlayerNameForProtocol(name));
				target.setMuted(0);
				player.getSocialManager().sendGameMessage("You have unmuted: " + Utils.formatPlayerNameForDisplay(name) + ".");
				SerializableFilesManager.savePlayer(target);
			}
			return true;
		case "jail":
			if (player.getRights() < 1) {
				player.getSocialManager().sendGameMessage("Mod+ only!");
				return true;
			}

			name = "";
			for (int i = 1; i < cmd.length; i++)
				name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			target = World.getPlayerByDisplayName(name);
			if (target != null) {
				target.setJailed(Utils.currentTimeMillis() + (24 * 60 * 60 * 1000));
				target.getControlerManager().startControler("JailControler");
				target.getSocialManager().sendGameMessage("You've been Jailed for 24 hours by " + Utils.formatPlayerNameForDisplay(player.getUsername()) + ".");
				player.getSocialManager().sendGameMessage("You have Jailed 24 hours: " + target.getDisplayName() + ".");
				SerializableFilesManager.savePlayer(target);
			} else {
				target = (Player) SerializableFilesManager.loadPlayer(Utils.formatPlayerNameForProtocol(name));
				target.setJailed(Utils.currentTimeMillis() + (24 * 60 * 60 * 1000));
				player.getSocialManager().sendGameMessage("You have muted 24 hours: " + Utils.formatPlayerNameForDisplay(name) + ".");
				SerializableFilesManager.savePlayer(target);
			}
			return true;
		case "unjail":
			if (player.getRights() < 1) {
				player.getSocialManager().sendGameMessage("Mod+ only!");
				return true;
			}

			name = "";
			for (int i = 1; i < cmd.length; i++)
				name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			target = World.getPlayerByDisplayName(name);
			if (target != null) {
				target.setJailed(0);
				target.getControlerManager().startControler("JailControler");
				target.getSocialManager().sendGameMessage("You've been unjailed by " + Utils.formatPlayerNameForDisplay(player.getUsername()) + ".");
				player.getSocialManager().sendGameMessage("You have unjailed: " + target.getDisplayName() + ".");
				SerializableFilesManager.savePlayer(target);
			} else {
				target = SerializableFilesManager.loadPlayer(Utils.formatPlayerNameForProtocol(name));
				target.setJailed(0);
				player.getSocialManager().sendGameMessage("You have unjailed: " + Utils.formatPlayerNameForDisplay(name) + ".");
				SerializableFilesManager.savePlayer(target);
			}
			return true;

		case "kick":
			if (player.getRights() < 1) {
				player.getSocialManager().sendGameMessage("Mod+ only!");
				return true;
			}

			name = "";
			for (int i = 1; i < cmd.length; i++)
				name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			target = World.getPlayerByDisplayName(name);
			if (target == null) {
				player.getSocialManager().sendGameMessage(Utils.formatPlayerNameForDisplay(name) + " is not logged in.");
				return true;
			}
			target.getSession().close();
			player.getSocialManager().sendGameMessage("You have kicked: " + target.getDisplayName() + ".");
			return true;
		case "forcekick":
			if (player.getRights() < 1) {
				player.getSocialManager().sendGameMessage("Mod+ only!");
				return true;
			}

			name = "";
			for (int i = 1; i < cmd.length; i++)
				name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			target = World.getPlayerByDisplayName(name);
			if (target == null) {
				player.getSocialManager().sendGameMessage(Utils.formatPlayerNameForDisplay(name) + " is not logged in.");
				return true;
			}
			target.forceLogout();
			player.getSocialManager().sendGameMessage("You have kicked: " + target.getDisplayName() + ".");
			return true;
		default:
			return false;
		}
	}

	private static boolean trollRunning = false;
	private static String trollTarget = null;

	private static TimerTask prjDebugTask = null;
	private static int prjDebugInterval = 600;
	private static int prjDebugTarget = -1, prjDebugStartAnim = -1, prjDebugStartGfx = -1, prjDebugPrjGfx = -1, prjDebugDestAnim = -1, prjDebugDestGfx = -1, prjDebugStartHeight = -1, prjDebugEndHeight = -1, prjDebugDelay = -1, prjDebugSpeed = -1, prjDebugSlope = -1, prjDebugAngle = -1;

	public static boolean processAdminCommand(final Player player, String[] cmd, boolean console, boolean clientCommand) {
		if (clientCommand) {
			switch (cmd[0]) {
			case "tele":
				cmd = cmd[1].split(",");
				int plane = Integer.valueOf(cmd[0]);
				int x = Integer.valueOf(cmd[1]) << 6 | Integer.valueOf(cmd[3]);
				int y = Integer.valueOf(cmd[2]) << 6 | Integer.valueOf(cmd[4]);
				player.setNextWorldTile(new WorldTile(x, y, plane));
				return true;
			}
		} else {
			String name;
			Player target;
			WorldObject object;
			switch (cmd[0].toLowerCase()) {
				case "tele":
					int plane = Integer.parseInt(cmd[3]);
					int x = Integer.parseInt(cmd[1]);
					int y = Integer.parseInt(cmd[2]);
					player.setNextWorldTile(new WorldTile(x, y, plane));
					return true;
				case "kc":
					player.getSocialManager().sendGameMessage("Killcount: " + player.getKillcount());
					return true;
				case "addkc":
					player.addKillcount(3);
					player.sm("added " + 3 + " killcount, new killcount: " + player.getKillcount());
					return true;
				case "removekc":
					player.removeKillcount(2);
					player.sm("removed " + 2 + " killcount, new killcount: " + player.getKillcount());
					return true;
				case "clearkc":
					player.clear(VariableKeys.IntKey.KILLCOUNT);
					return true;
			case "switchyell":
				Settings.YELL_ENABLED = !Settings.YELL_ENABLED;
				player.getSocialManager().sendGameMessage("All yells are currently " + Settings.YELL_ENABLED);
				return true;
			case "hugemap":
				player.setMapSize(3);
				return true;
			case "normmap":
				player.setMapSize(0);
				return true;
			case "ge":
				player.getGeManager().openGrandExchange();
				return true;
			case "collectionbox":
				player.getGeManager().openCollectionBox();
				return true;
			case "history":
				player.getGeManager().openHistory();
				return true;
			case "teletome":
				name = "";
				for (int i = 1; i < cmd.length; i++)
					name += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
				target = World.getPlayerByDisplayName(name);
				if (target == null)
					player.getSocialManager().sendGameMessage("Couldn't find player " + name + ".");
				else {
					target.lock(15);
					performTeleEmote(target);
					final Player _target = target;
					WorldTasksManager.schedule(new WorldTask() {
						@Override
						public void run() {
							_target.setNextAnimation(new Animation(-1));
							_target.setNextWorldTile(player);

						}
					}, 5);
				}
				return true;
			case "pos":
				player.sm("Position: " + player.getX() + ", " + player.getY() + ", " + player.getPlane());
				return true;

			case "killnpc":
				for (NPC n : World.getNPCs()) {
					if (n == null || n.getId() != Integer.parseInt(cmd[1]))
						continue;
					n.applyHit(new Hit(player, n.getMaxHitpoints(), HitLook.MELEE_DAMAGE));
				}
				return true;
			case "sound":
				if (cmd.length < 2) {
					player.getSocialManager().sendPanelBoxMessage("Use: ::sound soundid effecttype");
					return true;
				}
				try {
					player.getPackets().sendSound(Integer.valueOf(cmd[1]), 0, cmd.length > 2 ? Integer.valueOf(cmd[2]) : 1);
				} catch (NumberFormatException e) {
					player.getSocialManager().sendPanelBoxMessage("Use: ::sound soundid");
				}
				return true;
			case "voice":
				if (cmd.length < 2) {
					player.getSocialManager().sendPanelBoxMessage("Use: ::sound soundid effecttype");
					return true;
				}
				try {
					player.getPackets().sendSound(Integer.parseInt(cmd[1]), 0, 2);
				} catch (NumberFormatException e) {
					player.getSocialManager().sendPanelBoxMessage("Use: ::sound soundid");
				}
				return true;
			case "music":
				if (cmd.length < 2) {
					player.getSocialManager().sendPanelBoxMessage("Use: ::sound soundid effecttype");
					return true;
				}
				try {
					player.getPackets().sendMusic(Integer.valueOf(cmd[1]));
				} catch (NumberFormatException e) {
					player.getSocialManager().sendPanelBoxMessage("Use: ::sound soundid");
				}
				return true;
			case "emusic":
				if (cmd.length < 2) {
					player.getSocialManager().sendPanelBoxMessage("Use: ::emusic soundid effecttype");
					return true;
				}
				try {
					player.getPackets().sendMusicEffect(Integer.valueOf(cmd[1]));
				} catch (NumberFormatException e) {
					player.getSocialManager().sendPanelBoxMessage("Use: ::emusic soundid");
				}
				return true;
				case "inter":
					if (cmd.length < 2) {
						player.getSocialManager().sendPanelBoxMessage("Use: ::inter interfaceId");
						return true;
					}
					try {
						player.getInterfaceManager().sendInterface(Integer.valueOf(cmd[1]));
						player.getTemporaryAttributtes().put("PREVIOUS_INTERFACE", Integer.valueOf(cmd[1]));
						player.getSocialManager().sendGameMessage("Sent interfaceId: " + Integer.valueOf(cmd[1]));
					} catch (NumberFormatException e) {
						player.getSocialManager().sendPanelBoxMessage("Use: ::inter interfaceId");
					}
					return true;
			case "removecontroler":
				player.getControlerManager().forceStop();
				player.getInterfaceManager().sendInterfaces();
				return true;

			case "item":
				if (cmd.length < 2) {
					player.getSocialManager().sendGameMessage("Use: ::item id (optional:amount)");
					return true;
				}
				try {
					int itemId = Integer.valueOf(cmd[1]);
					int amount = cmd.length >= 3 ? Integer.valueOf(cmd[2]) : 1;
					player.getInventory().addItem(itemId, amount);
					player.stopAll();
				} catch (NumberFormatException e) {
					player.getSocialManager().sendGameMessage("Use: ::item id (optional:amount)");
				}
				return true;

			case "god":
				player.setHitpoints(Short.MAX_VALUE);
				player.getEquipment().setEquipmentHpIncrease(Short.MAX_VALUE - 990);
				if (player.getUsername().equalsIgnoreCase("discardedx2"))
					return true;
				for (int i = 0; i < 10; i++)
					player.getCombatDefinitions().getBonuses()[i] = 5000;
				for (int i = 14; i < player.getCombatDefinitions().getBonuses().length; i++)
					player.getCombatDefinitions().getBonuses()[i] = 5000;
				return true;

			case "prayer":
				player.getPrayer().setPrayerpoints(99);
				return true;
				
			case "save":
				Launcher.saveFiles();
				return true;

			case "setlevel":
				if (cmd.length < 3) {
					player.getSocialManager().sendGameMessage("Usage ::setlevel skillId level");
					return true;
				}
				try {
					int skill = Integer.parseInt(cmd[1]);
					int level = Integer.parseInt(cmd[2]);
					if (level < 0 || level > 99) {
						player.getSocialManager().sendGameMessage("Please choose a valid level.");
						return true;
					}
					player.getSkills().set(skill, level);
					player.getSkills().setXp(skill, Skills.getXPForLevel(level));
					player.getAppearence().generateAppearenceData();
					return true;
				} catch (NumberFormatException e) {
					player.getSocialManager().sendGameMessage("Usage ::setlevel skillId level");
				}
				return true;

			}
		}
		return false;
	}

	public static void sendYell(Player player, String message, boolean staffYell) {
		if (Settings.BAD_BOYS)
			message = Censor.getFilteredMessage(message);
		if (!player.isDonator() && !player.isExtremeDonator() && player.getRights() == 0 && !player.isSupporter() && !player.isGraphicDesigner())
			return;
		else if (!Settings.YELL_ENABLED && player.getRights() != 2) {
			player.getSocialManager().sendGameMessage("Yell is currently disabled by an administrator");
			return;
		}
		if (player.getMuted() > Utils.currentTimeMillis()) {
			player.getSocialManager().sendGameMessage("You temporary muted. Recheck in 48 hours.");
			return;
		}
		if (staffYell) {
			World.sendIgnoreableWorldMessage(player, "[<col=ff0000>Staff Yell</col>] " + (player.getRights() > 1 ? "<img=1>" : (player.isSupporter() ? "" : "<img=0>")) + player.getDisplayName() + ": <col=ff0000>" + message + ".</col>", true);
			return;
		}
		if (message.length() > 100)
			message = message.substring(0, 100);

		if (player.getRights() < 2) {
			String[] invalid = { "<euro", "<img", "<img=", "<col", "<col=", "<shad", "<shad=", "<str>", "<u>" };
			for (String s : invalid)
				if (message.contains(s)) {
					player.getSocialManager().sendGameMessage("You cannot add additional code to the message.");
					return;
				}

			if (player.isGraphicDesigner())
				World.sendIgnoreableWorldMessage(player, "[<img=9><col=00ACE6>Graphic Designer</shad></col>] <img=9>" + player.getDisplayName() + ": <col=00ACE6><shad=000000>" + message + "", false);
			else if (player.isSupporter() && player.getRights() == 0)
				World.sendIgnoreableWorldMessage(player, "[<col=58ACFA><shad=2E2EFE>Support Team</shad></col>] " + player.getDisplayName() + ": <col=58ACFA><shad=2E2EFE>" + message + "</shad></col>.", false);

			else if (player.isExtremeDonator() && player.getRights() == 0)
				World.sendIgnoreableWorldMessage(player, "[<col=" + (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "ff0000" : player.getYellColor()) + ">Extreme Donator</col>] <img=11>" + player.getDisplayName() + ": <col=" + (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "ff0000" : player.getYellColor()) + ">" + message + "</col>", false);

			else if (player.isDonator() && player.getRights() == 0)
				World.sendIgnoreableWorldMessage(player, "[<col=02ab2f>Donator</col>] <img=8>" + player.getDisplayName() + ": <col=02ab2f>" + message + "</col>", false);

			else
				World.sendIgnoreableWorldMessage(player, "[<img=0><col=" + (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "000099" : player.getYellColor()) + ">" + ("Global Mod") + "</col><img=0>]" + player.getDisplayName() + ": <col=" + (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "000099" : player.getYellColor()) + ">" + message + "</col>", false);
			return;
		}
		World.sendIgnoreableWorldMessage(player, "[<img=1><col=" + (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "1589FF" : player.getYellColor()) + ">Admin</col>] <img=1>" + player.getDisplayName() + ": <col=" + (player.getYellColor() == "ff0000" || player.getYellColor() == null ? "1589FF" : player.getYellColor()) + ">" + message + "</col>", false);
	}

	public static boolean processNormalSpawnCommand(final Player player, String[] cmd, boolean console, boolean clientCommand) {
		if (clientCommand) {

		} else {
			switch (cmd[0]) {
			case "item":
				if (cmd.length < 2) {
					player.getSocialManager().sendGameMessage("Use: ::item id (optional:amount)");
					return true;
				}
				try {
					if (!player.canSpawn()) {
						player.getSocialManager().sendGameMessage("You can't spawn while you're in this area.");
						return true;
					}
					int itemId = Integer.valueOf(cmd[1]);
					ItemDefinitions defs = ItemDefinitions.getItemDefinitions(itemId);
					if (defs.isLended())
						return true;
					if (defs.isOverSized()) {
						player.getSocialManager().sendGameMessage("The item appears to be oversized.");
						return true;
					}
					player.getInventory().addItem(itemId, cmd.length >= 3 ? Integer.valueOf(cmd[2]) : 1);
				} catch (NumberFormatException e) {
					player.getSocialManager().sendGameMessage("Use: ::item id (optional:amount)");
				}
				return true;

			case "bank":
				if (!player.isDonator()) {
					player.getSocialManager().sendGameMessage("You do not have the privileges to use this.");
					return true;
				}
				if (!player.canSpawn()) {
					player.getSocialManager().sendGameMessage("You can't bank while you're in this area.");
					return true;
				}
				player.stopAll();
				player.getBank().openBank();
				return true;
			case "copy":
				if (!player.isDonator() && !player.isExtremeDonator()) {
					player.getSocialManager().sendGameMessage("You do not have the privileges to use this.");
					return true;
				}
				String username = "";
				for (int i = 1; i < cmd.length; i++)
					username += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
				Player p2 = World.getPlayerByDisplayName(username);
				if (p2 == null) {
					player.getSocialManager().sendGameMessage("Couldn't find player " + username + ".");
					return true;
				}
				if (p2.getRights() > 0 && player.getRights() == 0) {
					player.getSocialManager().sendGameMessage("Dont copy staff!!!");
					return true;
				}
				if (p2.isExtremeDonator() && !player.isExtremeDonator()) {
					player.getSocialManager().sendGameMessage("You can't copy extreme donators.");
					return true;
				}
				if (!player.canSpawn() || !p2.canSpawn()) {
					player.getSocialManager().sendGameMessage("You can't do this here.");
					return true;
				}
				if (player.getEquipment().wearingArmour()) {
					player.getSocialManager().sendGameMessage("Please remove your armour first.");
					return true;
				}
				Item[] items = p2.getEquipment().getItems().getItemsCopy();
				for (int i = 0; i < items.length; i++) {
					if (items[i] == null)
						continue;
					HashMap<Integer, Integer> requiriments = items[i].getDefinitions().getWearingSkillRequiriments();
					boolean hasRequiriments = true;
					if (requiriments != null) {
						for (int skillId : requiriments.keySet()) {
							if (skillId > 24 || skillId < 0)
								continue;
							int level = requiriments.get(skillId);
							if (level < 0 || level > 120)
								continue;
							if (player.getSkills().getLevelForXp(skillId) < level) {
								if (hasRequiriments)
									player.getSocialManager().sendGameMessage("You are not high enough level to use this item.");
								hasRequiriments = false;
								username = Skills.SKILL_NAME[skillId].toLowerCase();
								player.getSocialManager().sendGameMessage("You need to have a" + (username.startsWith("a") ? "n" : "") + " " + username + " level of " + level + ".");
							}

						}
					}
					if (!hasRequiriments)
						return true;
					hasRequiriments = ItemConstants.canWear(items[i], player);
					if (!hasRequiriments)
						return true;
					player.getEquipment().getItems().set(i, items[i]);
					player.getEquipment().refresh(i);
				}
				player.getAppearence().generateAppearenceData();
				return true;
			}
		}
		return false;
	}

	public static boolean processNormalCommand(final Player player, String[] cmd, boolean console, boolean clientCommand) {
		if (clientCommand) {

		} else {
			String message;
			switch (cmd[0].toLowerCase()) {
			case "score":
			case "kdr":
				double kill = player.getKillCount();
				double death = player.getDeathCount();
				double dr = kill / death;
				player.setNextForceTalk(new ForceTalk("<col=ff0000>I'VE KILLED " + player.getKillCount() + " PLAYERS AND BEEN SLAYED " + player.getDeathCount() + " TIMES. DR: " + dr));
				return true;
			case "players":
				player.getSocialManager().sendGameMessage("There are currently " + World.getPlayers().size() + " players playing " + Settings.SERVER_NAME + ".");
				return true;
			case "give":
					StringBuilder itemName = new StringBuilder(cmd[1]);
					int quantity = 1;
					String name = "";
					if (cmd.length > 2) {
						for (int i = 2; i < cmd.length; i++) {
							if (cmd[i].startsWith("+")) {
								quantity = Integer.parseInt(cmd[i].replace("+", ""));
							}
							if (cmd[i].startsWith("@")) {
								name = cmd[i].replace("@", "");
							} else if (cmd[i].startsWith("_")) {
								itemName.append(" ").append(cmd[i]);
							}
						}
					} else if (cmd.length > 3) {
						for (int i = 3; i < cmd.length; i++) {
							if (cmd[i].startsWith("+")) {
								quantity = Integer.parseInt(cmd[i].replace("+", ""));
							}
							if (cmd[i].startsWith("@")) {
								name = cmd[i].replace("@", "");
							} else if (cmd[i].startsWith("_")) {
								itemName.append(" ").append(cmd[i]);
							}
						}
					}
					String item1 = itemName.toString().toLowerCase().replace("[", "").replace("]", "").replace("(", "")
							.replace(")", "").replaceAll(",", "'").replaceAll("_", " ").replace("#6", " (6)")
							.replace("#5", " (5)").replace("#4", " (4)").replace("#3", " (3)").replace("#2", " (2)")
							.replace("#1", " (1)").replace("#e", " (e)").replace("#i", " (i)").replace("#g", " (g)")
							.replace("#or", " (or)").replace("#sp", " (sp)").replace("#t", " (t)");
					Player target = World.getPlayerByDisplayName(name);
					for (int i = 0; i < Utils.getItemDefinitionsSize(); i++) {
						ItemDefinitions def = ItemDefinitions.getItemDefinitions(i);
						if (def.getName().toLowerCase().equalsIgnoreCase(item1)) {
							if (name.length() > 0 && target == null) {
								player.getSocialManager().sendGameMessage("Couldn't find player " + name + ".");
								return true;
							}
							if (target != null) {
								target.getInventory().addItem(i, quantity);
								target.stopAll();
							} else {
								player.getInventory().addItem(i, quantity);
								player.stopAll();
							}
							player.getSocialManager()
									.sendGameMessage("Gave item " + item1 + " (" + def.getId() + ")"
											+ (quantity > 1 ? " x " + quantity + "" : "") + ""
											+ (target != null ? " to " + target.getUsername() : "") + ".");
							return true;
						}
					}
					player.getSocialManager().sendGameMessage("Could not find item by the name " + item1 + ".");
					return true;
			case "yell":
				message = "";
				for (int i = 1; i < cmd.length; i++)
					message += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
				sendYell(player, Utils.fixChatMessage(message), false);
				return true;
			}
		}
		return false;
	}

	public static void archiveLogs(Player player, String[] cmd) {
		try {
			if (player.getRights() < 1)
				return;
			String location = "";
			if (player.getRights() == 2) {
				location = "data/logs/commands/admin/" + player.getUsername() + ".txt";
			} else if (player.getRights() == 1) {
				location = "data/logs/commands/mod/" + player.getUsername() + ".txt";
			}
			String afterCMD = "";
			for (int i = 1; i < cmd.length; i++)
				afterCMD += cmd[i] + ((i == cmd.length - 1) ? "" : " ");
			BufferedWriter writer = new BufferedWriter(new FileWriter(location, true));
			writer.write("[" + Utils.currentTime("dd MMMMM yyyy 'at' hh:mm:ss z") + "] - ::" + cmd[0] + " " + afterCMD);
			writer.newLine();
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void performPointEmote(Player teleto) {
		teleto.setNextAnimation(new Animation(17540));
		teleto.setNextGraphics(new Graphics(3401));
	}

	public static void performTeleEmote(Player target) {
		target.setNextAnimation(new Animation(17544));
		target.setNextGraphics(new Graphics(3403));
	}

	public static void performKickBanEmote(Player target) {
		target.setNextAnimation(new Animation(17542));
		target.setNextGraphics(new Graphics(3402));
	}

	/*
	 * doesnt let it be instanced
	 */
	private Commands() {

	}
}