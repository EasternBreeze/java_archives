package kMId10_3;

public class Q3 {
	
	public static void main(String[] args) {
		BingoMachine machine = new BingoMachine();
		while (machine.hasNext()) {
			System.out.println(machine.next());
		}
	}
}