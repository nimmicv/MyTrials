package com.learn.tree;

public class SuffixTree {

	// Also called suffix Tree
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AGGTCACCTGGAAGACCGATTACCGAA";
		PatternSearchTrie pt = new PatternSearchTrie();
		for (int i = s.length() - 1; i >= 0; i--) {
			pt.add(s.substring(i));
		}

		System.out.println(pt.find("AGGTC"));
	}

}
