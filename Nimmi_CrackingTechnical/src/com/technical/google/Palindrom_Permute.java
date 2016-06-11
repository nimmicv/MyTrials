package com.technical.google;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Palindrom_Permute {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrom_Permute prem = new Palindrom_Permute();
		prem.generatePossibleNextMoves("++++");

	}
	 public boolean canPermutePalindrome(String s) {
	        Set<Character> set = new HashSet<Character>();
	        for(int i=0;i<s.length();i++)
	        {
	            if(set.contains(s.charAt(i)))
	            {
	              set.remove(s.charAt(i));
	            }
	            else
	            {
	              set.add(s.charAt(i));
	            }
	        }
	        if((set.size()==1 && s.length()%2==1) ||(set.size()==0 && s.length()%2==0))
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	        
	    }
	 
	 public List<String> generatePossibleNextMoves(String s) {
		 List<String> strings = new ArrayList<String>(); 
	        for(int i=0;i<s.length()-1;i++)
	        {
	            if(s.charAt(i)=='+' && s.charAt(i+1)=='+')
	            {
	            	String str = s.substring(0, i)+"--"+s.substring(i+2,s.length());
	            	strings.add(str);
	            }
	           
	        }
	        return strings;
	        
	    }

}
