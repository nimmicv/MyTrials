package com.technical.facebook;
import java.util.*;

public class SegmentString2 {

	/**
	 * @param args
	 */
	 HashMap<String,List<String>> map = new HashMap<String,List<String>>();
	    public List<String> wordBreak(String s, Set<String> wordDict) {
	        List<String> res = new ArrayList<String>();
	        if(s.isEmpty())
	            return res; // return empty list upon empty string

	        if(map.containsKey(s))
	            return map.get(s);

	        for(int i=0; i<s.length(); i++) {
	            String firstWord = s.substring(0,i+1);
	            if(wordDict.contains(firstWord)) {
	                List<String> rest = wordBreak(s.substring(i+1),wordDict);
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
