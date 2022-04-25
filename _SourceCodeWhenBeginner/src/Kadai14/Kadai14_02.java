package Kadai14;

public class Kadai14_02 {

	public static void main(String[] args) {
		int[] score = { 60, 40, 90, 10, 40, 30, 70 };

		for (int i = 0; i < score.length; i++) {

			for (int j = 1; j < score.length - i; j++) {
				int num1 = score[j - 1];
				int num2 = score[j];

				if (num1 < num2) {
					score[j - 1] = num2;
					score[j] = num1;
				}
			}

		}

		for (int value : score) {
			System.out.println(value + "点");
		}

	}

}
