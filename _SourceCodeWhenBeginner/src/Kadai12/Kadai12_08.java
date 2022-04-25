package Kadai12;

public class Kadai12_08 {

	public static void main(String[] args) {
		int[] score = { 60, 40, 90, 10, 40, 30, 70 };

		int max = 0;

		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
		}

		System.out.println("最高点数 " + max);
		System.out.println("=====");

		max = 0;

		for (int value : score) {
			if (value > max) {
				max = value;
			}
		}

		System.out.println("最高点数 " + max);
	}

}
