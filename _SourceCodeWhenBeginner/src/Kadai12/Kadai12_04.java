package Kadai12;

public class Kadai12_04 {

	public static void main(String[] args) {
		int[] score = { 60, 40, 90, 10, 40, 30, 70 };

		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i] + "点");
		}

		System.out.println("=====");

		for (int value : score) {
			System.out.println(value + "点");
		}

	}

}
