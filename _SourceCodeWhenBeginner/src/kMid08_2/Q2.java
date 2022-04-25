package kMid08_2;

public class Q2 {

	public static void main(String[] args) {
		String[] files = {
				"A", "B", "C", "D", "E", //
				"F", "G", "D", "E", "H", //
				"D", "A", "B", "F", "C", //
				"B", "D", "B", "F", "H", "E" //
		};

		LRU lru = new LRU();
		for (String file : files) {
			lru.add(file);
		}
		System.out.println(lru);
	}
}