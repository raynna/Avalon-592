package com.rs.game.player.dialogues;

import java.security.InvalidParameterException;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.game.player.Player;
import com.rs.utils.WordUtils;

public abstract class Dialogue {

	protected Player player;
	protected byte stage = -1;

	public Dialogue() {

	}

	public Object[] parameters;

	public void setPlayer(Player player) {
		this.player = player;
	}

	public abstract void start();

	public abstract void run(int interfaceId, int componentId);

	public abstract void finish();

	protected final void end() {
		player.getDialogueManager().finishDialogue();
	}

	public static final int NORMAL = 9827, WORRIED = 9775, CONFUSED = 9830, DRUNK = 9835, MAD = 9785, ANGERY = 9790, SAD = 9775, SCARED = 9780;

	public static int NO_EXPRESSION = 9760, SAD_TWO = 9768, NO_EXPRESSION_TWO = 9772, WHY = 9776;
	public static int MIDLY_ANGRY = 9784, ANGRY = 9788, VERY_ANGRY = 9792, ANGRY_TWO = 9796;
	public static int MANIC_FACE = 9800, JUST_LISTEN = 9804, PLAIN_TALKING = 9808, LOOK_DOWN = 9812;
	public static int WHAT_THE = 9816, WHAT_THE_TWO = 9820, EYES_WIDE = 9824, CROOKED_HEAD = 9828;
	public static int GLANCE_DOWN = 9832, UNSURE = 9836, LISTEN_LAUGH = 9840, TALK_SWING = 9844;
	public static int GOOFY_LAUGH = 9851, NORMAL_STILL = 9855, THINKING_STILL = 9859, LOOKING_UP = 9862;

	protected static final String DEFAULT_OPTIONS_TITLE = "Select an Option";

	protected static final short SEND_1_TEXT_INFO = 210;
	protected static final short SEND_2_TEXT_INFO = 211;
	protected static final short SEND_3_TEXT_INFO = 212;
	protected static final short SEND_4_TEXT_INFO = 213;
	protected static final String SEND_DEFAULT_OPTIONS_TITLE = "Select an Option";
	protected static final short SEND_2_OPTIONS = 236;
	protected static final short SEND_3_OPTIONS = 235;
	protected static final short SEND_4_OPTIONS = 237;
	protected static final short SEND_5_OPTIONS = 238;
	protected static final short SEND_2_LARGE_OPTIONS = 229;
	protected static final short SEND_3_LARGE_OPTIONS = 231;
	protected static final short SEND_1_TEXT_CHAT = 241;
	protected static final short SEND_2_TEXT_CHAT = 242;
	protected static final short SEND_3_TEXT_CHAT = 243;
	protected static final short SEND_4_TEXT_CHAT = 244;
	protected static final short SEND_NO_CONTINUE_1_TEXT_CHAT = 245;
	protected static final short SEND_NO_CONTINUE_2_TEXT_CHAT = 246;
	protected static final short SEND_NO_CONTINUE_3_TEXT_CHAT = 247;
	protected static final short SEND_NO_CONTINUE_4_TEXT_CHAT = 248;
	protected static final short SEND_NO_EMOTE = -1;
	protected static final byte IS_NOTHING = -1;
	protected static final byte IS_PLAYER = 0;
	protected static final byte IS_NPC = 1;
	protected static final byte IS_ITEM = 2;

	public void hideContinueOption(int type) {
		player.getPackets().sendHideIComponent(type == IS_PLAYER ? 1191 : 1184, 18, true);
	}

	public void sendContinueOption(int type) {
		player.getPackets().sendHideIComponent(type == IS_PLAYER ? 1191 : 1184, 18, false);
	}

	/*
	 * 
	 * auto selects title, new dialogues
	 */
	public boolean sendEntityDialogue(int type, int entityId, int animationId, String... text) {
		String title = "";
		if (type == IS_PLAYER) {
			title = player.getDisplayName();
		} else if (type == IS_NPC) {
			title = NPCDefinitions.getNPCDefinitions(entityId).getName();
		} else if (type == IS_ITEM)
			title = ItemDefinitions.getItemDefinitions(entityId).getName();
		return sendEntityDialogue(type, title, entityId, animationId, text);
	}

	/*
	 * idk what it for
	 */
	public int getP() {
		return 1;
	}

	public static final int OPTION_1 = 2, OPTION_2 = 3, OPTION_3 = 4, OPTION_4 = 5, OPTION_5 = 6;

	public boolean sendOptionsDialogue(String title, String... options) {
		if (options.length < 2 || options.length > 5) {
			throw new InvalidParameterException("Options length ERROR: " + options.length + "Option: " + options[options.length - 1]);
		}
		if (title.isEmpty())
			title = DEFAULT_OPTIONS_TITLE;

		int interId = 224 + (options.length * 2);
		int index = 2;

		player.getInterfaceManager().sendChatBoxInterface(interId);

		player.getPackets().sendIComponentText(interId, index - 1, title);

		for (String string : options) {
			player.getPackets().sendIComponentText(interId, index, string);
			index++;
		}

		return true;
	}

