package online220125;

public final class ThreeNumbers {

	public static void main(String[] args) {
		int[] ans = search(109);

		for (int n : ans) {
			System.out.println(n);
		}
	}

	private static int[] search(int target) {
		int n = 0;

		while (true) {
			if (n + (n + 1) == target) {
				return new int[] { 0, n, n + 1 };
			}
			if (n + (n + 1) + (n + 4) == target) {
				return new int[] { n, (n + 1), (n + 4) };
			}
			if ((n + 1) + (n + 4) == target) {
				return new int[] { (n + 1), (n + 4), 0 };
			}

			n += 2;
		}
	}

}
