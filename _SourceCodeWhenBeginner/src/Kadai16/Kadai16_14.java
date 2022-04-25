package Kadai16;

public class Kadai16_14 {

	public static void main(String[] args) {
		String name = getName("鈴木", "一郎");
		System.out.println(name);
	}

	private static String getName(String name1, String name2) {
		String str = name1 + name2;
		return str;
	}

}
