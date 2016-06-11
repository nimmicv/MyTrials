package com.learm.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringRev {

	private static String s;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter String : ");
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader bfr = new BufferedReader(isr);
	s = bfr.readLine();
	String newS = reverse(s.length()-1);
	System.out.println(newS);
	printInt(2);
	
	}
	public static void printInt( int k ) {
		    if (k == 0) {
		         return;
		     }
		     System.out.println( k );
		     printInt( k - 1 );
	     System.out.println("all done");
		}
	
	public static String reverse(int len)
	{
		if(len==0)
		{
			Character c = s.charAt(0);
			return c.toString();
			
		}
		else
		{
			return (s.charAt(len) +""+ reverse(len-1));
		}
	}

}
