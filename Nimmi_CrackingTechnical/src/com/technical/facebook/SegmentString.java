package com.technical.facebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SegmentString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SegmentString smt = new SegmentString();
		Set<String> dict = new HashSet<String>();
		HashMap<String,String> hmap = new HashMap<String,String>();
		dict.add("i");
		dict.add("kid");
		dict.add("ding");
		dict.add("kidding");
		dict.add("am");
		dict.add("a");
		System.out.println(smt.SegmentString("iamkidding", dict, hmap));
		 ArrayList<String> lst = (ArrayList<String>) smt.wordBreak2("iamkidding",dict);
		 for(String s : lst)
		 {
			 System.out.println("S = "+s);
		 }
	}
	public String SegmentString(String input, Set<String> dict,HashMap<String,String> hmap) {
		  if (dict.contains(input)) 
			  return input;
		  if(hmap.containsKey(input))
		  {
			  return hmap.get(input);
		  }
		  int len = input.length();
		  for (int i = 1; i < len; i++) {
		    String prefix = input.substring(0, i);
		    if (dict.contains(prefix)) {
		      String suffix = input.substring(i, len);
		      String segSuffix = SegmentString(suffix, dict,hmap);
		      if (segSuffix != null) {
		    	  hmap.put(input, prefix + " " + segSuffix);
		    	  return prefix + " " + segSuffix;
		      }
		    }
		  }
		  hmap.put(input, null);
		  return null;
		}
	
	HashMap<String,List<String>> map = new HashMap<String,List<String>>();
    public List<String> wordBreak2(String s, Set<String> wordDict) {
        List<String> res = new ArrayList<String>();
        if(s.isEmpty())
            return res; // return empty list upon empty string

        if(map.containsKey(s))
            return map.get(s);

        for(int i=0; i<s.length(); i++) {
            String firstWord = s.substring(0,i+1);
            if(wordDict.contains(firstWord)) {
                List<String> rest = wordBreak2(s.substring(i+1),wordDict);
                if(rest.isEmpty()) {
                    if(i==s.length()-1)
                        res.add(firstWord);
                } else {
                    for(String str : rest)
                        res.add(firstWord + " " + str);
                }
            }
        }

        map.put(s,res);

        return res;
    }
}
