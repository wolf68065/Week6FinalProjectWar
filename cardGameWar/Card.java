package cardGameWar;

public class Card {

	private int value;
	private String name;
	private String suit;
	
	Card(String name, String suit, int value){
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
// Create a description so you can see the cards
	public void describe() {
		System.out.println(name + " of " + suit + ": " + value);
	}
	
// Getters and Setters
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	
	
	
}

