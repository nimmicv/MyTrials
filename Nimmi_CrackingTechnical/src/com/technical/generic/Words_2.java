package com.technical.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Words_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		for(String str : list)
		{
			str = str + "words";
		}
		for(String str : list)
		{
			System.out.println(str);
		}
		
	}
	
	public List<String> wordBreak(String s, Set<String> wordDict) {
        List<String> glist = new ArrayList<String>();
        if(s.length()==0)
        {
           return glist;
        }
        for(int i=0;i<s.length();i++)
        {
           String word1 = s.substring(0,i+1);
           
           if(wordDict.contains(word1))
           {
              List<String> str_list = wordBreak(s.substring(i+1), wordDict);
              if(i==s.length()-1)
              {
            	  glist.add(word1); 
              }
              else
              {
                  for(String str : str_list)
                  {
                      str = word1 + " " + str;
                      glist.add(str);
                  }
              }
           }
        }
        return glist;
        
    }
	


}
