package Kadai14;

import java.util.Arrays;

public class Kadai14_03 {

	public static void main(String[] args) {
		int[] score = { 60, 40, 90, 10, 40, 30, 70 };
		
		Arrays.sort(score);

		for (int value : score) {
			System.out.println(value + "点");
		}

	}

}
