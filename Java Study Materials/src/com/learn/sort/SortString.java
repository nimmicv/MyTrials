package com.learn.sort;

import java.util.Arrays;


public class SortString implements Comparable<SortString>{
	
	String word;
	
	public SortString(String s)
	{
		word = s;
	}
	
	public String sortme(String s)
	{
		char ch[] = s.toCharArray();
		Arrays.sort(ch);
		String newstr = new String(ch);
		return newstr;
	}
	

	@Override
	public int compareTo(SortString o) {
		// TODO Auto-generated method stub
	  return (sortme(this.word).compareTo(sortme(o.word)));
	}

	
	
}
