package com.technical.google.trie;

public class Trie {
	public static int ALPHABET_SIZE = 26;
	Trie[] trie;
	boolean word;
	int count;
	
	public Trie()
	{
		this.trie = new Trie[ALPHABET_SIZE];
		this.count =0;
	}

}
