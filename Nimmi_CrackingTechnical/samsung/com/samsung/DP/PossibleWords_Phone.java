package com.samsung.DP;

import java.util.HashMap;

public class PossibleWords_Phone {

	/**
	 * @param args
	 */
	static HashMap<Integer,String> map = new HashMap<Integer,String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map.put(1, "");
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");
		int num = 234;
		int newnum=0;
		while(num>0)
		{
			newnum = (newnum*10)+num%10;
			num = num/10;
		}
		System.out.println(newnum);
		
		PossibleWords_Phone pw = new PossibleWords_Phone();
		pw.findCombinations(newnum, "");
	}
	
	public void findCombinations(int num,String s)
	{
		if(num==0)
		{
			System.out.println(s);
			return;
		}
		int x = num%10;
		String str = map.get(x);
		num = num/10;
		for(int i=0;i<str.length();i++)
		{
			String st = s + str.charAt(i);
			findCombinations(num,st);
		}
		
		
		
	}

}
