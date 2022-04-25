package kMid07_5;

import java.util.ArrayList;
import java.util.List;

public class Q5 {
	
	public static void main(String[] args) {
		List<Fan> list = new ArrayList<>();
		list.add(new Fan("A", 0, 60));
		list.add(new Fan("B", 0, 55));
		list.add(new Fan("C", 1, 50));
		list.add(new Fan("D", 2, 55));
		list.add(new Fan("E", 5, 20));
		list.add(new Fan("F", 7, 50));
		list.add(new Fan("G", 9, 50));
		list.add(new Fan("H", 13, 45));
		list.add(new Fan("I", 27, 30));
		list.add(new Fan("J", 30, 25));
		
		for (Fan fun : list) {
			// 下記の行に注目！！
			System.out.println(fun);
		}
	}
}