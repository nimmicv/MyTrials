package com.technical.generic;

public class QuickSort {
	
	public static void doquickSort(int[] array)
	{
		sort_quick(array,0,array.length-1);
		System.out.print("\n");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	
	public static void sort_quick(int[] array, int low, int high)
	{
		if(high>=low)
		{
		int partition = partition_quicksort(array,low,high);
		sort_quick(array,low,partition-1);
		sort_quick(array,partition+1,high);
		}
		
		
	}
	public static int[] sort_quick_n(int[] array, int low, int high, int index)
	{
		if(high>=low)
		{
			int partition = partition_quicksort(array,low,high);
			if(partition == index)
			{
				int[] temparray = new int[partition];
				for(int i=0;i<partition;i++)
				{
					temparray[i] = array[i];
				}
				return temparray;
			}
			else
			{
				if(partition > index)
				{
					return(sort_quick_n(array,low,partition-1,index));
				}
				else
				{
					return(sort_quick_n(array,partition+1,high,index));
				}
			}
		}
		
		return null;
		
		
	}
	
	public static int partition_quicksort(int[] array, int low, int high)
	{
		int pivot = array[low];
		int leftindex = low;
		int rightindex = high;
		while(leftindex<rightindex)
		{
			while(leftindex<high && array[leftindex]<=pivot)
			{
				leftindex++;
				
			}
			while(rightindex>low && array[rightindex]>pivot)
			{
				rightindex--;
			}
			if(leftindex<rightindex)
			{
				int tmp =array[leftindex];
				array[leftindex] = array[rightindex];
				array[rightindex] = tmp;
			}
		}
		if(leftindex>=rightindex)
		{
			int tmp = array[rightindex];
			array[rightindex] = array[low];
			array[low] = tmp;
		}
		return rightindex;
	}

}
