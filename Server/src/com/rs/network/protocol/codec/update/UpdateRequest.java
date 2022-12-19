package com.rs.network.protocol.codec.update;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on Apr 29, 2018.
 */
public class UpdateRequest {

	/**
	 * The cache index.
	 */
	private final int index;

	/**
	 * The cache archive.
	 */
	private final int archive;

	/**
	 * The cache file priroity type.
	 */
	private final boolean priority;

	/**
	 * Constructs a new class instance.
	 * @param index The index.
	 * @param archive The archive.
	 * @param priority The priority.
	 */
	public UpdateRequest(int index, int archive, boolean priority) {
		this.index = index;
		this.archive = archive;
		this.priority = priority;
	}

	/**
	 * Gets the index.
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * Gets the archive.
	 * @return the archive
	 */
	public int getArchive() {
		return archive;
	}

	/**
	 * Gets the priority type.
	 * @return the priority
	 */
	public boolean isPriority() {
		return priority;
	}

}
