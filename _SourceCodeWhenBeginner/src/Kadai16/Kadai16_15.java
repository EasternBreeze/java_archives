package Kadai16;

public class Kadai16_15 {

	public static void main(String[] args) {
		String s = getAdult(20);
		System.out.println(s);
	}

	private static String getAdult(int age) {
		String str = "";
		if (age >= 20) {
			str = "成人";
		} else {
			str = "未成年";
		}
		return str;
	}

}
