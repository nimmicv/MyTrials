package com.technical.google.dp;

import java.util.HashMap;

public class LongestIncreasingSubseq {

	/**
	 * @param args
	 */
	static HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {4,6,3,9,5,7,0,-1,10};
		long previous = System.currentTimeMillis();
		int count = LIS(array,array.length-1);
		long current = System.currentTimeMillis() - previous;
		System.out.println("Time = "+current);
		System.out.println(count);
		LIS_bottom_up(array,array.length-1);
		
	}
	
	//Top_Down with memoization
	public static int LIS(int[] array,int length)
	{
		if(length==0)
		{
			return 1;
		}
		if(count.containsKey(length))
		{
			return count.get(length);
		}
		int val = Integer.MIN_VALUE;
		for(int i=0;i<length;i++)
		{
			if(array[i]<=array[length])
				val = Math.max(val,1+LIS(array, i));
		}
		count.put(length,val);
		return val;
	}
	
	//Bottom_Up
	
	public static void LIS_bottom_up(int[] array,int length)
	{
		int max = Integer.MIN_VALUE;
		int[] tmparray = new int[length+1];
		for(int i=0;i<=length;i++)
		{
			tmparray[i]=1;
			for(int j=0;j<=i;j++)
			{
				if(array[j]<array[i])
				{
					tmparray[i]=Math.max(tmparray[i], tmparray[j]+1);
				}
			}
			max = Math.max(max, tmparray[i]);
		}
		System.out.println("Max = "+max);
	}
}
