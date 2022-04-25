package q04_how_minute;

public final class HowMinute {

	private static class House {
		private final int x;
		private final int y;

		private House(int x, int y) {
			this.x = x;
			this.y = y;
		}

		private boolean isValid() {
			if (x != 0 && y != 0) {
				return false;
			}
			if (x < -3 || x > 3) {
				return false;
			}
			if (y < -3 || y > 3) {
				return false;
			}

			return true;
		}

		@Override
		public String toString() {
			return String.format("(%2d,%2d)", x, y);
		}
	}

	public static void main(String[] args) {
		{
			House a = new House(0, 2);
			House b = new House(0, 2);
			System.out.printf("A:%s B:%s %d分\n", a, b, navigate(a, b));
		}
		{
			House a = new House(-2, 0);
			House b = new House(3, 0);
			System.out.printf("A:%s B:%s %d分\n", a, b, navigate(a, b));
		}
		{
			House a = new House(0, 0);
			House b = new House(0, -3);
			System.out.printf("A:%s B:%s %d分\n", a, b, navigate(a, b));
		}
		{
			House a = new House(0, 1);
			House b = new House(-3, 0);
			System.out.printf("A:%s B:%s %d分\n", a, b, navigate(a, b));
		}
		{
			House a = new House(1, 0);
			House b = new House(0, 2);
			System.out.printf("A:%s B:%s %d分\n", a, b, navigate(a, b));
		}
		{
			House a = new House(1, 0);
			House b = new House(1, 1);
			System.out.printf("A:%s B:%s %d分\n", a, b, navigate(a, b));
		}
	}

	private static int navigate(House from, House to) {
		if (!from.isValid() || !to.isValid()) {
			return -1;
		}

		if (from.x == to.x) {
			return Math.abs((from.y - to.y) * 2);
		}
		if (from.y == to.y) {
			return Math.abs((from.x - to.x) * 2);
		}

		House absFrom = new House(Math.abs(from.x), Math.abs(from.y));
		House absTo = new House(Math.abs(to.x), Math.abs(to.y));

		int time = 0;
		if (absFrom.x == 0) {
			time += Math.abs(absFrom.y - absTo.x) * 2;
			time += absFrom.y < absTo.x ? absFrom.y * 3 : absTo.x * 3;
		} else {
			time += Math.abs(absFrom.x - absTo.y) * 2;
			time += absFrom.x < absTo.y ? absFrom.x * 3 : absTo.y * 3;
		}
		return time;
	}
}
