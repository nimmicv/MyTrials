package com.learn.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortanagram {
	
	
 //You can't override String's compareTo method because the class is final. 
	//But you can provide a custom Comparator to Arrays#sort().
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String[] list ={"abc", "nimmi","manu", "namu","cba","mimni"};
    
   /* List<SortString> alist = new ArrayList<SortString>();
    alist.add(new SortString("abc"));
    alist.add(new SortString("nimmi"));
    alist.add(new SortString("manu"));
    alist.add(new SortString("namu"));
    alist.add(new SortString("cba"));
    alist.add(new SortString("mimni"));
    
    Collections.sort(alist);
    for(SortString s : alist)
    {
    	System.out.println(s.word);
    }*/ //nly for reference
    
   
    class StringComparator implements Comparator<String>
	{

		public String sortme(String str)
		{
			char s[] = str.toCharArray();
			Arrays.sort(s);
			String newstr = new String(s);
			
			return newstr;
			//Stack<Character> stc = new Stack<Character>();
			
		}
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return(sortme(o1).compareToIgnoreCase(sortme(o2)));
		}
		
	}
    
    Arrays.sort(list, new StringComparator());
    
//    for(String s : list)
//    {
//    	System.out.println(s);
//    }
	}
	
	

}
