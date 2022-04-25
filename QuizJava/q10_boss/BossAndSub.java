package q10_boss;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public final class BossAndSub {

	public static void main(String[] args) {
		// Q1
		/*
		IntStream.range(1, 23).forEach(s -> {
			Employee e = Employee.of(s);
			System.out.printf("ID:%2d  Boss:%2d\n", e.id(), e.boss());
		});
		*/

		// Q2
		
		IntStream.range(1, 23).forEach(s -> {
			Employee e = Employee.of(s);
			System.out.printf("ID:%2d  Boss:", e.id());
			e.bosses()
					.forEach(n -> System.out.printf("%2d ", n));
			System.out.println();
		});
		

		// Q3
		/*
		List<Employee> emps = new ArrayList<>();
		IntStream.range(1, 23)
				.forEach(s -> emps.add(Employee.of(s)));

		emps.forEach(s -> {
			List<Employee> subs = emps.stream().filter(e -> s.id() == e.boss())
					.collect(Collectors.toList());

			System.out.printf("ID:%2d Subs:", s.id());
			subs.forEach(e -> System.out.printf("%2d ", e.id()));
			System.out.println();
		});
		*/
	}
}

final class Employee {
	private final int id;

	private final int boss;
	private final List<Integer> bosses;

	static Employee of(int id) throws IllegalArgumentException {
		if (id < 0) {
			throw new IllegalArgumentException();
		}
		return new Employee(id);
	}

	private Employee(int id) {
		this.id = id;
		this.boss = searchBoss(id);
		this.bosses = new ArrayList<>();

		bosses.add(boss);

		int n = boss;
		while (n > 1) {
			int next = searchBoss(n);
			bosses.add(next);
			n = next;
		}

		bosses.sort((n1, n2) -> Integer.compare(n1, n2));
	}

	int id() {
		return id;
	}

	int boss() {
		return boss;
	}

	List<Integer> bosses() {
		return new ArrayList<>(bosses);
	}

	private int searchBoss(int id) {
		if (id == 1 || id == 9) {
			return 1;
		}

		int sum = IntStream.range(1, id + 1)
				.filter(s -> id % s == 0)
				.sum();
		return sum < 22 ? sum : sum % id;
	}
}