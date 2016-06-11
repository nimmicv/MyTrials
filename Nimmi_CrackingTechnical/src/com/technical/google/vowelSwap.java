package com.technical.google;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class vowelSwap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aeiou";
		
		
	}
	
	public String swap(String s)
	{
		Set<Character> st = new HashSet<Character>(Arrays.asList('a','e','i','o','u'));
		
		StringBuffer sb = new StringBuffer(s);
		int i=0;
		int j=sb.length()-1;
		while(i<j)
		{
			while(i<sb.length() && !st.contains(sb.charAt(i)))
			{
				i++;
			}
			while(j>=0 && !st.contains(sb.charAt(j)))
			{
				j--;
			}
			if(i<j)
			{
				char x= sb.charAt(j);
				char y = sb.charAt(i);
				sb.setCharAt(i, x);
				sb.setCharAt(j, y);
				i++;
				j--;
			}
		}
		System.out.println(sb.toString());
		return sb.toString();
	}

}
