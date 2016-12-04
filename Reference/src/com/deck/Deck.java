package com.deck;
public class Deck {

	/**
	 * An array of 52 cards.
	 */
	private Card[] deck;

	private int cardsUsed;

	public Deck() {
		deck = new Card[52];
		int cardCounter = 0; 
		for (int suit = 0; suit <= Card.CLUBS; suit++) {
			for (int value = 1; value <= Card.KING; value++) {
				deck[cardCounter] = new Card(value, suit);
				cardCounter++;
			}
		}
		cardsUsed = 0;
	}


	public void shuffle() {
		for (int i = deck.length - 1; i > 0; i--) {
			int rand = (int) (Math.random() * (i + 1));
			Card temp = deck[i];
			deck[i] = deck[rand];
			deck[rand] = temp;
		}
		cardsUsed = 0;
	}

	public Card deal() {
		if (cardsUsed == deck.length) {
			throw new IllegalArgumentException("no cards are left in the deck.");
		}
		cardsUsed++;
		return deck[cardsUsed - 1];
	}

	public Card turnOver() {
		if (cardsUsed == deck.length) {
			throw new IllegalArgumentException("no cards are left in the deck.");
		}
		return deck[cardsUsed];
	}
	
	public int search(Card card) {
		if (cardsUsed == deck.length) {
			throw new IllegalArgumentException("no cards are left in the deck.");
		}
		int i=0;
		for(Card temp : deck){
			if(temp == card) break;
			
			 i++;
		}
		return i+1;
	}
	
	public Card[] cut(int index){
		Card[] tempBuf = new Card[52];
		int k = index-1;
		for(int i=0;i<52-index;i++,k++){
			tempBuf[i] = deck[k];
		}
		k=0;
		for(int i = 52-index;i<52;i++,k++){			
			tempBuf[i] = deck[k];
		}		
		return tempBuf;
	}

	public static final void main(String[] args) {
		// create deck
		Deck deck = new Deck();
		
		// turn over 
		Card card = deck.turnOver();
		System.out.println("turn over: "+card);
		
		// Search operation
		int index = deck.search(card);
		System.out.println(" Position of the given card in the deck is : "+index);
		
		// deal Operation
		for (int i = 1; i <= 52; i++) {
			card = deck.deal();
			System.out.println(i + " : card [" + card + "]");
		}
		
		
		deck = new Deck();
		
		System.out.println("============================");
		
		//Cut operation
		Card[] tempDeck = deck.cut(16);
		for (int i = 1; i <= 52; i++) {
			card = tempDeck[i];
			System.out.println(i + " : card [" + card + "]");
		}
		
		for (int i = 1; i <= 52; i++) {
			card = deck.deal();
			System.out.println(i + " : card [" + card + "]");
		}
		
		// shuffle
		deck.shuffle();
	}
}