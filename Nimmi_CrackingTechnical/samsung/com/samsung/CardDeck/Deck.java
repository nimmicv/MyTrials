package com.samsung.CardDeck;

import java.util.Random;


public class Deck {
	final static int deck_count = 52;
	Card[] cards;
	 
	public Deck()
	{
		int i=0;
		cards = new Card[deck_count];
		for(Symbol s: Symbol.values())
		{
			Color c = null;
			if(s==Symbol.CLUBS || s == Symbol.SPADE)
			{
				c = Color.BLACK;
			}
			if(s==Symbol.HEART || s == Symbol.DIAMOND)
			{
				c = Color.RED;
			}
			for(Value v : Value.values())
			{
				cards[i] = new Card(c,v,s);
				i++;
			}
		}
	}
	
	public void suffleDeck()
	{
		for(int i=0; i<deck_count;i++)
		{
			Random rn = new Random();
			int x = rn.nextInt(deck_count);
			Card c = cards[x];
			cards[x] = cards[i];
			cards[i] = c;
		}
	}
}
