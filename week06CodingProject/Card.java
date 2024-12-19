
package week06CodingProject;

/**
 * Requires two fields. value hold the card value from 2 to 10, Jack, Queen.
 * King, Ace. Name combines the value with one of each four suits: Spades,
 * Clubs, Hearts, Diamonds.
 */
class Card {
	private int value; // 2-10 plus 11, 12, and 13 for face cards and 14 for Ace.
	private String name; // e.g., "Ace of Diamonds"

	// Constructor to initialize a card object with a specified value and name.
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}

	// Getter method to retrieve the value of the card.
	public int getValue() {
		return value; // Returns the card's numerical value.
	}

	// Getter to retrieve the name of the card.
	public String getName() {
		return name; // Returns the card's name as a string.
	}

	/*
	 * Displays the name of the card, e.g. Two of Hearts. By using
	 * System.out.print() in the describe method in the Player instance and
	 * System.out.println() here, both the player and card print on a single line.
	 */
	public void describe() {
		System.out.println(name); // Prints the card's name to the console.
	}
}
