package com.technical.google.string;

import java.util.HashMap;

public class KDistince {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 'a';
		System.out.println(val);

	}
	 public int lengthOfLongestSubstringKDistinct(String s, int k) {
	       HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	       int count =0;
	       int l=0,r=0;
	       int maxLeng = 0;
	        for(int i=0;i<s.length();i++)
	        {
	          if(!map.containsKey(s.charAt(i)))
	          {
	              map.put(s.charAt(i),1);
	              count++;
              if(count>k)
	              {
	                 while(count>k)
	                 {
	                	 if(map.get(s.charAt(l))==1)
	                	 {
	                		 map.remove(s.charAt(l));
	                		 count--;
	                	 }
	                	 else
	                	 {
	                		 map.put(s.charAt(l),map.get(s.charAt(l))-1);
	                	 }
	                	 l++;
	                 }
	              }
	          }
	          else
	          {
	             int sum = (map.get(s.charAt(i))) + 1;
	             map.put(s.charAt(i),sum); 
	          }
	          if(count <= k)
	          {
	            maxLeng = Math.max(maxLeng,i-l+1);  
	          }
	        }
	        return maxLeng;
	        
	    }

}
