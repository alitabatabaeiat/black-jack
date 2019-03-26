public class Card {
	private int value;
	private String suit;

	private final String SPADES = "spades";
	private final String HEARTS = "hearts";
	private final String DIAMONDS = "diamonds";
	private final String CLUBS = "clubs";

	public Card(int value, String suit) throws IllegalArgumentException {
		if (value < 1 || value > 13) throw new IllegalArgumentException("Value is not valid");
		suit = suit.toLowerCase();
		if (!(suit.equals(this.SPADES) || suit.equals(this.HEARTS) || suit.equals(this.DIAMONDS) || suit.equals(this.CLUBS)))
			throw new IllegalArgumentException("Suit is not valid");
		this.value = value;
		this.suit = suit.toLowerCase();
	}

	public int getValue() {
		return this.value;
	}

	public String getSuit() {
		return this.suit;
	}
}
