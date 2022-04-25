package q19_slash_maze;

public final class SlashMaze {

	// タイル総パターン数 		8388608(2^23)
	// ゴール可能パターン数 	2720644(maybe)
	// ゴール可能パターン生成率 32.4326%(maybe)

	public static void main(String[] args) {
		//		int count = 0;
		//
		//		for (int i = 0; i <= 8388607; i++) {
		//			TileMap t = new TileMap(i);
		//			if (t.canGoal()) {
		//				count++;
		//			}
		//			System.out.println(i);
		//		}
		//		System.out.println(count);

		TileMap t1 = new TileMap(false);
		System.out.println(t1);

		TileMap t2 = new TileMap(true);
		System.out.println(t2);
	}

}
