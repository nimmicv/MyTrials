package com.careercupYahoo.com;

public class printRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		printSum(a,a.length);
	}
	
	public static void printSum(int[] arr, int num)
	{
		if(num == 0)
		{
			System.out.print("\n");
			return;
		}
		
		for(int i=0;i<num;i++)
		{
			printSum(arr,i);
			System.out.print(arr[i]+"\t");
		}
	}

}
