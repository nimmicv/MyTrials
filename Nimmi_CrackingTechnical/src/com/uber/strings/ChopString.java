package com.uber.strings;

import java.util.ArrayList;

public class ChopString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int buffer = 15;
		String str = "one twowertyuio";
		ArrayList<String> list = new ArrayList<String>();
		int curindex = 0;
		System.out.println(str.charAt(buffer));
		while(str!="")
		{
			curindex = buffer;
			while(curindex<str.length()&&str.charAt(curindex)!=' ')
			{
				curindex --;
			}
			if(curindex<str.length())
			{
				list.add(str.substring(0, curindex+1));
				str = str.substring(curindex+1, str.length());
			}
			else
			{
				list.add(str.substring(0, str.length()));
				str = "";
			}
		}
		for(String s : list)
		{
			System.out.println(s);
		}
	}

}
