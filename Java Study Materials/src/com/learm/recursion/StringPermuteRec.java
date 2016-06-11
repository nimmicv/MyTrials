package com.learm.recursion;

import java.util.ArrayList;
import java.util.Iterator;

public class StringPermuteRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringPermuteRec rc = new StringPermuteRec();
		ArrayList<String> list = rc.doPermute("abc");
		for(String s :list)
		{
			System.out.println(s);
		}

	}
	
	public ArrayList<String> doPermute(String str)
	{
		ArrayList<String> permlist = new ArrayList<String>(); 
		if(str==null)
			return null;
		if(str.length()==0)
		{
			permlist.add("");
			return permlist;
		}
		//Take one character say 'b' and add it to all places in remaining say 'c' =>bc.cb
		//Take next and add to all places in bc and cb => abc,bca,cba,acb
		char firstchar = str.charAt(0);
		String letter = String.valueOf(firstchar);
		String remaining = str.substring(1, str.length());
		ArrayList<String> list = doPermute(remaining);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			String word = itr.next();
			for(int j=0;j<=word.length();j++)
			{
				String newstring = insert(letter,j,word);
				permlist.add(newstring);
			}
			
		}
		return permlist;
	}
	
	public String insert(String letter, int position, String word)
	{
		if(position == 0)
			return letter + word;
		if(position == word.length())
			return word+letter;
		else
			return word.substring(0, position)+letter+word.substring(position, word.length());
		
		
	}

}
