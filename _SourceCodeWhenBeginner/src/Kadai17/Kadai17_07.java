package Kadai17;

public class Kadai17_07 {

	public static void main(String[] args) {
		String word = "ABC";
		word += "!";
		boolean b = equals(word, "ABC!");
		System.out.println(b);
	}

	private static boolean equals(String str1, String str2) {
		if (str1.equals(str2)) { // str1 == str2 だと挙動がおかしい？
			return true;
		} else {
			return false;
		}
	}

}
