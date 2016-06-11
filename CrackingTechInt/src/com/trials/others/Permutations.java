package com.trials.others;

import java.util.ArrayList;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		ArrayList<String> list= new Permutations().permute(s.toCharArray(),s.length()-1);
		for(String str: list)
		{
			System.out.println(str);
		}
	}
	
	public ArrayList<String> permute(char[] s,int i)
	{
		ArrayList<String> list = new ArrayList();
		if(i==-1)
		{
			list.add("");
			return list;
		}
		list = permute(s,i-1);
		ArrayList<String> newlist = new ArrayList(); 
		for(String str: list)
		{
			if(str.equals(""))
			{
				String modStr = Character.toString(s[i]);
				newlist.add(modStr);
			}
			else
			for(int j=0;j<=str.length();j++)
			{
				String modStr = append(str,s[i],j);
				newlist.add(modStr);
			}
		}
		list.addAll(newlist);
		return list;
	}
	
	public String append(String str, char s,int pos)
	{
		StringBuffer sb =new StringBuffer (str);
		sb.insert(pos, s);
		
		return sb.toString();
	}

}
