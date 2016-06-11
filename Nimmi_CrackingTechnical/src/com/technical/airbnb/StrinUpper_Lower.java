package com.technical.airbnb;

import java.util.ArrayList;

public class StrinUpper_Lower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "abc";
		String temp = s.substring(s.length()-1, s.length());
		System.out.println(temp);
		ArrayList<String> aStrings = caseStrings(s,s.length()-1);
		
		for(String st : aStrings)
		{
			System.out.println(st);
		}
		
				
	}
	
	public static ArrayList<String> caseStrings(String S, int length)
	{
		if(length == 0)
		{
			
			ArrayList<String> list = new ArrayList<String>();
			String s = S.substring(0, 1);
			list.add(s.toLowerCase());
			list.add(s.toUpperCase());
			return list;
			
		}
		String curString = S.substring(length, length+1);
		ArrayList<String> sList = caseStrings(S,length-1);
		ArrayList<String> newList = new ArrayList<String>();
		for(String str : sList)
		{
			String s_lower = str + curString.toLowerCase();
			String s_upper = str + curString.toUpperCase();
			newList.add(s_lower);
			newList.add(s_upper);
		}
		
		return newList;
	}

}
