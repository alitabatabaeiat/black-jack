import java.util.Random;

public class Deck {
	private Card[] cards;
	private int numOfCards;
	private static Random numberGenerator = new Random(123);

	public Deck() {
		String[] suites = {"clubs", "diamonds", "hearts", "spades"};
		this.cards = new Card[52];
		for (int i = 0; i < suites.length; i++) {
			for (int j = 0; j < 13; j++)
				this.cards[i * 13 + j] = new Card(j + 1, suites[i]);
		}
		this.numOfCards = 52;
	}

	public int getNumOfCards() {
		return this.numOfCards;
	}

	public Card[] getCards() {
		Card[] cardsLeft = new Card[this.numOfCards];
		System.arraycopy(this.cards, 0, cardsLeft, 0, this.numOfCards);
		return  cardsLeft;
	}

	public void showCards() {
		for(int i = this.numOfCards-1; i >= 0; i--) {
			if(i != this.numOfCards-1)
				System.out.print(" ");
			System.out.print(Integer.toString(this.cards[i].getValue()) + " of " + this.cards[i].getSuit());
			if (i != 0)
				System.out.print(",");
			else
				System.out.println(".");
		}
	}

	static int generateRandom(int interval) {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(interval) + 1;
		return randomInt;
	}

	private void swap(int r1, int r2) {
		Card tmp = this.cards[r1];
		this.cards[r1] = this.cards[r2];
		this.cards[r2] = tmp;
	}

	public void shuffle() {
		for(int i = 0; i < 1000; i++) {
			int r1 = generateRandom(this.numOfCards-1);
			int r2 = generateRandom(this.numOfCards-1);
			swap(r1, r2);
		}
	}

	// public Card deal() {
	//
	// }
	//
	// public Card pickACard(int position) {
	//
	// }
	//
	// public void restockDeck() {
	//
	// }

}
