package kMid11_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Employees implements Iterable<Employee> {
	private final List<Employee> list = new ArrayList<>();

	public void add(String id, String name, String... ids) {
		list.add(new Employee(this, id, name, ids));
	}

	@Override
	public Iterator<Employee> iterator() {
		return list.iterator();
	}
}