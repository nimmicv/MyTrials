package com.crack.hortons;

import java.util.Arrays;
import java.util.Comparator;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String[] arr = {"manu","Hello","lleHo","namu","hi","how","ih","woh"};
      
      
      class compareme implements Comparator<String>
      {
    	  
    	  public String sortme(String s)
    	  {
    		  char[] cs = s.toCharArray();
    		  Arrays.sort(cs);
    		  return (new String(cs));
    		  //return null;
    	  }

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return(sortme(o1).compareToIgnoreCase(sortme(o2)));
		}
    	  
      }
      
      Arrays.sort(arr,new compareme());
      for(String s : arr)
      {
    	  System.out.println(s);
      }
 	}

}
