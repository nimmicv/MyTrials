package com.technical.facebook;

public class StringPrefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintPermutes("abcs");
	}
	
	public static void PrintPermutes(String s1)
	{
		for(int i=1;i<s1.length();i++)
		{
			String str = s1.substring(0, i);
			String str2 = s1.substring(i);
			System.out.println("Str1 = "+str+" Str2 = "+str2);
			PrintPermutes(str2);
		}
	}

}
