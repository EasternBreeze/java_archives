package Kadai15;

public class Kadai15_07 {

	public static void main(String[] args) {
		String[] student = { "野比", "ドラ", "骨川", "剛田" };
		int[] english = { 65, 80, 50, 50 }; // 英語
		int[] math = { 20, 60, 100, 50 }; // 数学

		System.out.println("科目 最低");

		int minE = english[0];
		int minM = math[0];

		for (int n : english) {
			minE = Math.min(minE, n);
		}
		for (int n : math) {
			minM = Math.min(minM, n);
		}

		System.out.println("英語 " + minE + "\n数学 " + minM);
	}

}
