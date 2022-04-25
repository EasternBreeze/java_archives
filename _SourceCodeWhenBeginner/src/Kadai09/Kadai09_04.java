package Kadai09;

public class Kadai09_04 {

	enum Type {
		A型, B型, O型, AB型,
	}

	public static void main(String[] args) {
		for (Type t : Type.values()) {
			System.out.println(t);
		}
	}

}
