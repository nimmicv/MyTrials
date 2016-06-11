package com.samsung.strings;

import java.util.Scanner;

public class duplicate_removal {

	/**
	 * @param args
	 */
	
	public static String removedup(String str)
	{
		char[] str_array = str.toCharArray();
		boolean flag = true;
		int i=0;int j= str_array.length;
		int end = -1;
		while(flag)
		{
			flag = false;
			end = -1;
			while(i<j)
			{
				if(i<j-1 && str_array[i] == str_array[i+1])
				{
					i= i+2;
					flag = true;
				}
				else
				{
					str_array[++end]=str_array[i];
					i++;
				}
			
			}
			i=0;
			j=end+1;
		}
		for(i=0;i<str_array.length;i++)
		{
			System.out.print(str_array[i]);
		}
		String s = new String(str_array, 0, end+1);
		
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine())
		{
			String str = in.nextLine();
			System.out.println("Str = "+str);
			String dup_removed_string  = removedup(str);
			if(dup_removed_string.isEmpty())
			{
				dup_removed_string = "Empty String";
			}
			System.out.println("Dup removed string = "+dup_removed_string);
		}

	}

}
