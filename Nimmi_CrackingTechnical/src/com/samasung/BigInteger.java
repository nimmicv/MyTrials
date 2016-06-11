package com.samasung;

import java.util.Arrays;
import java.util.Collections;

public class BigInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int c = 23455;
		//System.out.println(solution(c));
		int[] a = {10,20,60,40,50,30,20,50,50,100,30,60,70,99999999,22222222,454566666};
		if(solution(a))
		{
			System.out.print("True");
		}
		else
		{
			System.out.print("False");
		}
	}
	  public static boolean solution(int[] A) {
	        // write your code in Java SE 8
	        int[] B = new int[A.length];
	        B = A.clone();
	        Arrays.sort(B);
	        for(int i=0;i<A.length;i++)
	        {
	        	System.out.print(A[i]+"\t");
	        }
	        System.out.print("\n");
	        for(int i=0;i<A.length;i++)
	        {
	        	System.out.print(B[i]+"\t");
	        }
	        int count =0;
	        for(int i=0;i<A.length;i++)
	        {
	        	if(A[i]!=B[i])
	        	{
	        		count++;
	        	}
	        	if(count>2)
	        	{
	        		return false;
	        	}
	        }
	        return true;
	        
	        //System.out.println(B.toString());
	        //return true;
	    }
	
	public static  int solution(int N) {
        // write your code in Java SE 8
        int[] number = new int[10];
        int new_number =0;
        while(N>0)
        {
            int x = N%10;
            N= N/10;
            if(number[x] == 0)
            {
            	number[x] = 1;
            }
            else
            {
            	number[x]++;
            }
        }
        for(int i=9;i>=0;i--)
        {
            while(number[i]>0)
            {
                new_number = (new_number*10) + i;
                number[i]--;
            }
                
        }
        return new_number;
        
    }

}
