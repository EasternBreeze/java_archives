package Kadai29;

public class Kadai29_03 {

	public static void main(String[] args) {
		boolean[] bulb = new boolean[1000];

		for (int i = 1; i <= 1000; i++) { // iの倍数
			for (int j = 1; j <= 1000; j++) { // 1~1000番の電球
				if (j % i == 0) {
					// 条件式の形式上+1ずれているので修正して反転
					bulb[j - 1] = !bulb[j - 1];
				}
			}
		}

		int count = 0;
		for (boolean b : bulb) { // 点灯している(true)個数をチェック
			if (b) {
				count++;
			}
		}

		System.out.println(count + "個");
	}

}
