package kMid11_1;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
	
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("D01", "藤子不二雄"));
		list.add(new Employee("D02", "ドラえもん", "D01"));
		list.add(new Employee("D03", "のび太", "D01", "D02"));
		list.add(new Employee("D04", "しずか", "D02", "D03"));
		list.add(new Employee("D05", "スネ夫", "D06"));
		list.add(new Employee("D06", "ジャイアン", "D01"));
		list.add(new Employee("D07", "出木杉", "D04"));
		list.add(new Employee("D08", "ジャイ子", "D06"));
		list.add(new Employee("D09", "ドラミ", "D02"));
		list.add(new Employee("D10", "セワシ", "D02", "D03", "D09"));
		list.add(new Employee("D11", "スネツグ", "D05"));
		
		for (Employee e : list) {
			System.out.println(e);
		}
	}
}