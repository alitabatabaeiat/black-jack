import java.util.Random;

public class Deck {
	private Card[] playingCards;
	private int cardsLeft;
	private static Random numberGenerator = new Random(123);

	public Deck() {
		String[] suites = {"spades", "hearts", "diamonds", "clubs"};
		this.playingCards = new Card[52];
		for (int i = 0; i < suites.length; i++) {
			for (int j = 0; j < 13; j++)
				this.playingCards[i * 13 + j] = new Card(j + 1, suites[j]);
		}
		this.cardsLeft = 52;
	}
}
