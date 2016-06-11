package com.technical.generic;

public class HeapSort {
	
	public static void sort_heap(int[] array)
	{
		int length= array.length-1;
		while(length>0)
		{
			int temp = array[0];
			array[0] = array[length];
			array[length] = temp;
			Heapify.Heapify(array, 0, length);
			length--;
			System.out.print("\n");
			for(int i=0;i<array.length;i++)
			{
				System.out.print(array[i]+" ");
			}
		}
		
//		System.out.print("\n");
//		for(int i=0;i<array.length;i++)
//		{
//			System.out.print(array[i]+" ");
//		}
	}

}
