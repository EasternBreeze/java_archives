package Kadai12;

public class Kadai12_07 {

	public static void main(String[] args) {
		int[] score = { 60, 40, 90, 10, 40, 30, 70 };

		int total = 0;

		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}

		double avg = (double) total / score.length;

		System.out.println("平均点数 " + avg);
		System.out.println("=====");

		total = 0;

		for (int value : score) {
			total += value;
		}

		avg = (double) total / score.length;
		System.out.println("平均点数 " + avg);
	}

}
