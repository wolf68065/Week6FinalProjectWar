package cardGameWar;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
	
//Establishing the deck
		Deck warDeck = new Deck();
		
		List<Card> playerOneHand = new ArrayList<Card>();
		List<Card> playerTwoHand = new ArrayList<Card>();
		
		
// Establish the players, score and cards they have in hand
		Player playerOne = new Player("Nick", playerOneHand, 0);
		playerOne.setHand(playerOneHand);
		playerOne.setScore(0);
		
		Player playerTwo = new Player("Harper", playerTwoHand, 0);
		playerTwo.setHand(playerTwoHand);
		playerTwo.setScore(0);
		
//Show the Cards
		System.out.println("----- Show 52 cards----\n");
		warDeck.describe();
		
//Shuffling the deck
		warDeck.shuffle();
		System.out.println("---Showing the shuffled deck---");
		warDeck.describe();
		
// Drawing Cards
		for (int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				playerOne.draw(warDeck);
			}else{
				playerTwo.draw(warDeck);
			}
		}
		
// Players hand
		
		playerOne.decribe();
		playerTwo.decribe();
		
// Players flipping card
		
		for (int i = 0; i < 26; i++) {
			Card playeroneCard = playerOne.flip();
			Card playertwoCard = playerTwo.flip();
		if (playeroneCard.getValue() > playertwoCard.getValue()) {
			playerOne.incrementScore();
		}else if (playertwoCard.getValue() > playeroneCard.getValue()) {
			playerTwo.incrementScore();
		}
		}
// Player One Score
		
		System.out.println("Nick's Score is: " + playerOne.getScore());
		
//Player Two Score
		
		System.out.println("Harper's Score is: " + playerTwo.getScore());
		
// Winner or Draw
		
		if(playerOne.getScore() > playerTwo.getScore()) {
			System.out.println("Nick Win's!");
		}else if (playerOne.getScore() < playerTwo.getScore()) {
			System.out.println("Harper Win's!");
		}else{
			System.out.println("Draw No One Wins!!");
			
		}
}}