
package com.technical.generic;
import java.util.*;
import java.util.List;

public class ArraySort {

	/**
	 * @param args
	 */
	
	//Group all anagrams together
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> list;
		list = new ArrayList<List<String>>();
	      Map<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
	      for(int i=0;i<strs.length;i++)
	      {
	    	  String sortedstr = getSortedString(strs[i]);
	          if(map.containsKey(sortedstr))
	          {
	        	if(!map.get(sortedstr).contains(strs[i]))
	        		map.get(sortedstr).add(strs[i]);  
	          }
	          else
	          {
	        	  ArrayList<String> stre_str = new ArrayList<String>();
	        	  stre_str.add(strs[i]);
	        	  map.put(sortedstr, stre_str);
	          }
	      }
	      for(String s : map.keySet())
	      {
	    	  ArrayList<String> map_list = new ArrayList<String>();
	    	  map_list.addAll(map.get(s));
	    	  Collections.sort(map_list);
	    	  list.add(map_list);
	      }
	      return list;
	    }
	    
	    public String getSortedString(String s)
	    {
	        char[] word = s.toCharArray();
	        Arrays.sort(word);
	        return new String(word);
	    }

}
