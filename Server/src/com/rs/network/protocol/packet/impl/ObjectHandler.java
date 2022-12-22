package com.rs.network.protocol.packet.impl;


import com.rs.Settings;
import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.game.Animation;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.Item;
import com.rs.game.minigames.CastleWars;
import com.rs.game.player.Player;
import com.rs.game.player.RouteEvent;
import com.rs.game.player.Skills;
import com.rs.io.InputStream;
import com.rs.utils.Logger;
import com.rs.utils.Utils;
import com.rs.game.object.*;

public final class ObjectHandler {

	private ObjectHandler() {

	}

	public static void handleOption(final Player player, InputStream stream, int option) {
		if (!player.hasStarted() || !player.clientHasLoadedMapRegion() || player.isDead())
			return;
		if (player.isLocked() || player.getEmotesManager().getNextEmoteEnd() >= Utils.currentTimeMillis())
			return;
		switch (option) {
		case 1:
			handleOption1(player, stream);
			break;
		case 2:
			handleOption2(player, stream);
			break;
		case 3:
			// handleOption3(player, stream);
			break;
		case 4:
			// handleOption4(player, stream);
			break;
		case 5:
			// handleOption5(player, stream);
			break;
		case -1:
			handleOptionExamine(player, stream);
			break;
		}
	}

	private static void handleOption1(final Player player, final InputStream stream) {
		final int x = stream.readUnsignedShortLE128();
		boolean forceRun = stream.readUnsignedByte() == 1;
		final int id = stream.readUnsignedShort();
		final int y = stream.readUnsignedShort();

		System.out.println(x + ", " + y + ", " + forceRun + ", " + id);
		final WorldTile objTile = new WorldTile(x, y, player.getPlane());
		final int regionId = objTile.getRegionId();
		if (!player.getMapRegionsIds().contains(regionId)) {
			System.out.println("BAD1");
			return;
		}
		WorldObject mapObject = World.getObjectWithId(objTile, id);
		if (mapObject == null || mapObject.getId() != id) {
			System.out.println("BAD2");
			return;
		}
		final WorldObject object = mapObject;
		ObjectDefinitions objectDef = ObjectDefinitions.getObjectDefinitions(object.getId());
		player.stopAll();
		if (forceRun)
			player.setRun(forceRun);
		ObjectScript script = ObjectScriptsHandler.cachedObjectScripts.getOrDefault(object.getId(),
				ObjectScriptsHandler.cachedObjectScripts.get(objectDef.name));
		if (script != null) {
			player.setRouteEvent(new RouteEvent(object, new Runnable() {
				@Override
				public void run() {
					player.stopAll();
					player.faceObject(object);
					script.processObject(player, object);
				}
			}, true));
			return;
		}
		player.setRouteEvent(new RouteEvent(object, new Runnable() {
			@Override
			public void run() {
				player.stopAll();
				player.faceObject(object);
				if (!player.getControlerManager().processObjectClick1(object))
					return;
				if (CastleWars.handleObjects(player, id))
					return;
				else {
					switch (objectDef.name.toLowerCase()) {
					default:
						player.getSocialManager().sendGameMessage("Nothing interesting happens.");
						break;
					}
				}
				if (Settings.DEBUG)
					Logger.log("ObjectHandler", "clicked 1 at object id : " + id + ", " + object.getX() + ", " + object.getY() + ", " + object.getPlane() + ", " + object.getType() + ", " + object.getRotation() + ", " + object.getDefinitions().name + ", " + object.getDefinitions().getSizeX() + ", " + object.getDefinitions().getSizeY());
			}
		}));
	}

	public static void renewSummoningPoints(Player player) {
		int summonLevel = player.getSkills().getLevelForXp(Skills.SUMMONING);
		if (player.getSkills().getLevel(Skills.SUMMONING) < summonLevel) {
			player.lock(3);
			player.setNextAnimation(new Animation(8502));
			player.getSkills().set(Skills.SUMMONING, summonLevel);
			player.getSocialManager().sendGameMessage("You have recharged your Summoning points.", true);
		} else
			player.getSocialManager().sendGameMessage("You already have full Summoning points.");
	}

	private static void handleOption2(final Player player, final InputStream stream) {
		final int x = stream.readUnsignedShort128();
		final int y = stream.readUnsignedShort128();
		final int id = stream.readUnsignedShortLE128();
		boolean forceRun = stream.readUnsignedByte() == 1;
		final WorldTile tile = new WorldTile(x, y, player.getPlane());
		final int regionId = tile.getRegionId();
		if (!player.getMapRegionsIds().contains(regionId))
			return;
		WorldObject mapObject = World.getObjectWithId(tile, id);
		if (mapObject == null || mapObject.getId() != id)
			return;
		final WorldObject object = mapObject;
		player.stopAll();
		if (forceRun)
			player.setRun(forceRun);
		final ObjectDefinitions objectDef = object.getDefinitions();

		player.setRouteEvent(new RouteEvent(object, new Runnable() {
			@Override
			public void run() {
				player.stopAll();
				player.faceObject(object);
				if (!player.getControlerManager().processObjectClick2(object))
					return;
				else {
					switch (objectDef.name.toLowerCase()) {
					default:
						player.getSocialManager().sendGameMessage("Nothing interesting happens.");
						break;
					}
				}
				if (Settings.DEBUG)
					Logger.log("ObjectHandler", "clicked 2 at object id : " + id + ", " + object.getX() + ", " + object.getY() + ", " + object.getPlane());
			}
		}));
	}

