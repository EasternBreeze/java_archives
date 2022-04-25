package Kadai14;

import java.util.Arrays;

public class Kadai14_04 {

	public static void main(String[] args) {
		int[] score = { 60, 40, 90, 10, 40, 30, 70 };

		Arrays.sort(score);

		for (int i = score.length - 1; i >= 0; i--) {
			System.out.println(score[i] + "点");
		}

		//		for (int value : score) {
		//			System.out.println(value + "点");
		//		}

	}

}
