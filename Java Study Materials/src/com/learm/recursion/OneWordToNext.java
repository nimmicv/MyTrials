package com.learm.recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class OneWordToNext {
	public static Set<String> set;
	public int flag =0;
	
	
	public OneWordToNext()
	{
		set = new HashSet<String>();
		//list = new LinkedList<String>();
		//set.add("SAD");
//		set.add("MID");
//		set.add("SID");
//		set.add("SIM");
//		set.add("MAD");
		set.add("DAMP");
		set.add("LIKE");
		set.add("LAME");
		set.add("LAKE");
		set.add("DAME");
		set.add("DIME");
		set.add("LAMP");
		set.add("LIMP");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneWordToNext own = new OneWordToNext();	
		//List list;
		ArrayList<String> list = new ArrayList<String>();
		list = own.getWords("LIKE".toCharArray(),"DAMP".toCharArray());
		
		for (String s : list)
		{
			System.out.println(s);
		}
	}
	
	
	public ArrayList getWords(char[] s1,char[] s2)
	{
		ArrayList<String> list = new ArrayList<String>();
		if(new String(s2).equals(new String(s1)))
		{
			list.add("");
			return list;
		}
		for(int i=0;i<s1.length;i++)
		{
			
			if(s1[i] != s2[i])
			{
				char[] temp2 = s2.clone();
				temp2[i] =s1[i];
				if(set.contains(new String(temp2)))
				{
					
					list.add(new String(temp2));
					//int prevSize = list.size();
					ArrayList re = getWords(s1,temp2);
					 if(re.size() > 0){
						list.addAll(re);
						 return list;
					 }else {
						 list.remove(list.size()-1);
					 }
				}
			}
		}
		return list;
	}
		
	

}
