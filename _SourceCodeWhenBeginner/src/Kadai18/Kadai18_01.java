package Kadai18;

public class Kadai18_01 {

	public static void main(String[] args) {
		String[] array = { "JS", "Java", "PHP" };
		String s = toWord(array);
		System.out.println(s);
	}

	private static String toWord(String[] array) {
		if (array.length == 0) {
			return null;
		}

		String strings = "";
		for (String str : array) {
			strings += str;
		}
		return strings;
	}

}
