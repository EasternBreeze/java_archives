package gameHitAndBlow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GameHitAndBlow {

	/* 「Hit&Blow」
	 * ランダムに決められた4桁の数字を当てるゲーム
	 * 答えは0~9までの数字で同じ数字を2回以上使わない
	 * ※0から始まる可能性もあります(例:0123や0987)
	 */

	public static void main(String[] args) {
		int[] ans = new int[4]; // 桁数を変更したい場合はこちら
		generateNumber(ans); // 答えとなる数字を決定(int型配列)

		Scanner scan = new Scanner(System.in);
		List<String> history = new ArrayList<>();
		List<Integer> hisHit = new ArrayList<>();
		List<Integer> hisBlow = new ArrayList<>();

		// =====【メインループ】=====
		while (true) {
			System.out.println("v " + ans.length + "桁の数字を入力してください v");
			String input = scan.next();

			if (input.length() != ans.length) { // 答えの桁数と違う場合はここで弾く
				System.out.println("[ERROR]入力の長さが違います");
				continue;
			}

			try {
				// 入力されたものをint型配列に変換
				// ここのfor文で数字以外が入力されていた場合、例外処理へ
				int[] playerAns = new int[ans.length];
				for (int i = ans.length - 1, n = Integer.valueOf(input); i >= 0; i--, n /= 10) {
					playerAns[i] = n % 10;
				}

				// HitとBlowを取得(BlowはHitと重なるところがあるので-hitで減算)
				int hit = getHit(ans, playerAns);
				int blow = getBlow(ans, playerAns) - hit;

				// 結果を履歴に追加
				history.add(input);
				hisHit.add(hit);
				hisBlow.add(blow);

				// 正解(hit == 4)の場合はこちらでBreak
				if (hit == ans.length) {
					System.out.println("Nice Hit!! 回数:" + history.size());
					break;
				}

				// コンソールから見切れるので履歴をすべて表示
				System.out.println("= = = = =");
				for (int i = 0; i < history.size(); i++) {
					System.out.printf("[%02d] %s Hit:%d Blow:%d\n", i + 1, history.get(i), hisHit.get(i),
							hisBlow.get(i));
				}

			} catch (NumberFormatException e) { // 長さ4で数字以外が入力されていた場合
				System.out.println("[ERROR]数字以外が入力されました");
			}
		}
		// ==========

		scan.close();
	}

	private static int getHit(int[] ans, int[] playerAns) {
		int hitCount = 0;

		for (int i = 0; i < ans.length; i++) {
			if (ans[i] == playerAns[i]) {
				hitCount++;
			}
		}
		return hitCount;
	}

	private static int getBlow(int[] ans, int[] playerAns) {
		int blowCount = 0;

		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < playerAns.length; j++) {
				if (ans[i] == playerAns[j]) {
					blowCount++;
					break;
				}
			}
		}
		return blowCount;
	}

	private static void generateNumber(int[] ans) {
		List<Integer> box = new ArrayList<>();

		// 0~9までの数字を箱にいれてシャッフル
		for (int i = 0; i <= 9; i++) {
			box.add(i);
		}
		Collections.shuffle(box);

		for (int i = 0; i < ans.length; i++) {
			ans[i] = box.get(i);
		}
	}

}
