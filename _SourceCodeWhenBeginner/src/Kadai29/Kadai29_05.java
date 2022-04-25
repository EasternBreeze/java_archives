package Kadai29;

public class Kadai29_05 {

	public static void main(String[] args) {
		int a = 1071;
		int b = 1029;

		int div = getGCD(a, b);
		System.out.println(a + "と" + b + "の最大公約数は" + div);
	}

	private static int getGCD(int n1, int n2) {
		if (n2 == 0) {
			return n1;
		}

		return getGCD(n2, n1 % n2);
	}

}
