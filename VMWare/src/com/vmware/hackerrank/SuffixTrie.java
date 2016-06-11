package com.vmware.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;


public class SuffixTrie {

	/**
	 * @param args
	 */
	Trie head = null;
	static int current_maxm=1;
	
	public SuffixTrie(){
		head = new Trie();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

		Scanner sc = new Scanner(System.in);
	    int length = Integer.parseInt(buf.readLine());
	    String[] numbers = buf.readLine().split(" ");
	    int k = Integer.parseInt(numbers[0]);
	    int l = Integer.parseInt(numbers[1]);
	    int m = Integer.parseInt(numbers[2]);
	    String s = buf.readLine();
	    SuffixTrie sf = new SuffixTrie();
		for(int i=0;i<length;i++)
		{
			for(int j=k;j<=l && i+j<=length;j++)
			{
				
				String sub = s.substring(i, i+j);
				System.out.println(sub);
				if(!sf.checkDistinct(sub,m))
						break;
				sf.add(sub);
			}
		}
		System.out.println(current_maxm);
	}
	
	public boolean checkDistinct(String s, int distinct)
	{
		if(s.length()<=distinct)
		{
			return true;
		}
		HashSet<Character> set = new HashSet<Character>();
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			if(!set.contains(s.charAt(i)))
			{
				count++;
				if(count > distinct )
					return false;
				set.add(s.charAt(i));
			}
		}
		return true;
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
		if(currentnode.count >current_maxm)
		{
			System.out.println("Current_max = "+ s + " - " + current_maxm);
			current_maxm  = currentnode.count;
		}
	}
}
