package com.rs.game.player.content.diary;

import java.util.stream.Stream;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on May 6, 2018.
 */
public enum DiaryData {

	/**
	 * The lumbridge and draynor area tasks.
	 */
	LUMBRIDGE(2, "Lumbridge/Draynor", "Complete a lap of the Draynor Village Agility Course.", "Slay a cave bug in the Lumbridge Swamp Caves.", "Have Sedridor teleport you to the Rune essence mine.", "Craft some water runes.", "Learn your age from Hans in Lumbridge.", "Pickpocket a man or woman in Lumbridge.", "Chop and burn some oak logs in Lumbridge.", "Kill a zombie in the Draynor Sewers.", "Catch some anchovies in Al-Kharid.", "Bake some bread on the Lumbridge castle kitchen range.", "Mine some iron ore at the Al-Kharid mine.", "Enter the H.A.M. Hideout."),

	/**
	 * The ardougne area tasks.
	 */
	ARDOUGNE(30, "Ardougne", "Have Wizard Cromperty teleport you to the Rune essence mine.", "Steal a cake from the East Ardougne market stalls.", "Sell silk to the Silk trader in East Ardougne for 60 coins each.", "Use the altar in East Ardougne's church.", "Go out fishing on the Fishing Trawler.", "Enter the Combat Training Camp north of West Ardougne.", "Have Tindel Marchant identify a rusty sword for you.", "Use the Ardougne lever to teleport to the Wilderness.", "View Aleck's Hunter Emporium shop in Yanille.", "Check what pets you have insured with Probita in East Ardougne."),

	/**
	 * The falador area tasks.
	 */
	FALADOR(22, "Falador", "Find out what your family crest is from Sir Renitee.", "Climb over the western Falador wall.", "Browse Sarah's Farming Shop.", "Get a haircut from the Falador hairdresser.", "Fill a bucket from the pump north of Falador West Bank.", "Kill a duck in Falador Park.", "Make a mind tiara.", "Take the boat to Entrana.", "Repair a broken strut in the Motherlode Mine.", "Claim a security book from the Security Guard upstairs at Port Sarim jail.", "Smith some Blurite limbs on Doric's anvil."),

	/**
	 * The fremennik area tasks.
	 */
	FREMENNIK(18, "Fremennik", "Catch a cerulean twitch.", "Change your boots at Yrsa's Shoe Store.", "Kill 5 Rock Crabs.", "Craft a tiara from scratch in Rellekka.", "Browse the Stonemason's shop.", "Collect 5 snape grass on Waterbirth Island.", "Steal from the Keldagrim crafting or baker's stall.", "Fill a bucket with water at the Rellekka well.", "Enter the Troll Stronghold.", "Chop and burn some oak logs in the Fremennik Province."),

	/**
	 * The karamja area tasks.
	 */
	KARAMJA(10, "Karamja", "Pick 5 bananas from the plantation located east of the volcano.", "Use the rope swing to travel to the Moss Giant Island north-west of Karamja.", "Mine some gold from the rocks on the north-west peninsula of Karamja.", "Travel to Port Sarim via the dock, east of Musa Point.", "Travel to Ardougne via the port near Brimhaven.", "Explore Cairn Isle to the west of Karamja.", "Use the fishing spots north of the banana plantation.", "Collect 5 seaweed from anywhere on Karamja.", "Attempt the TzHaar Fight Pits or Fight Cave.", "Kill a jogre in the Pothole Dungeon."),

	/**
	 * The seers' village area tasks.
	 */
	SEERS_VILLAGE(26, "Seers' Village", "Catch a mackerel at Catherby.", "Buy a candle from the candle maker in Catherby.", "Collect 5 flax from the Seers' Village flax field.", "Play the organ in the Seer's Village church.", "Plant jute seeds in the farming patch north of McGrubor's Wood.", "Have Galahad make you a cup of tea.", "Defeat one of each elemental in the Elemental workshop.", "Get a pet fish from Harry in Catherby", "Buy a stew from the Seers' Village pub.", "Speak to Sherlock between the Sorcerer's Tower and Keep Le Faye.", "Cross the Coal Trucks log balance."),

	/**
	 * The varrock area tasks.
	 */
	VARROCK(14, "Varrock", "Browse Thessalia's store.", "Have Aubury teleport you to the essence mine.", "Mine some iron in the south east mining patch near Varrock.", "Make a normal plank at the Sawmill.", "Enter the second level of the Stronghold of Security.", "Jump over the fence south of Varrock.", "Chop down a dying tree in the Lumber Yard.", "Buy a newspaper.", "Give a dog a bone!", "Spin a bowl on the pottery wheel and fire it in the oven in Barbarian Village.", "Speak to Haig Halen after obtaining at least 50 Kudos.", "Craft some earth runes.", "Catch some trout in the River Lum at Barbarian Village.", "Steal from the tea stall in Varrock.");

	/**
	 * Represnets the component id of each task list.
	 */
	private final int componentId;

	/**
	 * Represents the title of each interface placed in each enum. This has to be done because some of them are special case and
	 * can't be used from the enum name.
	 */
	private final String title;

	/**
	 * Represents the display of tasks for each region.
	 */
	private final String[] tasks;

	/**
	 * Constructs a new class instance.
	 * @param componentId The component id.
	 * @param title The title name.
	 * @param tasks The tasks.
	 */
	private DiaryData(int componentId, String title, String... tasks) {
		this.componentId = componentId;
		this.title = title;
		this.tasks = tasks;
	}

	/**
	 * Gets the title to display on the interface upon opening based on the button the player clicked.
	 * @param componentId The component id.
	 * @return The title.
	 */
	public static String getTitle(int componentId) {
		return Stream.of(DiaryData.values()).filter(a -> a.ordinal() == componentId).findFirst().get().getTitle();
	}

	/**
	 * Gets a task per each line being sent on the interface.
	 * @param componentId The component id.
	 * @param index The index of the tasks.
	 * @return The task.
	 */
	public static String getTask(int componentId, int index) {
		return Stream.of(DiaryData.values()).filter(a -> a.ordinal() == componentId).findFirst().get().getTasks()[index];
	}

	/**
	 * Gets and returns the maximum number of tasks is being sent.
	 * @param componentId The component id.
	 * @return The number of tasks.
	 */
	public static int getTasksCount(int componentId) {
		return Stream.of(DiaryData.values()).filter(a -> a.ordinal() == componentId).findFirst().get().getTasks().length;
	}

	/**
	 * Gets the component id.
	 * @return the componentId
	 */
	public int getComponentId() {
		return componentId;
	}

	/**
	 * Gets the title.
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the tasks
	 */
	public String[] getTasks() {
		return tasks;
	}

}
