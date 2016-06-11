package com.technical.google.trie;

import java.util.*;


public class TrieAutoComplete {

	/**
	 * @param args
	 */
	Trie head = null;
	
	public TrieAutoComplete(){
		head = new Trie();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer>[] table = new HashSet[26];
		TrieAutoComplete tc = new TrieAutoComplete();
		tc.add("ana");
		tc.add("ant");
		tc.add("ancy");
		tc.add("anchor");
		tc.add("anoint");
		tc.add("abbot");
		tc.add("ann");
		tc.add("bcc");
		tc.add("bcat");
		ArrayList<String> list = tc.getWords("bc");
		for(String str : list)
		{
			System.out.println(str);
		}
	}
	
	public void add(String s)
	{
		char[] str = s.toCharArray();
		Trie currentnode = head;
		for(int i=0;i<str.length;i++)
		{
		  int index = str[i] - 'a'; 
		  if(currentnode.trie[index]==null)
		  {
			  Trie new_trie= new Trie();
			  currentnode.trie[index] = new_trie; 
			  currentnode = new_trie;
		  }
		  else
		  {
			  currentnode = currentnode.trie[index]; 
		  }
		}
		currentnode.word = true;	
		currentnode.count =  currentnode.count+1;
	}
	
	public ArrayList<String> getWords(String s)
	{
		ArrayList<String> list = new ArrayList<String>();
		char[] str = s.toCharArray();
		Trie currentnode = head;
		for(int i=0;i<str.length;i++)
		{
			int index = str[i] - 'a'; 
			currentnode = currentnode.trie[index]; 
		}
		findWords(currentnode,list,s);
		return list;
	}
	
	public void findWords(Trie Node,ArrayList<String> list,String word)
	{
		if(Node.word)
		{
			list.add(word);
		}
		for(int i=0;i<26;i++)
		{
			if(Node.trie[i]!=null)
			{
				char cur_letter  = (char) ('a' + i);
				String newword = word + cur_letter;
				findWords(Node.trie[i],list,newword);
			}
		}
	}

}
