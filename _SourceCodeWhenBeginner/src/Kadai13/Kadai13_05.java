package Kadai13;

public class Kadai13_05 {

	public static void main(String[] args) {
		int[] score = { 60, 40, 90, 10, 40, 30, 70 };

		int countGreat = 0;
		int countGood = 0;
		int countNice = 0;

		for (int value : score) {
			if (value >= 70) {
				countGreat++;
			} else if (value <= 30) {
				countNice++;
			} else {
				countGood++;
			}
		}

		System.out.printf("優 %d人\n良 %d人\n可 %d人\n", countGreat, countGood, countNice);
	}

}
