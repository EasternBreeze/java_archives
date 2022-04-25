package Kadai18;

public class Kadai18_02 {

	public static void main(String[] args) {
		String[] array = { "A", "B", "C", "D" };
		String[] reverse = getReverse(array);
		for (String s : reverse) {
			System.out.println(s);
		}
	}

	private static String[] getReverse(String[] array) {
		if (array.length == 0) {
			return null;
		}

		String[] reverse = new String[array.length];
		int addPos = array.length - 1;

		for (String str : array) {
			reverse[addPos] = str;
			addPos--;
		}

		return reverse;
	}

}
