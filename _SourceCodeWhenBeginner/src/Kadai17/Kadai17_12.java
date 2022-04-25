package Kadai17;

public class Kadai17_12 {

	public static void main(String[] args) {
		int[] nums = { -4, 5, -9 };
		int n = getTail(nums);
		System.out.println(n);
	}

	private static int getTail(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		return nums[nums.length - 1];
	}

}
