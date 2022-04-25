package fraction_ext;

import java.util.function.Consumer;

final class Fraction implements F {

	private final int numerator;
	private final int denominator;

	protected Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	@Override
	public F peek(Consumer<F> action) {
		action.accept(this);
		return this;
	}

	@Override
	public String toString() {
		return String.format("%d/%d", numerator, denominator);
	}

	@Override
	public double toDouble() {
		return 1.0 * numerator / denominator;
	}

	@Override
	public F inverse() {
		return F.of(denominator, numerator);
	}

	@Override
	public F add(int n) {
		return F.of(numerator + n * denominator, denominator);
	}

	@Override
	public F add(F other) {
		if (other == NULL) {
			return NULL;
		}
		if (!(other instanceof F)) {
			return this;
		}
		Fraction f = (Fraction) other;
		return F.of(numerator * f.denominator + f.numerator * denominator,
				denominator * f.denominator);
	}

	@Override
	public F sub(int n) {
		return F.of(numerator - n * denominator, denominator);
	}

	@Override
	public F sub(F other) {
		if (other == NULL) {
			return NULL;
		}
		if (!(other instanceof F)) {
			return this;
		}
		Fraction f = (Fraction) other;
		return F.of(numerator * f.denominator - f.numerator * denominator,
				denominator * f.denominator);
	}

	@Override
	public F multi(int n) {
		return F.of(numerator * n, denominator);
	}

	@Override
	public F multi(F other) {
		if (other == NULL) {
			return NULL;
		}
		if (!(other instanceof F)) {
			return this;
		}
		Fraction f = (Fraction) other;
		return F.of(numerator * f.numerator, denominator * f.denominator);
	}

	@Override
	public F div(int n) {
		return F.of(numerator, denominator * n);
	}

	@Override
	public F div(F other) {
		if (other == NULL) {
			return NULL;
		}
		if (!(other instanceof F)) {
			return this;
		}
		Fraction f = (Fraction) other;
		return F.of(numerator * f.denominator, denominator * f.numerator);
	}
}