package com.deck;

public class Part3 {

	/**
	 * An array of 52 cards.
	 */
	private static Card[] deck1;
	private static Card[] deck2;

	private int cardsUsed1;
	private int cardsUsed2;
	public Part3() {
		deck1 = new Card[52];
		deck2 = new Card[52];
		int cardCounter = 0; 
		for (int suit = 0; suit <= Card.CLUBS; suit++) {
			for (int value = 1; value <= Card.KING; value++) {
				deck1[cardCounter] = new Card(value, suit);
				deck2[cardCounter] = new Card(value, suit);
				cardCounter++;
			}
		}
		cardsUsed1 = 0;
		cardsUsed2 = 0;
	}

	
	public static void main(String[] args) {		
		pinochleOrder();
		
	}

	// I will remove 2- 8 cards from each deck store them in array list 
	// Iterate over array list and store a new deck of cards

	private static void pinochleOrder() {
		
		for(int i=0;i<52;i++){
			
		}
			
		
	}

}
