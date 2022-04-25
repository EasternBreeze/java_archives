package Kadai17;

public class Kadai17_11 {

	public static void main(String[] args) {
		int[] nums = { -4, 5, -9 };
		int n = getHead(nums);
		System.out.println(n);
	}

	private static int getHead(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		return nums[0];
	}

}
