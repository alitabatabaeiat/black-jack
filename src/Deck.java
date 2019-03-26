import java.util.Random;

public class Deck {
	private Card[] cards;
	private int numOfCards;
	private static Random numberGenerator = new Random(123);

	public Deck() {
		String[] suites = {"spades", "hearts", "diamonds", "clubs"};
		this.cards = new Card[52];
		for (int i = 0; i < suites.length; i++) {
			for (int j = 0; j < 13; j++)
				this.cards[i * 13 + j] = new Card(j + 1, suites[i]);
		}
		this.numOfCards = 20;
	}

	public int getNumOfCards() {
		return this.numOfCards;
	}

	public Card[] getCards() {
		Card[] cardsLeft = new Card[this.numOfCards];
		System.arraycopy(this.cards, 0, cardsLeft, 0, this.numOfCards);
		return  cardsLeft;
	}
}
