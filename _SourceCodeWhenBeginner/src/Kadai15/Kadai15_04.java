package Kadai15;

public class Kadai15_04 {

	public static void main(String[] args) {
		String[] student = { "野比", "ドラ", "骨川", "剛田" };
		int[] english = { 65, 80, 50, 50 }; // 英語
		int[] math = { 20, 60, 100, 50 }; // 数学

		System.out.println("科目 合計");

		int totalE = 0;
		int totalM = 0;

		for (int value : english) {
			totalE += value;
		}
		for (int value : math) {
			totalM += value;
		}

		System.out.println("英語 " + totalE + "\n数学 " + totalM);
	}

}
