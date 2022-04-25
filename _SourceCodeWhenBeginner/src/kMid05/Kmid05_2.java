package kMid05;

public class Kmid05_2 {

	public static void main(String[] args) {
		int[][] field = {
				{ 0, 0, 0, 0, 2, 0, 0, 0 },
				{ 0, 0, 0, 0, 2, 2, 0, 0 },
				{ 0, 0, 0, 0, 2, 1, 2, 2 },
				{ 0, 0, 0, 2, 2, 2, 2, 2 },
				{ 0, 0, 2, 1, 2, 1, 2, 2 },
				{ 0, 0, 1, 2, 2, 1, 1, 0 },
				{ 0, 0, 0, 1, 2, 0, 0, 0 },
				{ 0, 0, 0, 0, 1, 1, 1, 0 },
		};

		int result = 0; // 黒が置ける場所の個数
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[0].length; j++) {
				if (canPut(field, i, j)) {
					result++;
				}
			}
		}
		System.out.println(result);
	}

	static boolean canPut(int[][] f, int y, int x) {
		if (f[y][x] != 0) { // すでに置かれていた場合、即リターン
			return false;
		}
		if (canPut(f, y - 1, x, -1, 0, 0)) { // 上
			return true;
		}
		if (canPut(f, y + 1, x, 1, 0, 0)) { // 下
			return true;
		}
		if (canPut(f, y, x + 1, 0, 1, 0)) { // 右
			return true;
		}
		if (canPut(f, y, x - 1, 0, -1, 0)) { // 左
			return true;
		}
		if (canPut(f, y - 1, x + 1, -1, 1, 0)) { // 右上
			return true;
		}
		if (canPut(f, y + 1, x + 1, 1, 1, 0)) { // 右下
			return true;
		}
		if (canPut(f, y - 1, x - 1, -1, -1, 0)) { // 左上
			return true;
		}
		if (canPut(f, y + 1, x - 1, 1, -1, 0)) { // 左下
			return true;
		}
		return false;
	}

	/**
	 * 黒のコマが置けるかどうか再帰的に調べる。(再帰関数)
	 * @param f 盤面
	 * @param y 行番号
	 * @param x 列番号
	 * @param dy 行番号の増分（次のマスの座標を計算する際に使用）
	 * @param dx 列番号の増分（次のマスの座標を計算する際に使用）
	 * @param step 再帰した回数
	 * @return 黒のコマが置けるなら true
	 */
	static boolean canPut(int[][] f, int y, int x,
			int dy, int dx, int step) {
		if (y < 0 || y >= f.length) {
			return false;
		}
		if (x < 0 || x >= f[0].length) {
			return false;
		}
		if (f[y][x] == 0) {
			return false;
		}
		if (f[y][x] == 1) { // 黒いコマに当たったらこの処理
			return step >= 1; // 黒→黒だと返す白コマがないのでstep 1以上であることが必須
		}
		// ===== ここから
		return canPut(f, y + dy, x + dx, dy, dx, step + 1);
		// ===== ここまで
	}
}
