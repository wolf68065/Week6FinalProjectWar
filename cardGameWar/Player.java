package cardGameWar;

import java.util.List;

public class Player {
// Player name, Cards and score
	
	private String name;
	private List<Card> hand;
	private int score;
	
	public Player(String name, List<Card> hand, int score) {
		this.name = name;
		this.hand = hand;
		this.score = 0;
	}
	
// Flipping and removing used cards
	
	public Card flip() {
		return hand.remove(0);
	}
	
// Drawing and adding cards to hand
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
//Adding points
	
	public void incrementScore() {
		this.score++;
	}
	
//Getter and Setter	
	
	public List<Card> getHand(){
		return hand;
	}
	
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}

//Showing players hand and score
	
	public void decribe() {
		System.out.println("Player:" + name + " score is " + score + " and has the following cards:");
		for (Card card : hand) {
			card.describe();
		}
	}
}