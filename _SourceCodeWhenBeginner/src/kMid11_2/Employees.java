package kMid11_2;

import java.util.ArrayList;
import java.util.List;

public final class Employees {
	private final List<Employee> list = new ArrayList<>();

	public void add(Employee employee) {
		list.add(employee);
	}

	public Employee get(String id) {
		// ===== ここから
		for (Employee e : list) {
			if (e.id().equals(id)) {
				return e;
			}
		}
		return null;
		// ===== ここまで
	}
}