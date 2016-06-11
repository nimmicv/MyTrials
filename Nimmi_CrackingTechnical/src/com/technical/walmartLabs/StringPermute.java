package com.technical.walmartLabs;

import java.util.ArrayList;

public class StringPermute {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = permute("abc",0);
		for(String s : list)
		{
			System.out.println(s);
		}
	}
	
	public static ArrayList<String> permute(String str,int index)
	{
		if(index == str.length()-1)
		{
			ArrayList<String> alist = new ArrayList<String>();	
			alist.add(String.valueOf(str.charAt(index)));
			return alist;
		}
		Character x = str.charAt(index);
		ArrayList<String> curlist = permute(str,index+1);
		ArrayList<String> newList = new ArrayList<String>();
		for(String st : curlist)
		{
			for(int i=0;i<=st.length();i++)
			{
				String s = st.substring(0,i)+x+st.substring(i,st.length());
				newList.add(s);
			}
		}
		return newList;
	}

}