	/*
	 * 
	 * auto selects title, new dialogues
	 */
	public static boolean sendEntityDialogueNoContinue(Player player, int type, int entityId, int animationId, String... text) {
		String title = "";
		if (type == IS_PLAYER) {
			title = player.getDisplayName();
		} else if (type == IS_NPC) {
			title = NPCDefinitions.getNPCDefinitions(entityId).getName();
		} else if (type == IS_ITEM)
			title = ItemDefinitions.getItemDefinitions(entityId).getName();
		return sendEntityDialogueNoContinue(player, type, title, entityId, animationId, text);
	}

	public static boolean sendEntityDialogueNoContinue(Player player, int type, String title, int entityId, int animationId, String... texts) {

		String wrap = WordUtils.wrap(texts[0], 55);
		String[] splittedText = wrap.split("\n");
		if (texts.length == 1)
			texts = splittedText;

		if ((texts.length == 0 || texts.length > 4)) {
			throw new InvalidParameterException("Talk length ERROR: " + texts.length + " Text: " + texts[texts.length - 1]);
		}
		int interId = texts.length;
		if (type == IS_ITEM)
			interId += 244;
		else
			interId += (type == IS_PLAYER ? 244 : 67);

		int index = 4;

		player.getInterfaceManager().replaceRealChatBoxInterface(interId);

		player.getPackets().sendIComponentText(interId, index - 1, title);

		for (String string : texts) {
			player.getPackets().sendIComponentText(interId, index, string);
			index++;
		}
		if (type == IS_ITEM) {
			player.getPackets().sendItemOnIComponent(interId, 2, entityId, animationId);
			return true;
		}

		player.getPackets().sendEntityOnIComponent(type == IS_PLAYER, entityId, interId, type == IS_PLAYER ? 2 : 1);
		if (animationId != -1)
			player.getPackets().sendIComponentAnimation(animationId, interId, type == IS_PLAYER ? 2 : 1);
		return true;
	}

	public static boolean sendNPCDialogueNoContinue(Player player, int npcId, int animationId, String... text) {
		return sendEntityDialogueNoContinue(player, IS_NPC, npcId, animationId, text);
	}

	public static boolean sendPlayerDialogueNoContinue(Player player, int animationId, String... text) {
		return sendEntityDialogueNoContinue(player, IS_PLAYER, -1, animationId, text);
	}

	public static boolean sendEmptyDialogue(Player player) {
		player.getInterfaceManager().replaceRealChatBoxInterface(89);
		return true;
	}

	public static void closeNoContinueDialogue(Player player) {
		player.getInterfaceManager().closeReplacedRealChatBoxInterface();
	}

	public boolean sendNPCDialogue(int npcId, int animationId, String... text) {
		return sendEntityDialogue(IS_NPC, npcId, animationId, text);
	}

	public boolean sendItemDialogue(int itemId, String... text) {
		return sendEntityDialogue(IS_ITEM, itemId, -1, text);
	}

	public boolean sendPlayerDialogue(int animationId, String... text) {
		return sendEntityDialogue(IS_PLAYER, -1, animationId, text);
	}

	public boolean sendEntityDialogue(short interId, String[] talkDefinitons, byte type, int entityId, int animationId) {
		if (type == IS_PLAYER || type == IS_NPC) { // auto convert to new
			// dialogue all old dialogues
			String[] texts = new String[talkDefinitons.length - 1];
			for (int i = 0; i < texts.length; i++)
				texts[i] = talkDefinitons[i + 1];
			sendEntityDialogue(type, talkDefinitons[0], entityId, animationId, texts);
			return true;
		}
		return true;
	}

	public boolean sendEntityDialogue(int type, String title, int entityId, int animationId, String... talk) {
		String wrap = WordUtils.wrap(talk[0], 55);
		String[] splittedText = wrap.split("\n");
		if (talk.length == 1)
			talk = splittedText;

		if ((talk.length == 0 || talk.length > 4)) {
			throw new InvalidParameterException("Talk length ERROR: " + talk.length + " Text: " + talk[talk.length - 1]);
		}

		int interId = talk.length;
		if (type == IS_ITEM)
			interId += 240;
		else
			interId += (type == IS_PLAYER ? 240 : 63);

		int index = 4;

		player.getInterfaceManager().sendChatBoxInterface(interId);

		player.getPackets().sendIComponentText(interId, index - 1, title);
		for (String s : talk) {

			player.getPackets().sendIComponentText(interId, index, s);
			index++;
		}

		if (type == IS_PLAYER || type == IS_NPC) {
			player.getPackets().sendEntityOnIComponent(type == IS_PLAYER, entityId, interId, 2);
			if (animationId != -1)
				player.getPackets().sendIComponentAnimation(animationId, interId, 2);
		} else if (type == IS_ITEM)
			player.getPackets().sendItemOnIComponent(interId, 2, entityId, animationId);
		return true;
	}

	public boolean sendDialogue(String... talk) {
		String wrap = WordUtils.wrap(talk[0], 55);
		String[] splittedText = wrap.split("\n");
		if (talk.length == 1)
			talk = splittedText;

		if (talk.length == 0 || talk.length > 5) {
			throw new InvalidParameterException("Talk length ERROR: " + talk.length + " Text: " + talk[talk.length - 1]);
		}
		final short interId = (short) (209 + (talk.length));
		int index = 1;
		player.getInterfaceManager().sendChatBoxInterface(interId);

		for (String s : talk) {
			player.getPackets().sendIComponentText(interId, index, s);
			index++;
		}
		return true;
	}
}
