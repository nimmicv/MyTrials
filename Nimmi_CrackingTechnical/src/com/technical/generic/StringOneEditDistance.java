package com.technical.generic;

public class StringOneEditDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(checkoneedit("xz","xzy"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	
	//small string first
	public static boolean checkoneedit(String s1, String s2)
	{
		if(s1.isEmpty() || s2.isEmpty())
		{
			return false;
		}
		if(s1.length()>s2.length())
		{
			String temp = s1;
			s1=s2;
			s2=temp;
		}
		if((s1.length()!=s2.length()) && (s1.length()+1 < s2.length()))
		{
			return false;
		}
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i) != s2.charAt(i))
			{
				if(s1.length()==s2.length())
				{
					//Special caselast character mismatch
					if(i==(s1.length()-1))
					{
						return true;
					}
					return(s1.substring(i+1).equals(s2.substring(i+1)));
							
				}
				else
				{
					return(s1.substring(i).equals(s2.substring(i+1)));
				}
			}
		}
		return s1.length()!=s2.length();
	}

}
