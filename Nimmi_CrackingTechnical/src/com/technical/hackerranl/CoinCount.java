package com.technical.hackerranl;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CoinCount {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
                CoinCount sn = new CoinCount();
                String[] str_n1 = buf.readLine().split(" ");
                int sum = Integer.parseInt(str_n1[0]);
                int num = Integer.parseInt(str_n1[1]);
	            int[] count=new int[num];
	            String[] str_n2 = buf.readLine().split(" ");
                for(int i=0;i<str_n2.length;i++)
                    {
                    count[i] = Integer.parseInt(str_n2[i]);
                }
        int value = sn.findWays(sum,count,num);
        System.out.println(value);
    }
    
    public int findWays(int sum, int[] coins, int coins_count)
        {
        if(sum==0)
            {
            return 1;
        }
        if(sum<0 || coins_count<0)
            {
            return 0;
        }
        return findWays(sum,coins,coins_count-1)+findWays(sum-coins[coins_count],coins,coins_count);
    }
}
