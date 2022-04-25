package kMid07;

public class Kmid07_1 {

	public static void main(String[] args) {
		int[] admission = { 0, 0, 1, 2, 5, 7, 9, 13, 27, 30 };
		int[] stay = { 60, 55, 50, 55, 20, 50, 50, 45, 30, 25 };

		int result = 0;
		for (int i = 0; i < 60; i++) {
			if (countFan(i, admission, stay) >= 8) {
				result++;
			}
		}
		System.out.println(result + "分");
	}

	private static int countFan(int minute, int[] admission, int[] stay) {
		int count = 0;
		for (int i = 0; i < admission.length; i++) {
			int leaveTime = admission[i] + stay[i];
			if (minute >= admission[i] && minute < leaveTime) {
				count++;
			}
		}
		return count;
	}

}
