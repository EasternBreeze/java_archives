package kMid11_3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public final class Employee implements Comparable<Employee> {

	private final Employees employees;
	private final String id;
	private final String name;
	private final String[] bossesId;

	public Employee(Employees emp, String id, String name, String... bossesId) {
		this.employees = emp;
		this.id = id;
		this.name = name;
		this.bossesId = bossesId;
	}

	public String id() {
		return id;
	}

	public String name() {
		return name;
	}

	// 直属の上司を返す
	public Set<Employee> bosses() {
		// ===== ここから
		Set<Employee> list = new TreeSet<>();
		for (String boss : bossesId) {
			Iterator<Employee> itr = employees.iterator();
			while (itr.hasNext()) {
				Employee emp = itr.next();
				if (boss.equals(emp.id)) {
					list.add(emp);
					break;
				}
			}
		}
		return list;
		// ===== ここまで
	}

	// 直属の部下を返す
	public Set<Employee> subordinates() {
		// ===== ここから
		Set<Employee> list = new TreeSet<>();
		Iterator<Employee> itr = employees.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
			for (String sub : emp.bossesId) {
				if (this.id.equals(sub)) {
					list.add(emp);
				}
			}
		}
		return list;
		// ===== ここまで
	}

	@Override
	public int compareTo(Employee other) {
		return id.compareTo(other.id);
	}
}