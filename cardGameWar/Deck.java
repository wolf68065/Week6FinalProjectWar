package cardGameWar;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Deck {
	
	
// Create a list of 52 cards	
	
	List<Card> cards= new ArrayList<Card>();
		public Deck() {
			String[]suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
			String[]numbers = { "Two", "Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack", "Queen","King", "Ace"};
		for(String suit : suits) {
			int counter = 2;
			for(String num : numbers) {
				Card card = new Card(num, suit, counter);
				this.cards.add(card);
				counter++;
			}
		}
		}
// Getters and Setters
		
		public List<Card> getCards(){
			return cards;
		}
		
		public void setCards(List<Card>cards) {
			this.cards = cards;
		}
		
		public void describe() {
			for(Card card : this.cards) {
				card.describe();
			}
		}
//Shuffle the Deck
		
		public void shuffle() {
			Collections.shuffle(this.cards);
		}

//Removal of Card Drawn
		
		public Card draw() {
			return cards.remove(0);
		}
}