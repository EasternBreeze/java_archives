package Kadai14;

import java.util.Arrays;

public class Kadai14_05 {

	public static void main(String[] args) {
		int[] score = { 60, 40, 90, 10, 40, 30, 70 };

		Arrays.sort(score);

		int flagBorder = 0;

		for (int i = score.length - 1; i >= 0; i--) {
			if (flagBorder == 0 && score[i] < 60) {
				System.out.println("-----");
				flagBorder = 1;
			}
			System.out.println(score[i] + "点");
		}

	}

}
