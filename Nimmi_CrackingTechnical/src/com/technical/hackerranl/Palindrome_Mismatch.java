package com.technical.hackerranl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome_Mismatch {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	 public static void main(String[] args) throws NumberFormatException, IOException {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	         BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		     int n=Integer.parseInt(buf.readLine());
	        
	        for(int k=0;k<n;k++)
	            {
	            String str=buf.readLine();
	            int i=0,index=-1;
	            int j=str.length()-1;
	            int flag = 0;
	            while(i<=j)
	                {
	                if(str.charAt(i)!=str.charAt(j))
	                {
	                        flag = 1;
	                        if((str.charAt(i+1)==str.charAt(j)) && (str.charAt(i)==str.charAt(j-1)))
	                        {
	                        	if(str.charAt(i+2)==str.charAt(j-1))
	                        	{
	                        		index = i;
	 	                            i++;
	                        	}
	                        	else
	                        	if(str.charAt(i+1)==str.charAt(j-2))
	                        	{
	                        		index = j;
	 	                            j--;
	                        	}
	                        }
	                        else
	                        if(i<str.length()-1 && (str.charAt(i+1)==str.charAt(j)))
	                        {
	                           index = i;
	                           i++;
	                        }
	                        else
	                        if(j>0 && (str.charAt(i)==str.charAt(j-1)))
	                        {
	                            index = j;
	                            j--;
	                        }
	                        else
	                            {
	                            index = -1;
	                            break;
	                        }
	                }
	                i++;
	                j--;
	            }
	            System.out.println(index);
	        }
	    }

}
