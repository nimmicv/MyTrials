package com.learn.tree;

import java.util.Map;
import java.util.Set;

public class PatternSearchTrie {

	static Trie root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "beb", "black", "amateur", "zen", "aman" };
		PatternSearchTrie pt = new PatternSearchTrie();
		for (String s : words) {
			pt.add(s);
		}
		pt.traverse(root.list);
		System.out.println(pt.find("zena"));
	}

	public void traverse(Map<Character, Trie> list) {
		Set<Character> keys = list.keySet();
		if (keys.isEmpty())
			return;
		for (Character key : keys) {
			System.out.println(key);
			traverse(list.get(key).list);
		}
	}

	public void add(String s) {
		if (root == null) {
			Trie newnode = new Trie((char) 0);
			root = newnode;
		}
		char[] str = s.toCharArray();
		int length = str.length;
		Trie currentnode = root;
		for (int i = 0; i < length; i++) {
			if (currentnode.list.containsKey(str[i])) {
				currentnode = currentnode.list.get(str[i]);
			} else {
				Trie newnode = new Trie(str[i]);
				currentnode.list.put(str[i], newnode);
				currentnode = newnode;
			}
		}
		currentnode.word = true;
	}

	public boolean find(String str) {
		int length = str.length();
		char[] array = str.toCharArray();
		Trie currentnode = root;
		for (int i = 0; i < length; i++) {
			if (currentnode.list.containsKey(array[i]))
				currentnode = currentnode.list.get(array[i]);
			else
				return false;
		}
		return true;
	}

}
