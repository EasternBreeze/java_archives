package Kadai09;

public class Kadai09_05 {

	public static void main(String[] args) {
		int age = 0;
		while (age % 7 != 3 || age % 5 != 2 || age % 3 != 1) {
			age++;
		}
		System.out.println(age + "歳");
	}

}
