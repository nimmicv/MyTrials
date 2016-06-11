 package com.technical.generic;

public class StringPermute {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		permuteString("",s,s.length());
	}
	
	public static void permuteString(String perm,String orig, int n)
	{
		//System.out.println("Stringex = "+perm);
		if(perm.length() == n)
		{
			System.out.println("String = "+perm);
		}
		for(int i=0;i<orig.length();i++)
		{
			permuteString(perm+orig.charAt(i),orig.substring(0, i)+orig.substring(i+1, orig.length()),n);
		}
	}

}
