package gameNumberHitter;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GameNumbersHitter {

	/* 「NumbersHitter」
	 * ランダムに選ばれた数字(1～100)を当てるゲーム
	 * 入力した値が答えより大きいか小さいかが返ってきます
	 *
	 * = = = = =
	 *
	 * コマンドライン引数:
	 * args[0] = 乱数の最大値
	 *  (Limit min:1 / max:Integer.MAX_VALUE)
	 *  (if (n < 0) =100)
	 *
	 * ※例：500→1～500までの値が選ばれます
	 * ※負の数が与えられると100(デフォルト値)になります
	 * ※数値以外が入力されるとエラーメッセージを出力して終了します
	 *
	 * = = = = =
	 *
	 * Tips:
	 * 「0」を入力すると勝手に数字を入れてくれます(二分探索による)
	 *
	 * 入力値が範囲外もしくは数値以外の場合、再入力を求められます
	 * ※解答回数は増えません
	 *
	 * = = = = =
	 * */

	static Random rand = new Random();

	enum JUDGE { // 入力した値が...
		LOW, // 答えより小さい
		HIGH, // 答えより大きい
		JUST, // 答えと同じ
		OVER // 範囲外
	}

	public static void main(String[] args) {
		// =====【引数変換処理】=====
		int cmd = 0;
		try {
			cmd = args.length == 0 ? 100 : Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			System.out.println("[ERROR] コマンドライン引数が異常です");
			return;
		}
		// ==========

		// =====【変数宣言/初期化】=====
		final int MAX_ANSWER = cmd > 0 ? cmd : 100;
		final int ANSWER = rand.nextInt(MAX_ANSWER) + 1;
		Scanner scan = new Scanner(System.in);
		int aiLow = 1;
		int aiHigh = MAX_ANSWER;
		int entryCount = 0;
		// ==========
		//

		//
		// =====【メインループ】=====
		while (true) {
			try {
				System.out.print("数字を入力 (1～" + MAX_ANSWER + ") -> ");
				int input = scan.nextInt();
				System.out.println("= = = = =");

				if (input == 0) {
					input = (aiLow + aiHigh) / 2;
					System.out.println("[Auto] Entry to " + input);
				}

				switch (judgment(input, ANSWER, MAX_ANSWER)) {
				case OVER:
					System.out.println("範囲外です");
					continue;
				case JUST:
					System.out.println("正解!! 解答回数 " + entryCount + "回");
					scan.close();
					return;
				case HIGH:
					System.out.println(input + "より大きいです");
					aiLow = input + 1;
					break;
				case LOW:
					System.out.println(input + "より小さいです");
					aiHigh = input - 1;
					break;
				}
				entryCount++;

			} catch (InputMismatchException e) {
				System.out.println("ERROR [数字以外が入力されました]");
				scan.next();
			}
		}
		// ==========
	}

	private static JUDGE judgment(int n, final int ANSWER, final int MAX_ANSWER) {
		if (n < 1 || n > MAX_ANSWER) {
			return JUDGE.OVER;
		}

		if (n == ANSWER) {
			return JUDGE.JUST;
		} else if (n < ANSWER) {
			return JUDGE.HIGH;
		}
		return JUDGE.LOW;
	}

}
