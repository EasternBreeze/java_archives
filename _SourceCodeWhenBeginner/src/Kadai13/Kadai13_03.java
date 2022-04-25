package Kadai13;

public class Kadai13_03 {

	public static void main(String[] args) {
		int[] score = { 60, 40, 90, 10, 40, 30, 70 };

		int passCount = 0;

		for (int value : score) {
			if (value >= 60) {
				passCount++;
			}
		}

		System.out.println(passCount + "人");
	}

}
