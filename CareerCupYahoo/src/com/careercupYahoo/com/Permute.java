package com.careercupYahoo.com;

import java.util.ArrayList;

public class Permute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		Permute prm = new Permute();
		ArrayList<StringBuffer> sbr = prm.permuteMe(new StringBuffer(s),s.length()-1);
		for(StringBuffer st : sbr)
		{
			System.out.println(st);
		}
		
	}
	
	public ArrayList<StringBuffer> permuteMe(StringBuffer s,int charAt)
	{
		if(charAt<0)
		{
			String st = "";
			StringBuffer sb = new StringBuffer(st);
			
			ArrayList<StringBuffer> bfr = new ArrayList<StringBuffer>();
			bfr.add(sb);
			return bfr;
		}
		else
		{
			ArrayList<StringBuffer> alist = permuteMe(s,charAt-1);
			ArrayList<StringBuffer> newLsit = new ArrayList();
			for(StringBuffer str : alist)
			{
				for(int i=0;i<=str.length();i++)
				{
					StringBuffer b = addToString(str,s.charAt(charAt),i);
					newLsit.add(b);
				}
			}
			return newLsit;
		}
		
	}
	
	public StringBuffer addToString(StringBuffer sf,char x,int pos)
	{
		StringBuffer sb = new StringBuffer(sf.toString());
		return (sb.insert(pos, x));	
	}

}
