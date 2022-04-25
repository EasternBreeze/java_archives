package Kadai15;

public class Kadai15_03 {

	public static void main(String[] args) {
		String[] student = { "野比", "ドラ", "骨川", "剛田" };
		int[] english = { 65, 80, 50, 50 }; // 英語
		int[] math = { 20, 60, 100, 50 }; // 数学

		System.out.println("氏名 平均");

		for (int i = 0; i < student.length; i++) {
			double avg = (double) (english[i] + math[i]) / 2;
			System.out.println(student[i] + " " + avg);
		}

	}

}
