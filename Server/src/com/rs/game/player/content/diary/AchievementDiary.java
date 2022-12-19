package com.rs.game.player.content.diary;

import com.rs.game.player.Player;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on May 6, 2018.
 */
public class AchievementDiary {

	/**
	 * The achievement diary tasks interface id.
	 */
	private static final int TASKS_INTERFACE = 275;

	/**
	 * The interface components offset.
	 */
	private static final int OFFSET = 21;

	/**
	 * Handles the achievement diary buttons for the interface.
	 * @param player The player using this diary.
	 * @param interfaceId The interface id.
	 * @param componentId The component id.
	 * @param slotId The slot id.
	 * @param slotId2 The second slot id.
	 * @param packetId The packet id.
	 */
	public static void handleButtons(Player player, int interfaceId, int componentId, int slotId, int slotId2, int packetId) {
		if (interfaceId != 259)
			return;

		for (DiaryData diary : DiaryData.values()) {
			if (diary.getComponentId() == componentId) {
				open(player, diary.ordinal());
			}
		}
	}

	/**
	 * Opens the achievement diary tasks interface.
	 * @param player The player opening the interface.
	 * @param componentId The component id from the game tab used to determine with interface to open.
	 */
	public static void open(Player player, int componentId) {
		String title = DiaryData.getTitle(componentId);
		player.getPackets().sendIComponentText(TASKS_INTERFACE, 2, "Achievement Diary - " + title);
		player.getPackets().sendIComponentText(TASKS_INTERFACE, 16, title);
		player.getPackets().sendIComponentText(TASKS_INTERFACE, 17, "");
		player.getPackets().sendIComponentText(TASKS_INTERFACE, 18, "Easy");
		player.getPackets().sendIComponentText(TASKS_INTERFACE, 19, "");
		player.getPackets().sendIComponentText(TASKS_INTERFACE, 20, "");
		player.getPackets().sendRunScript(1207, DiaryData.getTasksCount(componentId) + 6);
		for (int index = OFFSET; index < OFFSET + DiaryData.getTasksCount(componentId); index++) {
			player.getPackets().sendIComponentText(TASKS_INTERFACE, index, DiaryData.getTask(componentId, index - OFFSET));
		}
		player.getPackets().sendIComponentText(TASKS_INTERFACE, (OFFSET + DiaryData.getTasksCount(componentId)), "");
		player.getPackets().sendIComponentText(TASKS_INTERFACE, (OFFSET + DiaryData.getTasksCount(componentId)) + 1, "");
		player.getInterfaceManager().sendInterface(TASKS_INTERFACE);
	}

}
