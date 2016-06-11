package com.technical.generic;

public class Heapify{
	
	public static int[] createMaxHeap(int[] array)
	{
		for(int i=(array.length/2);i>=0;i--)
		{
			Heapify(array, i, array.length);
//			System.out.print("\n");
//			for(int j=0;j<array.length;j++)
//			{
//				System.out.print(array[j]+" ");
//			}
		}
		return array;
	}
	
	public static void Heapify(int[] array, int pos, int length)
	{
		int left = 2 * pos+1;
		int right = (2 * pos)+2;
		int biggest = pos;
		if(left<length && array[left] > array[biggest])
		{
			biggest = left;
		}
		if(right<length && array[right] > array[biggest])
		{
			biggest = right;
		}
		if(biggest!=pos)
		{
			int tmp = array[biggest];
			array[biggest] = array[pos];
			array[pos] = tmp;
			Heapify(array,biggest,length);
		}
		
	}

}
