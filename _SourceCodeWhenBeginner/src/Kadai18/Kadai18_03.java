package Kadai18;

public class Kadai18_03 {

	public static void main(String[] args) {
		String[] array1 = { "A", "B" };
		String[] array2 = { "X", "Y", "Z" };
		String[] array3 = joinArray(array1, array2);
		for (String s : array3) {
			System.out.println(s);
		}
	}

	private static String[] joinArray(String[] array1, String[] array2) {
		//		if (array1.length == 0 && array2.length == 0) {
		//			return null;
		//		}

		String[] array3 = new String[array1.length + array2.length];
		int addPos = 0;

		for (String str : array1) {
			array3[addPos] = str;
			addPos++;
		}
		for (String str : array2) {
			array3[addPos] = str;
			addPos++;
		}

		return array3;
	}

}
