package Kadai07;

public class Kadai07_06 {

	public static void main(String[] args) {
		int father = 42;
		int oldSon = 20;
		int youngSon = 7;

		while (youngSon * 2 != oldSon) {
			father++;
			oldSon++;
			youngSon++;
		}

		System.out.println(father);
	}

}

//while (youngSon != oldSon / 2) ←切り捨て食らってバグる