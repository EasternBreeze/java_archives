package Kadai12;

public class Kadai12_09 {

	public static void main(String[] args) {
		int[] score = { 60, 40, 90, 10, 40, 30, 70 };

		int min = score[0];

		for (int i = 0; i < score.length; i++) {
			if (score[i] < min) {
				min = score[i];
			}
		}

		System.out.println("最低点数 " + min);
		System.out.println("=====");

		min = score[0];

		for (int value : score) {
			if (value < min) {
				min = value;
			}
		}

		System.out.println("最低点数 " + min);
	}

}
