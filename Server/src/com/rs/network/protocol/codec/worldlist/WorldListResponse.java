package com.rs.network.protocol.codec.worldlist;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class WorldListResponse {

	/**
	 * Represents the update type.
	 */
	private final boolean update;

	/**
	 * Constructs a new class instance.
	 * @param update The update type.
	 */
	public WorldListResponse(boolean update) {
		this.update = update;
	}

	/**
	 * Checks if the world list requires a full update.
	 * @return the update
	 */
	public boolean isUpdate() {
		return update;
	}

}
