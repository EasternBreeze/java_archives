package Kadai16;

public class Kadai16_12 {

	public static void main(String[] args) {
		String name = getName("鈴木一郎");
		System.out.println(name);

	}

	private static String getName(String str) {
		str = "私の名前は" + str + "です";
		return str;
	}

}
