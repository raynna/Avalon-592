package com.rs.game.player;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 30, 2018.
 */
public class SocialManager {

	/**
	 * Represents the player using this manager.
	 */
	private final Player player;

	/**
	 * Constructs a new class instance.
	 * @param player The player.
	 */
	public SocialManager(Player player) {
		this.player = player;
	}

	/**
	 * Sends a game message.
	 * @param text The message text.
	 */
	public void sendGameMessage(String text) {
		sendGameMessage(text, false);
	}

	/**
	 * Sends a game message.
	 * @param text The message text.
	 * @param filter The filter.
	 */
	public void sendGameMessage(String text, boolean filter) {
		sendMessage(filter ? 22 : 0, text, null);
	}

	/**
	 * Sends a panel box message.
	 * @param text The message text.
	 */
	public void sendPanelBoxMessage(String text) {
		sendMessage(player.getRights() == 2 ? 99 : 0, text, null);
	}

	/**
	 * Sends a trade request message.
	 * @param p The target player.
	 */
	public void sendTradeRequestMessage(Player p) {
		sendMessage(4, "wishes to trade with you.", p);
	}

	/**
	 * Sends a clan wars request message.
	 * @param p The target player.
	 */
	public void sendClanWarsRequestMessage(Player p) {
		sendMessage(16, "wishes to challenge your clan to a clan war.", p);
	}

	/**
	 * Sends a duel arena challenge request message.
	 * @param p The target player.
	 * @param friendly If friendly challenge.
	 */
	public void sendDuelChallengeRequestMessage(Player p, boolean friendly) {
		sendMessage(friendly ? 15 : 14, "wishes to duel with you(" + (friendly ? "friendly" : "stake") + ").", p);
	}

	/**
	 * Sends the message packet.
	 * @param type The message type.
	 * @param text The message text.
	 * @param p The target player.
	 */
	public void sendMessage(int type, String text, Player p) {
		player.getPackets().sendMessage(type, text, p);
	}

}
