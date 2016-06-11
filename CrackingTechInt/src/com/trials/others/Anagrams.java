package com.trials.others;

import java.util.Hashtable;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x= 97;
		char y = (char) (x);
		System.out.println(y);
		double ms = System.currentTimeMillis();
		Hashtable<Character,Integer> table = new Hashtable<Character,Integer>(128);
		String s = "abcdefgh hello abcdefghij tyuyt";
		String s2  = "efghabcd hello abcdefghij tyuyt";
		int[] values = new int[128];
		//System.out.println(values.length);

		if(s.length() != s2.length())
		{
			System.out.println("Not Anagrams");
			return;
		}
		for(int i=0;i<s.length();i++)
		{
			char character = s.charAt(i);
			if(table.get(character)!=null)
			{
				table.put(s.charAt(i), table.get(character)+1);
			}
			else
			{
				table.put(s.charAt(i),1);
			}
		}
		for(int i=0; i<s2.length();i++)
		{
			char character = s2.charAt(i);
			if(table.get(character)==null || table.get(character)==0)
			{
				System.out.println("Not Anagrams");
				return;
			}
			else
			{
				table.put(character, table.get(character)-1);
				if(table.get(character)==0)
				{
					table.remove(character);
				}
			}
		}
		
		if(table.keySet().isEmpty())
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
		
		double ms1 = System.currentTimeMillis();
		System.out.println("Time = "+(ms1-ms));
		
		double ms2 = System.currentTimeMillis();
		for(int i=0;i<128;i++)
		{
			values[i]=0;

		}
		
		for(int i=0;i<s.length();i++)
		{
			int num = s.charAt(i);
			values[num]++;

		}
		for(int j=0; j<s2.length();j++)
		{
			int num = s2.charAt(j);
			if(values[num]==0)
			{
				System.out.println("Not Anagrams");
				return;
			}
			else
			{
				values[num]--;
			}
		}
		for(int i=0;i<128;i++)
		{
			if(values[i]!=0)
			{
				System.out.println("Not Anagrams");
				return;
			}
		}
		System.out.println("Anagrams");
		double ms3 = System.currentTimeMillis();
		System.out.println("Time = "+(ms3-ms2));
	}

}
