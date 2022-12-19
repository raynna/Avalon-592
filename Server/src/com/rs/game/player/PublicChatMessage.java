package com.rs.game.player;

public class PublicChatMessage extends ChatMessage {

	private int effects;
	private int colors;

	public PublicChatMessage(String message, int effects, int colors) {
		super(message);
		this.effects = effects;
		this.colors = colors;
	}

	public int getEffects() {
		return effects;
	}

	public int getColors() {
		return colors;
	}

}
