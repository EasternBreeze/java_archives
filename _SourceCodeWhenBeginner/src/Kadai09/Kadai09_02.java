package Kadai09;

public class Kadai09_02 {

	public static void main(String[] args) {
		int num = 1; // 表示する数字
		int back1 = 1; // 1個前の数字
		int back2 = 0; // 2個前の数字

		System.out.print(back2 + " " + back1 + " ");

		while (num <= 60) {
			System.out.print(num + " ");
			back2 = back1;
			back1 = num;
			num = back1 + back2;
		}

		System.out.println();
	}

}
