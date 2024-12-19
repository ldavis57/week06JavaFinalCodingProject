
package week06CodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class defines a standard deck of cards with values from 2 to 10, Jack,
 * Queen, King, Ace for total of 13 cards.
 */
class Deck {

	// A list to store the deck of cards. This is accessible only within the Deck
	// class.
	private List<Card> cards;

	// Constructor to create and initialize a deck of 52 playing cards.
	public Deck() {

		// Create an instance of the cards list.
		cards = new ArrayList<>();

		/*
		 * Define the suits and the values for the cards; i.e., suits are hearts,
		 * diamonds, clubs, and spades, and value is 2-10, Jack, King, Queen, and Ace
		 * for a total of 13 cards in each suit.
		 */
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
		String[] value = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
				"King", "Ace" };
		/*
		 * Nested loops to create all 52 cards in the deck. The outer loop iterates
		 * through each suit (e.g., Hearts, Spades). The inner loop iterates through the
		 * values (e.g., Two, Three, Ace). A new Card object is created for each
		 * combination of value and suit, and added to the list. The numerical value of
		 * the card starts at 2 and corresponds to its rank (e.g., Two = 2, Ace = 14).
		 */
		for (String suit : suits) {
			for (int i = 0; i < value.length; i++) { // value.length is 13
				cards.add(new Card(i + 2, value[i] + " of " + suit)); // i + 2 sets the numerical value (2-14).
			}
		}
	}

	/*
	 * Use the shuffle method in the Collections instance to randomize the order of
	 * the cards in the deck.
	 */
	public void shuffle() {
		Collections.shuffle(cards);
	}

	/*
	 * Uses the remove method in the ArrayList instance to return the top card to
	 * the Player instance, then remove that card from the deck.
	 */
	public Card draw() {
		return cards.remove(0); // Removes and returns the top card
	}
}