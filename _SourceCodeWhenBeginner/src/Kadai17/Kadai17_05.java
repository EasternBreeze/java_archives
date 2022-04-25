package Kadai17;

public class Kadai17_05 {

	public static void main(String[] args) {
		String s = enclose("いぬ");
		System.out.println(s);
	}

	private static String enclose(String str) {
		str = "＜" + str + "＞";
		return str;
	}

}
