package Kadai17;

public class Kadai17_10 {

	public static void main(String[] args) {
		int[] nums = { -4, 5, -9 };
		showSumArray(nums);
	}

	private static void showSumArray(int[] nums) {
		if (nums.length == 0) {
			System.out.println(0);
			return;
		}

		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		System.out.println(sum);
	}

}