	private static void handleOption3(final Player player, final InputStream stream) {
		final int x = stream.readUnsignedShortLE();
		boolean forceRun = stream.readUnsignedByte() == 1;
		final int y = stream.readUnsignedShort();
		final int id = stream.readUnsignedShortLE128();
		final WorldTile objTile = new WorldTile(x, y, player.getPlane());
		final int regionId = objTile.getRegionId();
		if (!player.getMapRegionsIds().contains(regionId))
			return;
		WorldObject mapObject = World.getObjectWithId(objTile, id);
		if (mapObject == null || mapObject.getId() != id)
			return;
		final WorldObject object = mapObject;
		player.stopAll();
		if (forceRun)
			player.setRun(forceRun);
		final ObjectDefinitions objectDef = object.getDefinitions();

		player.setRouteEvent(new RouteEvent(object, new Runnable() {
			@Override
			public void run() {
				player.stopAll();
				player.faceObject(object);
				if (!player.getControlerManager().processObjectClick3(object))
					return;
				switch (objectDef.name.toLowerCase()) {
				default:
					player.getSocialManager().sendGameMessage("Nothing interesting happens.");
					break;
				}
				if (Settings.DEBUG)
					Logger.log("ObjectHandler", "cliked 3 at object id : " + id + ", " + object.getX() + ", " + object.getY() + ", " + object.getPlane() + ", ");
			}
		}));
	}

	private static void handleOption4(final Player player, final InputStream stream) {
		boolean forceRun = stream.readUnsignedByteC() == 1;
		final int x = stream.readUnsignedShort128();
		final int id = stream.readUnsignedShort128();
		final int y = stream.readUnsignedShort();
		final WorldTile objTile = new WorldTile(x, y, player.getPlane());
		final int regionId = objTile.getRegionId();
		if (!player.getMapRegionsIds().contains(regionId))
			return;
		WorldObject mapObject = World.getObjectWithId(objTile, id);
		if (mapObject == null || mapObject.getId() != id)
			return;
		final WorldObject object = mapObject;
		player.stopAll();
		if (forceRun)
			player.setRun(forceRun);
		final ObjectDefinitions objectDef = object.getDefinitions();

		player.setRouteEvent(new RouteEvent(object, new Runnable() {
			@Override
			public void run() {
				player.stopAll();
				player.faceObject(object);
				if (!player.getControlerManager().processObjectClick4(object))
					return;
				else {
					switch (objectDef.name.toLowerCase()) {
					default:
						player.getSocialManager().sendGameMessage("Nothing interesting happens.");
						break;
					}
				}
				if (Settings.DEBUG)
					Logger.log("ObjectHandler", "cliked 4 at object id : " + id + ", " + object.getX() + ", " + object.getY() + ", " + object.getPlane() + ", ");
			}
		}));
	}

	@SuppressWarnings("unused")
	private static void handleOption5(final Player player, final WorldObject object) {
		final ObjectDefinitions objectDef = object.getDefinitions();
		final int id = object.getId();
		player.setRouteEvent(new RouteEvent(object, new Runnable() {
			@Override
			public void run() {
				player.stopAll();
				player.faceObject(object);
				if (!player.getControlerManager().processObjectClick5(object))
					return;
				else {
					switch (objectDef.name.toLowerCase()) {
					default:
						player.getSocialManager().sendGameMessage("Nothing interesting happens.");
						break;
					}
				}
				if (Settings.DEBUG)
					Logger.log("ObjectHandler", "cliked 5 at object id : " + id + ", " + object.getX() + ", " + object.getY() + ", " + object.getPlane() + ", ");
			}
		}));
	}

	private static void handleOptionExamine(final Player player, final InputStream stream) {
		final int id = stream.readUnsignedShort();
		ObjectDefinitions def = ObjectDefinitions.getObjectDefinitions(id);
		player.getSocialManager().sendGameMessage("It's a " + def.name + ".");
		if (Settings.DEBUG)
			Logger.log("ObjectHandler", "examined object id : " + def.id + " name: " + def.name);
	}

	private static void slashWeb(Player player, WorldObject object) {
		if (Utils.getRandom(1) == 0) {
			World.spawnObjectTemporary(new WorldObject(object.getId() + 1, object.getType(), object.getRotation(), object.getX(), object.getY(), object.getPlane()), 60000);
			player.getSocialManager().sendGameMessage("You slash through the web!");
		} else
			player.getSocialManager().sendGameMessage("You fail to cut through the web.");
	}

	public static void handleItemOnObject(final Player player, final WorldObject object, final int interfaceId, final Item item) {
		final int itemId = item.getId();
		final ObjectDefinitions objectDef = object.getDefinitions();
		player.setRouteEvent(new RouteEvent(object, new Runnable() {
			@Override
			public void run() {
				if (!player.getControlerManager().handleItemOnObject(object, item))
					return;
				player.faceObject(object);
					switch (objectDef.name.toLowerCase()) {
					default:
						player.getSocialManager().sendGameMessage("Nothing interesting happens.");
						break;
					}
					if (Settings.DEBUG)
						System.out.println("Item on object: " + object.getId());
			}
		}));
	}
}
