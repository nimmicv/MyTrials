package com.learn.LinkedList;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedListTry {

	private static List first = null;
	private static List odd = null;
	private static List even = null;
	private static List newList = null;
	
	public static void createList(int n)
	{
		
		int i;
		for(i=1;i<=n;i++)
		{
			List newlist = new List(i);
			newlist.link = null;
			if(first == null)
			first = newlist;
			else
			{
				List temp = first;
				while(temp.link!=null)
					temp = temp.link;
				temp.link = newlist;
			}
			
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of digits : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bsr = new BufferedReader(isr);
		String s = bsr.readLine();
		int number =Integer.parseInt(s);
		createList(Integer.parseInt(s));
		System.out.println("Original List");
		display(first);
		if(number>1)
		{
			//Copy Values
			split();
			//Copy nodes
			split2();
		}
	}
	
	public static void display(List lst)
	{
		List temp = lst;
		while(temp!=null)
		{
			System.out.println(temp.id);
			temp = temp.link;
		}
	}
	
	public static void split2()
	{
		List temp = first;
		List tempnew = null ;
		while(temp!=null)
		{
			if(newList == null)
			{
				newList = temp.link; 
			    first.link = temp.link.link;
			    newList.link = null;
			    tempnew = newList;
			}
			else
			{
				tempnew.link =temp.link;
				if(temp.link!=null)
				temp.link = temp.link.link;
				tempnew=tempnew.link;
				
			}
			temp = temp.link;
		}
		System.out.println("List 1");
		display(first);
		System.out.println("List 2");	
		display(newList);
		}
	
	public static void split()
	{
		List tempfirst = first;
		int i = 1;
		while(tempfirst!=null)
		{
			if(i==1)
			{
				List newlist = new List(tempfirst.id);
				newlist.link = null;
				if(odd == null)
				odd = newlist;
				else
				{
					List temp = odd;
					while(temp.link!=null)
						temp = temp.link;
					temp.link = newlist;
				}
				
				i++;
				
			}
			else
			{

				List newlist = new List(tempfirst.id);
				newlist.link = null;
				if(even == null)
				even = newlist;
				else
				{
					List temp = even;
					while(temp.link!=null)
						temp = temp.link;
					temp.link = newlist;
				}
				
				i--;
			}
			tempfirst = tempfirst.link;
		}
		System.out.println("odd List");
		display(odd);
		System.out.println("even List");
		display(even);
	}

}
