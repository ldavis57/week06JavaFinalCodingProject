
package week06CodingProject;

import java.util.ArrayList;
import java.util.List;

/**
 * The Player class defines the structure for creating and managing players in a
 * card game. Each player has a hand of cards, a score to track points, and a
 * name. The class includes methods to interact with the player's hand, draw
 * cards, and manage their score.
 */
class Player {

	// A list to represent the player's hand of cards.
	private List<Card> hand;

	// The player's score, initialized to zero.
	private int score;

	// The player's name, e.g., "Player1", "Han", or "George".
	private String name;

	/**
	 * Constructor to initialize the Player object with a name. The hand is
	 * initialized as an empty ArrayList, and the score starts at zero. "name" here
	 * is the name of the player.
	 */
	public Player(String name) {
		this.hand = new ArrayList<>(); // Initialize an empty hand.
		this.score = 0; // Set initial score to zero.
		this.name = name; // Assign the player's name.
	}

	/*
	 * Displays the player's name and current hand of cards. This method uses the
	 * describe method in the Card instance to display each player's name and
	 * current hand of cards. By using System.out.print() here and
	 * System.out.println() in Card, both player and card print on a single line.
	 */
	public void describe() {
		System.out.print(name + "'s card: ");
	}

	/*
	 * Returns the value of the top card to the App class and removes it from the
	 * deck.
	 */
	public Card flip() {
		return hand.remove(0); // Removes and returns the first card in the list.
	}

	/*
	 * Draws a card from the deck and adds it to the player's hand. This method uses
	 * the draw method of the Deck class to obtain a card.
	 */
	public void draw(Deck deck) {
		hand.add(deck.draw()); // Add the drawn card to the player's hand.
	}

	// Increments the player's score by one for each round played.
	public void incrementScore() {
		score++;
	}

	// Retrieves and returns the player's current score.
	public int getScore() {
		return score; // Return the player's score.
	}

	// Retrieves and returns the player's name.
	public String getName() {
		return name; // Return the player's name.
	}
}
