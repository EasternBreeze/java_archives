package Kadai17;

public class Kadai17_14 {

	public static void main(String[] args) {
		int[] nums = { -4, 5, -9 };
		int min = getMin(nums);
		System.out.println(min);
	}

	private static int getMin(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int numMin = nums[0];
		for (int num : nums) {
			if (num < numMin) {
				numMin = num;
			}
		}

		return numMin;
	}

}
