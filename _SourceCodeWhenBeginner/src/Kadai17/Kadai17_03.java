package Kadai17;

public class Kadai17_03 {

	public static void main(String[] args) {
		int min = getMin(3, -2, 1);
		System.out.println(min);
	}

	private static int getMin(int n1, int n2, int n3) {
		if (n1 > n2 && n1 > n3) {
			return n1;
		} else if (n2 > n3) {
			return n2;
		} else {
			return n3;
		}
	}

}
