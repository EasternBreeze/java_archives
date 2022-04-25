package q15_world_domination;

public final class WorldDomination {

	public static void main(String[] args) {
		WorldMap map = new WorldMap(4, 4,
				new int[] { //
						0, 2, 1, 1, //
						9, 1, 9, 7, //
						3, 1, 8, 6, //
						5, 2, 1, 1 });

		map.timelapse();
	}

}
