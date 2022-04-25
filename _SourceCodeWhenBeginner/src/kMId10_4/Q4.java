package kMId10_4;

public class Q4 {

	public static void main(String[] args) {
		BingoMachine machine = new BingoMachine();
		BingoCard card = new BingoCard();

		//		System.out.println(card);

		while (machine.hasNext()) {
			card.punch(machine.next());
			if (card.isBingo()) {
				break;
			}
		}
		System.out.println(card);
	}
}
