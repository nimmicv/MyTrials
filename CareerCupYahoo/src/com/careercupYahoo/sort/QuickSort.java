package com.careercupYahoo.sort;

public class QuickSort {
	static int totLength =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50,30,10,67,85,92,5,2,34};
		int number =34;
		//int[] arr = {1,4,5,7,39,57,65,76,80};
		
		totLength = arr.length-1;
		//quicksort(arr,0,arr.length-1);
		int pos = findNumber(arr,0,arr.length-1,number);
		if(pos>=0)
		{
			System.out.println(arr[pos]);
		}
		else
		{
			System.out.println("Not Found");
		}
 	}
	
	public static void quicksort(int[] arr,int left,int right)
	{
		int partitionNum;
		if(right>left)
		{
			partitionNum =partition(arr,left,right);
			System.out.println();
			for(int i=0;i<=totLength;i++)
			{
				System.out.print(arr[i] + "\t");
			}
			quicksort(arr,left,partitionNum-1);
			quicksort(arr,partitionNum+1,right);
		
		}
		
	}
	
	public static int findNumber(int[] arr,int left,int right,int number)
	{
		int partitionNum = 0;
		if(right>=left)
		{
			partitionNum =partition(arr,left,right);
			System.out.println();
			for(int i=0;i<=totLength;i++)
			{
				System.out.print(arr[i] + "\t");
			}
			if(arr[partitionNum] == number)
			{
				return partitionNum;
			}
			else
			{
				if(number > arr[partitionNum])
				{
					return(findNumber(arr,partitionNum+1,right,number));
				}
				else
				{
					return(findNumber(arr,left,partitionNum-1,number));
				}
			}
			
		}
		return -1;
	}
	
	public static int partition(int[] array,int low, int high)
	{
		int pivot = array[low];
		int curLow = low;
		int curHigh = high;
		while(curLow<curHigh)
		{
			while(curLow<high && array[curLow]<=pivot)
			{
				curLow++;
			}
			while(curHigh>low && array[curHigh]>pivot)
			{
				curHigh--;
			}
			if(curLow<curHigh)
			{
				int temp = array[curLow];
				array[curLow] = array[curHigh];
				array[curHigh] = temp;
			}
		}
		if(/*low!=curHigh &&*/ curLow>=curHigh)
		{
			int temp = array[curHigh];
			array[curHigh] = array[low];
			array[low] = temp;
		}
		return curHigh;

		
		
		
	}

}
