 package com.careercupYahoo.com;

public class DPLongestSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,20,60,10,11,7,16};
		int[][] newarr = new int[arr.length][2];
		for(int i=0;i<arr.length;i++)
		{
			newarr[i][0]=i;
			newarr[i][1]=1;
		}
		findSum(arr,arr.length,newarr);
 	}
	// Store the sequence length soo far, current length = length so far + currentLength
	public static void findSum(int[] arr, int size, int[][] newarr)
	{
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(arr[i]>arr[j] && newarr[j][1]>=newarr[i][1])
				{
					//newarr[i][0] = j;
					newarr[i][1] = newarr[j][1]+1;
				}
					
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(newarr[i][0] +"\t" +newarr[i][1]);
		}
		
		for(int i=0;i<size;i++)
		{
			
		}
	}
	

}
