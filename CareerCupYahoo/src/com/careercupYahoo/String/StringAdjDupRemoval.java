package com.careercupYahoo.String;

public class StringAdjDupRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCCBBABBDDAFF";
		System.out.println(RemoveDup(s));
	}
	
	public static String RemoveDup(String s)
	{
		StringBuffer sf = new StringBuffer(s);
		StringBuffer sb = Remove(sf);
		return sb.toString();
	}
	
	public static StringBuffer Remove(StringBuffer sb)
	{
		int flag =0;
		for(int i=0;i<sb.length()-1;i++)
		{
			if(sb.charAt(i) == sb.charAt(i+1))
			{
			flag =1;
			break;
			}
		}
		if(flag ==0)
		{
			return sb;
		}
		else
		{
			for(int i=0;i<sb.length()-1;i++)
			{
				if(sb.charAt(i) == sb.charAt(i+1))
				{
			     sb.deleteCharAt(i);
			     sb.deleteCharAt(i);
				}
			}
		}
		return (Remove(sb));
	}

}
