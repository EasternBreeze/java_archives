package Kadai02;

public class Kadai02_02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		int c = a;
		a = b;
		b = c;
		c = a % b;
		System.out.println(c);

	}

}
