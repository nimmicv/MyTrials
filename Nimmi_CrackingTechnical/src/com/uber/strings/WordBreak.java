package com.uber.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "catsanddog";
		HashSet<String> set = new HashSet<>();
		set.add("cat");
		set.add("cats");
		set.add("and");
		set.add("sand");
		set.add("dog");
		
		 List<String> string_list = wordBreak(s,set);
		 for(String str : string_list)
		 {
			 System.out.println(str);
		 }
	}
	 public static List<String> wordBreak(String s, Set<String> wordDict) {
	        List<String> list = null;
	        for(int i=1;i<=s.length();i++)
	        {
	           String word1 = s.substring(0,i);
	           
	           if(wordDict.contains(word1))
	           {
	              if(i==s.length())
	              {
	                  String str = word1;
	                  List<String> listnew = new ArrayList<String>();
	                  listnew.add(str);
	                  return listnew;
	              }
	              else
	              {
	                list = wordBreak(s.substring(i,s.length()),wordDict); 
	                for(String str:list)
	                {
	                    str = word1+" "+str;
	                }
	              }
	           }
	        }
	        return list;
	        
	    }

}
