package fraction_ext;

import java.util.function.Consumer;

public interface F {

	F NULL = new F() {
		@Override
		public String toString() {
			return "NotFraction";
		}

		@Override
		public F peek(Consumer<F> action) {
			action.accept(this);
			return this;
		}

		@Override
		public double toDouble() {
			return 0;
		}

		@Override
		public F inverse() {
			return this;
		}

		@Override
		public F add(F other) {
			return this;
		}

		@Override
		public F sub(F other) {
			return this;
		}

		@Override
		public F multi(F other) {
			return this;
		}

		@Override
		public F div(F other) {
			return this;
		}

		@Override
		public F add(int n) {
			return this;
		}

		@Override
		public F sub(int n) {
			return this;
		}

		@Override
		public F multi(int n) {
			return this;
		}

		@Override
		public F div(int n) {
			return this;
		}

	};

	F ZERO = new Fraction(0, 1);

	static F of(int numerator) {
		return new Fraction(numerator, 1);
	}

	static F of(int numerator, int denominator) {
		if (denominator == 0) {
			return NULL;
		}

		if (numerator == 0) {
			return ZERO;
		}
		if (numerator == denominator) {
			return new Fraction(1, 1);
		}

		int gcd = getGCD(numerator, denominator);
		numerator /= gcd;
		denominator /= gcd;

		if (denominator < 0) {
			numerator *= -1;
			denominator *= -1;
		}

		return new Fraction(numerator, denominator);
	}

	private static int getGCD(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);

		int high = a > b ? a : b;
		int low = a < b ? a : b;

		while (low > 0) {
			int div = high % low;
			high = low;
			low = div;
		}
		return high;
	}

	F peek(Consumer<F> action);

	double toDouble();

	F inverse();

	F add(int n);

	F add(F other);

	F sub(int n);

	F sub(F other);

	F multi(int n);

	F multi(F other);

	F div(int n);

	F div(F other);

}
