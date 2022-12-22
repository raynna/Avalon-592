package com.rs.game.object.impl;

import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.object.ObjectScript;
import com.rs.game.player.Player;
import com.rs.game.tasks.WorldTask;
import com.rs.game.tasks.WorldTasksManager;

public class ChaosTunnelPortal extends ObjectScript {

	@Override
	public Object[] getKeys() {
		return new Object[] { 77745, 28779 };
	}

	@Override
	public int getDistance() {
		return 0;
	}

	@Override
	public boolean processObject(Player player, WorldObject object) {
		player.addWalkSteps(object.getX(), object.getY(), -1, false);
		WorldTasksManager.schedule(new WorldTask() {

			@Override
			public void run() {
				if (getRepeatedTele(player, 3285, 5474, 0, 3286, 5470, 0))
					return;
				else if (getRepeatedTele(player, 3302, 5469, 0, 3290, 5463, 0))
					return;
				else if (getRepeatedTele(player, 3280, 5460, 0, 3273, 5460, 0))
					return;
				else if (getRepeatedTele(player, 3299, 5450, 0, 3296, 5455, 0))
					return;
				else if (getRepeatedTele(player, 3283, 5448, 0, 3287, 5448, 0))
					return;
				else if (getRepeatedTele(player, 3260, 5491, 0, 3266, 5446, 0))
					return;
				else if (getRepeatedTele(player, 3239, 5498, 0, 3244, 5495, 0))
					return;
				else if (getRepeatedTele(player, 3238, 5507, 0, 3232, 5501, 0))
					return;
				else if (getRepeatedTele(player, 3222, 5488, 0, 3218, 5497, 0))
					return;
				else if (getRepeatedTele(player, 3222, 5474, 0, 3224, 5479, 0))
					return;
				else if (getRepeatedTele(player, 3215, 5475, 0, 3218, 5478, 0))
					return;
				else if (getRepeatedTele(player, 3210, 5477, 0, 3208, 5471, 0))
					return;
				else if (getRepeatedTele(player, 3212, 5452, 0, 3214, 5456, 0))
					return;
				else if (getRepeatedTele(player, 3235, 5457, 0, 3229, 5454, 0))
					return;
				else if (getRepeatedTele(player, 3204, 5445, 0, 3197, 5448, 0))
					return;
				else if (getRepeatedTele(player, 3191, 5495, 0, 3194, 5490, 0))
					return;
				else if (getRepeatedTele(player, 3185, 5478, 0, 3191, 5482, 0))
					return;
				else if (getRepeatedTele(player, 3186, 5472, 0, 3192, 5472, 0))
					return;
				else if (getRepeatedTele(player, 3189, 5444, 0, 3187, 5460, 0))
					return;
				else if (getRepeatedTele(player, 3178, 5460, 0, 3168, 5456, 0))
					return;
				else if (getRepeatedTele(player, 3171, 5478, 0, 3167, 5478, 0))
					return;
				else if (getRepeatedTele(player, 3171, 5473, 0, 3167, 5471, 0))
					return;
				else if (getRepeatedTele(player, 3142, 5489, 0, 3141, 5480, 0))
					return;
				else if (getRepeatedTele(player, 3142, 5462, 0, 3154, 5462, 0))
					return;
				else if (getRepeatedTele(player, 3155, 5449, 0, 3143, 5443, 0))
					return;
				else if (getRepeatedTele(player, 3303, 5477, 0, 3299, 5484, 0))
					return;
				else if (getRepeatedTele(player, 3318, 5481, 0, 3322, 5480, 0))
					return;
				else if (getRepeatedTele(player, 3307, 5496, 0, 3317, 5496, 0))
					return;
				else if (getRepeatedTele(player, 3265, 5491, 0, 3260, 5491, 0))
					return;
				else if (getRepeatedTele(player, 3297, 5510, 0, 3300, 5514, 0))
					return;
				else if (getRepeatedTele(player, 3325, 5518, 0, 3323, 5531, 0))
					return;
				else if (getRepeatedTele(player, 3321, 5554, 0, 3315, 5552, 0))
					return;
				else if (getRepeatedTele(player, 3291, 5555, 0, 3285, 5556, 0))
					return;
				else if (getRepeatedTele(player, 3285, 5508, 0, 3280, 5501, 0))
					return;
				else if (getRepeatedTele(player, 3285, 5527, 0, 3282, 5531, 0))
					return;
				else if (getRepeatedTele(player, 3289, 5532, 0, 3288, 5536, 0))
					return;
				else if (getRepeatedTele(player, 3266, 5552, 0, 3262, 5552, 0))
					return;
				else if (getRepeatedTele(player, 3268, 5534, 0, 3261, 5536, 0))
					return;
				else if (getRepeatedTele(player, 3248, 5547, 0, 3253, 5561, 0))
					return;
				else if (getRepeatedTele(player, 3256, 5561, 0, 3252, 5543, 0))
					return;
				else if (getRepeatedTele(player, 3244, 5526, 0, 3241, 5529, 0))
					return;
				else if (getRepeatedTele(player, 3230, 5547, 0, 3226, 5553, 0))
					return;
				else if (getRepeatedTele(player, 3206, 5553, 0, 3204, 5546, 0))
					return;
				else if (getRepeatedTele(player, 3211, 5533, 0, 3214, 5533, 0))
					return;
				else if (getRepeatedTele(player, 3208, 5527, 0, 3211, 5523, 0))
					return;
				else if (getRepeatedTele(player, 3201, 5531, 0, 3197, 5529, 0))
					return;
				else if (getRepeatedTele(player, 3202, 5516, 0, 3196, 5512, 0))
					return;
				else if (getRepeatedTele(player, 3197, 5529, 0, 3201, 5531, 0))
					return;
				else if (getRepeatedTele(player, 3165, 5515, 0, 3173, 5530, 0))
					return;
				else if (getRepeatedTele(player, 3156, 5523, 0, 3152, 5520, 0))
					return;
				else if (getRepeatedTele(player, 3148, 5533, 0, 3153, 5537, 0))
					return;
				else if (getRepeatedTele(player, 3143, 5535, 0, 3147, 5541, 0))
					return;
				else if (getRepeatedTele(player, 3158, 5561, 0, 3162, 5557, 0))
					return;
				else if (getRepeatedTele(player, 3162, 5545, 0, 3166, 5553, 0))
					return;
				else if (getRepeatedTele(player, 3168, 5541, 0, 3171, 5542, 0))
					return;
				else if (getRepeatedTele(player, 3190, 5549, 0, 3190, 5554, 0))
					return;
				else if (getRepeatedTele(player, 3180, 5557, 0, 3174, 5558, 0))
					return;
				else if (getRepeatedTele(player, 3190, 5519, 0, 3190, 5515, 0))
					return;
				else if (getRepeatedTele(player, 3185, 5518, 0, 3181, 5517, 0))
					return;
				else if (getRepeatedTele(player, 3196, 5512, 0, 3202, 5516, 0))
					return;
			}
		});
		return true;
	}

	private static boolean getRepeatedTele(Player player, int x1, int y1, int p1, int x2, int y2, int p2) {
		if (player.getX() == x1 && player.getY() == y1) {
			player.useStairs(17803, new WorldTile(x2, y2, p2), 2, 3);
			return true;
		} else if (player.getX() == x2 && player.getY() == y2) {
			player.useStairs(17803, new WorldTile(x1, y1, p1), 2, 3);
			return true;
		}
		return false;
	}

	@Override
	public boolean processObject2(Player player, WorldObject object) {
		return true;
	}
}
