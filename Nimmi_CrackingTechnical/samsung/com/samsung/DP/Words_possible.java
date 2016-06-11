package com.samsung.DP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Words_possible {

	/**
	 * @param args
	 */
	HashMap<Character,String> map = new HashMap<Character,String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Words_possible sn = new Words_possible();
		List<String> list  = sn.letterCombinations("2");
		for(String s:list)
		{
			System.out.println(s);
		}
	}
	 
	    public List<String> letterCombinations(String digits) {
	        List<String> list = new ArrayList<String>();
	        if(digits == null || digits.length()==0)
	        {
	            return list;
	        }
	        map.put('1', "");
			map.put('2', "abc");
			map.put('3', "def");
			map.put('4', "ghi");
			map.put('5', "jkl");
			map.put('6', "mno");
			map.put('7', "pqrs");
			map.put('8', "tuv");
			map.put('9', "wxyz");
			
	        findCombinations(digits,"",list,0);
	        return list;
	        
	    }
	    public void findCombinations(String digits,String s, List<String> list,int index)
		{
			if(index==digits.length())
			{
				list.add(s);
				return;
			}
			String str = map.get(digits.charAt(index));
			index++;
			for(int i=0;i<str.length();i++)
			{
				String st = s + str.charAt(i);
				findCombinations(digits,st,list,index);
			}
		}

}
