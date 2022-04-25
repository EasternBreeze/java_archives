package Kadai13;

public class Kadai13_04 {

	public static void main(String[] args) {
		int[] score = { 60, 40, 90, 10, 40, 30, 70 };

		for (int i = 0; i < score.length; i++) {
			if (score[i] >= 70) {
				System.out.println(score[i] + "点 優");
			} else if (score[i] <= 30) {
				System.out.println(score[i] + "点 可");
			} else {
				System.out.println(score[i] + "点 良");
			}
		}

		System.out.println("=====");

		for (int value : score) {
			if (value >= 70) {
				System.out.println(value + "点 優");
			} else if (value <= 30) {
				System.out.println(value + "点 可");
			} else {
				System.out.println(value + "点 良");
			}
		}

	}

}
