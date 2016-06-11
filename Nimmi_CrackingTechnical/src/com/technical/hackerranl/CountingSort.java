package com.technical.hackerranl;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountingSort {



	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        try{
	        	Stack<String> stk = new Stack<String>();
	            BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	            int n=Integer.parseInt(buf.readLine());
	            int[] count=new int[100];
	            String[] str=buf.readLine().split(" ");
	            for(int i=0;i<n;i++){
	                count[Integer.parseInt(str[i])]++;
	            }
	            for(int i=0;i<99;i++){
	                System.out.print(count[i]+" ");
	            }
	            System.out.println(count[99]);
	        }catch(Exception e){}
	    }
	    
	    static int NumberOfPairs(int[] a, long k) {
	        HashMap<Long,Boolean> map = new HashMap<Long,Boolean>();
	        int count = 0;
	        for(int i=0;i<a.length;i++)
	            {
	            int val = (int) (k-a[i]);
	            if(!map.containsKey(a[i]))
	                {
	                map.put((long) a[i],false);
	            }
	            if(map.containsKey(val) && !map.get(val))
	                {
	                count++;
	                //map.put(val,true);
	                map.put((long) a[i],true);
	            }
	                
	                
	        }
	        return count;

	    }
	}

