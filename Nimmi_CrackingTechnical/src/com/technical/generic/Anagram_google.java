package com.technical.generic;

public class Anagram_google {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findAnagrams("stbcde","","abc",3);
//		if(findAnagrams("stbcade","","abc",3))
//		{
//			System.out.println("True");
//		}
//		else
//		{
//			System.out.println("False");
//		}
	}
	
	public static void findAnagrams(String biggerString,String anagram, String original,int length)
	{
		
		if(anagram.length()==length)
		{
			if(biggerString.contains(anagram))
			{
				System.out.println("True");
			}
		}
		for(int i=0;i<original.length();i++)
		{
			findAnagrams(biggerString,anagram+original.charAt(i),original.substring(0,i)+original.substring(i+1, original.length()),length);
		}
	}

}
