package q07_conways_problem;

public final class MultiSum {

	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 200; i++) {
			total += getProd(i);
		}

		System.out.println(total);
	}

	private static int getProd(int num) {
		int prod = 1;

		while (num > 0) {
			prod *= num % 10;
			num /= 10;
		}
		return prod;
	}
}
