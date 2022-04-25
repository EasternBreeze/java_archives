public class Judge {

	static int getHandSum(Hand h) {
		int sum = 0;
		for (Card c : h.hand) {
			sum += c.getNum();
		}
		return sum;
	}
}
