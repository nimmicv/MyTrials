package com.learm.recursion;

public class Paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sbr = "";
		doParanth(3,3,sbr); 
	}
	
	public static void doParanth(int l, int r, String str)
	{
		System.out.println("Saving l= "+ (l) + " r = "+ r+" String = "+ str);
		if(l==0 && r==0)
		{
			System.out.println(str);
			return;
		}
		if(l>r)
		{
			return;
		}
		if(l>0)
		{
			//String str1 = str+'(';
			//System.out.println("Saving l= "+ (l-1) + " r = "+ r+" String = "+ str);
			doParanth(l-1,r,str+"(");
			
		}
		if(r>0)
		{
			//String str2  =str+')';
			//System.out.println("Saving l= "+ (l) + " r = "+ (r-1)+" String2 = "+ str);
			doParanth(l,r-1,str+")");
			
		}
		
	}

}
