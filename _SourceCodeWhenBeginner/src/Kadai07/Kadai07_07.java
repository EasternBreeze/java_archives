package Kadai07;

public class Kadai07_07 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);

			switch (i) {
			case 4:
			case 9: // 4と9は同じ処理なのでまとめる
				System.out.print(" 縁起が悪い数字です");
				break;
			case 7:
				System.out.print(" ラッキーナンバーです");
				break;
			}
			System.out.println();
		}
	}

}
