package com.rs.cache.loaders;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import com.rs.cache.Cache;
import com.rs.io.InputStream;

public class ClientScript {

	private String name;
	private int objectArgCount;
	private int[] opcodes;
	private int intArgCount;
	@SuppressWarnings("rawtypes")
	private Hashtable[] jumpTable;
	private String[] stringValues;
	private int intVarCount;
	private int[] intValues;
	private int objectVarCount;

	private static final ConcurrentHashMap<Integer, ClientScript> clientScripts = new ConcurrentHashMap<Integer, ClientScript>();

	public static void main(String[] args) throws IOException {
		Cache.init();

		System.out.println(getLinkedScripts(900));
	}

	public static final ClientScript getClientScript(int scriptId) {
		ClientScript script = clientScripts.get(scriptId);
		if (script != null)
			return script;
		byte[] data = Cache.STORE.getIndexes()[12].getFile(scriptId, 0);
		script = new ClientScript();
		if (data != null)
			script.decode(new InputStream(data));
		clientScripts.put(scriptId, script);
		return script;

	}

	private void decode(InputStream buffer) {
		buffer.setOffset(-2 + buffer.getLength());
		int pos = buffer.readUnsignedShort();
		int bufferPos = // buffer.getLength() - (2 - -pos) - 16;
				-12 + (-pos + (buffer.getLength() - 2));
		buffer.setOffset(bufferPos);
		int sclength = buffer.readInt();
		intArgCount = buffer.readUnsignedShort();
		objectArgCount = buffer.readUnsignedShort();
		intVarCount = buffer.readUnsignedShort();
		objectVarCount = buffer.readUnsignedShort();
		int hashTableSize = buffer.readUnsignedByte();
		if ((hashTableSize ^ 0xffffffff) < -1) {
			jumpTable = new Hashtable[hashTableSize];
			for (int idx = 0; hashTableSize > idx; idx++) {
				int remaining = buffer.readUnsignedShort();
				Hashtable<Long, Integer> hashTable = new Hashtable<Long, Integer>(method3753(remaining));
				jumpTable[idx] = hashTable;
				while ((remaining-- ^ 0xffffffff) < -1) {
					int uid = buffer.readInt();
					int amt = buffer.readInt();
					hashTable.put((long) uid, amt);
				}
			}
		}
		buffer.setOffset(0);
		name = buffer.readStringNullTerminated();
		opcodes = new int[sclength];
		if (intValues == null) {
			intValues = new int[sclength];
		}
		if (stringValues == null) {
			stringValues = new String[sclength];
		}
		int count = 0;
		while (buffer.getOffset() < bufferPos) { // opcode decoding
			int opcode = buffer.readUnsignedShort();
			if (opcode == 3) {
				stringValues[count] = buffer.readString().intern();
			} else if (opcode < 100 && opcode != 21 && opcode != 38 && opcode != 39) {
				intValues[count] = buffer.readInt();
			} else {
				intValues[count] = buffer.readUnsignedByte();
			}

			opcodes[count++] = opcode;
		}

	}

	/**
	 * Gets the linked interfaces from a client script.
	 * 
	 * @return the linked interfaces
	 * 
	 */
	public List<Integer> getLinkedInterfaces() {
		List<Integer> linkedInterfaces = new ArrayList<Integer>();
		for (int i = 0; i < intValues.length; i++) {
			int interfaceId = intValues[i] >> 16;
			if (interfaceId <= 0 || linkedInterfaces.contains(interfaceId))
				continue;
			linkedInterfaces.add(interfaceId);
		}
		return linkedInterfaces;
	}

	/**
	 * Gets the linked client scripts from an interface.
	 * 
	 * @param interfaceId - the interface's index
	 * @return the linked client scripts
	 */
	public static List<Integer> getLinkedScripts(int interfaceId) {
		List<Integer> linkedScripts = new ArrayList<Integer>();
		for (int id = 0; id < Cache.STORE.getIndexes()[12].getLastArchiveId(); id++) {
			ClientScript script = getClientScript(id);
			if (script.getLinkedInterfaces().contains(interfaceId)) {
				linkedScripts.add(id);
			}
		}
		return linkedScripts;
	}

	private final int method3753(int i) {
		// sets the initial capacity based on the buffer's size?
		i--;
		i |= i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return 1 + i;
	}

	public int getIntArgCount() {
		return intArgCount;
	}

	public int getObjectArgCount() {
		return objectArgCount;
	}

	public int getIntVarCount() {
		return intVarCount;
	}

	public int getObjectVarCount() {
		return objectVarCount;
	}

	@SuppressWarnings("rawtypes")
	public Hashtable[] getJumpTables() {
		return jumpTable;
	}

	public int[] getOpcodes() {
		return opcodes;
	}

	public String[] getStrings() {
		return stringValues;
	}

	public int[] getIntegers() {
		return intValues;
	}

	public String getName() {
		return name;
	}
}
