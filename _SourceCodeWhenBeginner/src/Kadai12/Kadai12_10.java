package Kadai12;

public class Kadai12_10 {

	public static void main(String[] args) {
		int[] score = { 60, 40, 90, 10, 40, 30, 70 };

		int total = 0;
		int max = 0;
		int min = score[0];

		for (int i = 0; i < score.length; i++) {
			total += score[i];
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}

		double avg = (double) total / score.length;

		System.out.println("受験人数 " + score.length);
		System.out.println("合計点数 " + total);
		System.out.println("平均点数 " + avg);
		System.out.println("最高点数 " + max + "\n最低点数 " + min);

		System.out.println("=====");

		total = 0;
		max = 0;
		min = score[0];

		for (int value : score) {
			total += value;
			if (value > max) {
				max = value;
			} else if (value < min) {
				min = value;
			}
		}

		avg = (double) total / score.length;

		System.out.println("受験人数 " + score.length);
		System.out.println("合計点数 " + total);
		System.out.println("平均点数 " + avg);
		System.out.println("最高点数 " + max + "\n最低点数 " + min);

	}

}
