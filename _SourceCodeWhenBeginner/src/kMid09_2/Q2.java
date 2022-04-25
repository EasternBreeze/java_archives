package kMid09_2;

import java.util.ArrayList;
import java.util.List;

public class Q2 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("野比", 25, 45, 55, 40));
		list.add(new Student("骨川", 70, 60, 85, 70));
		list.add(new Student("剛田", 65, 35, 70, 95));
		list.add(new Student("出木杉", 75, 80, 100, 95));

		System.out.println("<<最低点, 最高点>>");
		for (Student s : list) {
			System.out.println(s.name() + " " + s.min() + " " + s.max());
		}
	}
}