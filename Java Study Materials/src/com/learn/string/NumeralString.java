package com.learn.string;

import java.util.HashMap;
import java.util.Map;

public class NumeralString {
	
	static Map<Integer,String> map10 = new HashMap<Integer,String>();
	static Map<Integer,String> map1 = new HashMap<Integer,String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map1.put(10, "Ten");
		map1.put(20, "Twenty");
		map1.put(30, "Thirty");
		map1.put(40, "Fourty");
		map1.put(50, "Fifty");
		map1.put(60, "Sixty");
		map1.put(70, "Seventy");
		map1.put(80, "Eighty");
		map1.put(90, "Ninty");
		map1.put(1, "One");
		map1.put(2, "Two");
		map1.put(3, "Three");
		map1.put(4, "Four");
		map1.put(5, "Five");
		map1.put(6, "Six");
		map1.put(7, "Seven");
		map1.put(8, "Eight");
		map1.put(9, "Nine");
		map1.put(10, "Ten");
		map1.put(11, "Eleven");
		map1.put(12, "Twelve");
		map1.put(13, "Thirteen");
		map1.put(14, "Fourteen");
		map1.put(15, "Fifteen");
		map1.put(16, "Sixteen");
		map1.put(17, "Seventeen");
		map1.put(18, "Eighteen");
		map1.put(19, "Ninteen");
		
		NumeralString ns = new NumeralString();
		String word =ns.convert(898);
		System.out.println(word);
		

	}
	
	public String convert(int num)
	{
		String word="";
		int x;
		while (num>0)
		{
			if(num>=100000)
			{
				x=num/100000;
				word = word + tens(x)+" Lakhs ";
				num=num%100000;
			}
			else
			if(num>=1000)
			{
				x=num/1000;
				word = word +tens(x)+" Thousand ";
				num=num%1000;
			}
			else
		    if(num>=100)
		    {
		    	x=num/100;
				word = word +tens(x)+" Hundred ";
				num=num%100;
		    }
		    else
		    {
		    	if(word !="")
		    	{
		    		word  = word + " and ";
		    	}
		    	word= word + tens(num);
		    	num=0;
		    }
		}
		return word;
	}
	
	public String tens(int x)
	{
		String word="";
		if(x<20)
		{
			word = map1.get(x);
		}
		else
		{
			int y=x/10;
			y=y*10;
			word = map1.get(y);
			x=x%10;
			word = word +" "+ map1.get(x);
		}
		
		return word;
			
	}
	

}
