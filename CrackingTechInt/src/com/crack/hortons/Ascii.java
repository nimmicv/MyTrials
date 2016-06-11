package com.crack.hortons;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "abcdd";
		char[] str = s.toCharArray();
		int unique =0;
		for(int i=0;i<str.length;i++)
		{
			int val = 0;
			int shift = str[i]-'a';
			val= 1 << shift;
			if((unique & val)>0)
			{
				System.out.println("Duplicate Characters");
				break;
			}
			unique = unique|val;
			
		}
		
	}

}
