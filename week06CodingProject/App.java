
package week06CodingProject;

/**
 * The App class simulates a card game similar to War, where the high card wins
 * each round. The game involves two players, 26 rounds, and a shuffled deck of
 * 52 cards. Each player alternates drawing cards, and their scores are tracked
 * to determine the winner.
 */

public class App {
	public static void main(String[] args) {
		/*
		 * Create an instance of the Deck object and two Player instances named George
		 * and Gracie.
		 */
		Deck deck = new Deck();
		Player player1 = new Player("George");
		Player player2 = new Player("Gracie");

		/*
		 * Use the shuffle method in the Deck instance to randomize the cards in the
		 * deck.
		 */
		deck.shuffle();

		/*
		 * Deal 52 cards alternately to the players by looping through 0 to 52, where
		 * the index value is evenly divisible by two (number is even), add a card to
		 * George. If there is a remainder (number is odd), add the card to Gracie. Use
		 * the draw method from the Player instance to get the card, adding cards until
		 * all 52 are dealt evenly.
		 */
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}

		/*
		 * Declare start of game and initiate a counter for the 26 rounds.
		 */
		System.out.println("Game Start!");

		/*
		 * Each round involves both players flipping a card, describing it, comparing
		 * values, and awarding points to the player with the higher card. Loop through
		 * the rounds, printing each round number as it occurs.
		 */
		for (int i = 0; i < 26; i++) {
			System.out.println("\nRound " + (i + 1) + ":");

			/*
			 * Start by invoking the flip method in the Player instance for each player to
			 * reveal the card. The method returns the top card then removes it from the
			 * deck.
			 */
			Card card1 = player1.flip();
			Card card2 = player2.flip();

			/*
			 * Call the description method in the Player class to print each player's name
			 * followed by calling the describe method in the Card instance to print the
			 * player's card. The method in Player uses System.out.print to process the
			 * player's name, then calls the Card instance and uses System.out.println to
			 * print both on a single line.
			 */
			player1.describe();
			card1.describe();
			player2.describe();
			card2.describe();

			/*
			 * Compare the cards. Display the player who won the round and increment that
			 * player by one. If both cards are the same, display that it's a tie and no
			 * points are awarded. This uses the getValue and getName methods of the Player
			 * instance, and also updates the scores using the incrementScore method in that
			 * same instance.
			 */
			if (card1.getValue() > card2.getValue()) {
				System.out.println(player1.getName() + " wins this round!");
				player1.incrementScore();
			} else if (card1.getValue() < card2.getValue()) {
				System.out.println(player2.getName() + " wins this round!");
				player2.incrementScore();
			} else {
				System.out.println("It's a tie! No points awarded.");
			}

			/*
			 * Display current scores for each player per round. Uses the getName and
			 * getScore methods of the Player instance to get the name and score of each
			 * player.
			 */
			System.out.println("Scores: " + player1.getName() + " = " + player1.getScore() + ", " + player2.getName()
					+ " = " + player2.getScore());
		}

		/*
		 * Final scores and winner. Declare the game is over and use the getName and
		 * getScore methods from the Player instance to print the final score for each
		 * player.
		 */
		System.out.println("\nGame Over!");
		System.out.println("Final Scores: " + player1.getName() + " = " + player1.getScore() + ", " + player2.getName()
				+ " = " + player2.getScore());

		/*
		 * Compare the final scores using the getName and getScore methods from the
		 * Player instance. Declare the winner as the player with the higher score.
         * If both scores are equal, announce a draw.
		 */
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Winner: " + player1.getName());
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("Winner: " + player2.getName());
		} else {
			System.out.println("It's a Draw!");
		}
	}
}
