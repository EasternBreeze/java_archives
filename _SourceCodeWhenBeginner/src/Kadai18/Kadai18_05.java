package Kadai18;

public class Kadai18_05 {

	public static void main(String[] args) {
		int max = getMax(8, -4, 6, 0);
		System.out.println(max);
	}

	private static int getMax(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		} else {
			return n2;
		}
	}

	private static int getMax(int n1, int n2, int n3) {
		int m = getMax(n1, n2);
		if (n3 > m) {
			return n3;
		} else {
			return m;
		}
	}

	private static int getMax(int n1, int n2, int n3, int n4) {
		int m = getMax(n1, n2, n3);
		if (n4 > m) {
			return n4;
		} else {
			return m;
		}
	}
}
