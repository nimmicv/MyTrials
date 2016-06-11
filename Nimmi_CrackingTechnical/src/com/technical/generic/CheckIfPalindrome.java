package com.technical.generic;

public class CheckIfPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(checkIfPAlindrome("aa"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	
	public static  boolean checkIfPAlindrome(String s)
	{
		int i=0;
		int j=s.length()-1;
		while(i<=j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				i++;
				j--;
			}
			else
				return false;
		}
		return true;
	}

}
