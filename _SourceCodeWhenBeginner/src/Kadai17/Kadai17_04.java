package Kadai17;

public class Kadai17_04 {

	public static void main(String[] args) {
		int diff = getDiff(3, 8);
		System.out.println(diff);
	}

	private static int getDiff(int n1, int n2) {
		int ans = n1 - n2;
		if (ans < 0) {
			ans *= -1;
		}

		return ans;
	}

}
