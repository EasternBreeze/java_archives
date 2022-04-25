package Kadai13;

public class Kadai13_06 {

	public static void main(String[] args) {
		int[] score = { 60, 40, 90, 10, 40, 30, 70 };

		String Great = "優";
		String Good = "良";
		String Nice = "可";

		for (int value : score) {
			if (value >= 70) {
				Great += " " + value;
			} else if (value <= 30) {
				Nice += " " + value;
			} else {
				Good += " " + value;
			}
		}

		System.out.println(Great + "\n" + Good + "\n" + Nice);
	}

}
