package Kadai17;

public class Kadai17_13 {

	public static void main(String[] args) {
		int[] nums = { -4, 5, -9 };
		int max = getMax(nums);
		System.out.println(max);
	}

	private static int getMax(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int numMax = nums[0];
		for (int num : nums) {
			if (num > numMax) {
				numMax = num;
			}
		}

		return numMax;
	}

}
