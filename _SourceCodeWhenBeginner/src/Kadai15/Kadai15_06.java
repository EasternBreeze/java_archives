package Kadai15;

public class Kadai15_06 {

	public static void main(String[] args) {
		String[] student = { "野比", "ドラ", "骨川", "剛田" };
		int[] english = { 65, 80, 50, 50 }; // 英語
		int[] math = { 20, 60, 100, 50 }; // 数学

		System.out.println("科目 最高");

		int maxE = 0;
		int maxM = 0;

		for (int n : english) {
			maxE = Math.max(maxE, n);
		}
		for (int n : math) {
			maxM = Math.max(maxM, n);
		}

		System.out.println("英語 " + maxE + "\n数学 " + maxM);
	}

}
