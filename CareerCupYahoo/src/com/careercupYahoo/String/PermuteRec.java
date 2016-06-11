package com.careercupYahoo.String;

import java.util.ArrayList;

public class PermuteRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "abcd";
		PermuteRec rc = new PermuteRec();
		ArrayList<StringBuffer> list = rc.findPerm(new StringBuffer(s), s.length()-1);
		for(StringBuffer str : list)
		{
			System.out.println(str.toString());
		}
	}

	public ArrayList<StringBuffer> findPerm(StringBuffer s,int length)
	{
		if(length==0)
		{
			ArrayList<StringBuffer> list = new ArrayList<StringBuffer>();			
			list.add(new StringBuffer(s.substring(length, length+1)));
			return list;
		}
		ArrayList<StringBuffer> list = findPerm(s,length-1);
		ArrayList<StringBuffer> list2 = new ArrayList<StringBuffer>();
		for(StringBuffer str : list)
		{
			for(int i=0;i<=str.length();i++)
			{
				StringBuffer b = addToString(str,s.charAt(length),i);
				list2.add(b);
			}
			
		}
		return list2;
		
	}
	
	public StringBuffer addToString(StringBuffer sf,char x,int pos)
	{
		StringBuffer sb = new StringBuffer(sf.toString());
		return (sb.insert(pos, x));	
	}
	
	
}
