package Kadai15;

public class Kadai15_01 {

	public static void main(String[] args) {
		String[] student = { "野比", "ドラ", "骨川", "剛田" };
		int[] english = { 65, 80, 50, 50 }; // 英語
		int[] math = { 20, 60, 100, 50 }; // 数学

		System.out.println("氏名 英語 数学");

		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i] + " " + english[i] + " " + math[i]);
		}

	}

}
