package com.samsung.CardDeck;

public class Card {
	Color color;
	Symbol symbol;
	Value value;
	
	public Card(Color cl, Value vl, Symbol sl)
	{
		this.color = cl;
		this.value = vl;
		this.symbol = sl;
	}

}
