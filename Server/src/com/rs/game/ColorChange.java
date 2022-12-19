package com.rs.game;

public class ColorChange {

	private int colorDelay;
	private int colorDuration;
	private int[] changedColors;

	public ColorChange(int colorDelay, int colorDuration, int[] changedColors) {
		this.colorDelay = colorDelay;
		this.colorDuration = colorDuration;
		this.changedColors = changedColors;
	}

	public int[] getChangedColors() {
		return changedColors;
	}

	public int getColorDuration() {
		return colorDuration;
	}

	public int getColorDelay() {
		return colorDelay;
	}

}
