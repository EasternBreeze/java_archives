package Kadai13;

public class Kadai13_01 {

	public static void main(String[] args) {
		int[] score = { 60, 40, 90, 10, 40, 30, 70 };

		for (int i = 0; i < score.length; i++) {
			if (score[i] >= 60) {
				System.out.println(score[i] + "点 合格");
			} else {
				System.out.println(score[i] + "点");
			}
		}
		
		System.out.println("=====");

		for (int value : score) {
			if (value >= 60) {
				System.out.println(value + "点 合格");
			} else {
				System.out.println(value + "点");
			}
		}

	}

}
