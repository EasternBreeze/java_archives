package Kadai12;

public class Kadai12_06 {

	public static void main(String[] args) {
		int[] score = { 60, 40, 90, 10, 40, 30, 70 };

		int total = 0;

		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}

		System.out.println("合計点数 " + total);
		System.out.println("=====");

		total = 0;

		for (int value : score) {
			total += value;
		}

		System.out.println("合計点数 " + total);
	}

}
