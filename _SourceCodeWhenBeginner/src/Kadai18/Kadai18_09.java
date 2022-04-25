package Kadai18;

public class Kadai18_09 {

	public static void main(String[] args) {
		int max = getMax(8, -4, 6, 0, -1, 9, 3, 4, -5);
		System.out.println(max);
	}

	private static int getMax() {
		return 0;
	}

	private static int getMax(int n1) {
		return n1;
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

	private static int getMax(int n1, int n2, int n3, int n4, int n5, int n6) {
		int m = getMax(n1, n2, n3, n4, n5);
		if (n6 > m) {
			return n6;
		} else {
			return m;
		}
	}

	private static int getMax(int n1, int n2, int n3, int n4, int n5, int n6, int n7) {
		int m = getMax(n1, n2, n3, n4, n5, n6);
		if (n7 > m) {
			return n7;
		} else {
			return m;
		}
	}

	private static int getMax(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
		int m = getMax(n1, n2, n3, n4, n5, n6, n7);
		if (n8 > m) {
			return n8;
		} else {
			return m;
		}
	}

	private static int getMax(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
		int m = getMax(n1, n2, n3, n4, n5, n6, n7, n8);
		if (n9 > m) {
			return n9;
		} else {
			return m;
		}
	}

}
