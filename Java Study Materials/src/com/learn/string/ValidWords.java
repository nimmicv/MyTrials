package com.learn.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ValidWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str ="MyNameIssisNimmi";
    Map<String,Integer> map= new HashMap<String,Integer>();
    map.put("My", 1);
    map.put("name", 2);
    map.put("Is", 3);
    ValidWords vw = new ValidWords();
    vw.find(str,map);
    String a="a";
    System.out.println("a 1-->"+a);
    String b=a;
    a="ty";
    System.out.println("a 2-->"+a);
    System.out.println("b  -->"+b);
	}
	
	

	public boolean find(String input, Map<String,Integer> map)
	{
	 String s = input;
	 s=s.toLowerCase();
	 StringBuffer sb = new StringBuffer(s);
	 Iterator itr =map.keySet().iterator();
	 for(String str: map.keySet())
	 {
		 str = str.toLowerCase();
		 if(s.contains(str))
		 {
			 s = s.replace(str, "");
		 }
	 }
	 System.out.println(s);
	 if(s=="")
		 return true;
	 else
		 return false;
	}

}
