public class Main {
	public static void main(String[] args) {
		Deck deck = new Deck();
		System.out.println(deck.getNumOfCards());
		int i = 0;
		for (Card card : deck.getCards()) {
			System.out.println(i++ + ": " + card);
		}
	}
}
