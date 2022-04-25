package Kadai18;

public class Kadai18_06 {

	public static void main(String[] args) {
		int max = getMax(8, -4, 6, 0, -1);
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

	private static int getMax(int n1, int n2, int n3, int n4, int n5) {
		int m = getMax(n1, n2, n3, n4);
		if (n5 > m) {
			return n5;
		} else {
			return m;
		}
	}

}
