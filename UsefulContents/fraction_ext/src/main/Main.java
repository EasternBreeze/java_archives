package main;

import fraction_ext.F;

public final class Main {

	public static void main(String[] args) {
		F a = F.of(1, 3);
		F b = F.of(4, 3);

		System.out.println(a.add(a).add(a));
		System.out.println(F.of(1, 3)
				.multi(F.of(3, 1))
				.div(F.of(3, 1))
				.sub(F.of(3, 1)));
		System.out.println(F.of(63, -12).add(F.of(-8, -8)));
		System.out.println(F.of(1, 3).div(3));

	}
}