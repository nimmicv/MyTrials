package com.technical.generic;

public class InsertionSort {
	
//	Keep inserting new elements at the right position
//	After i iterations the first i elements are ordered.
//
//	In each iteration the next element is bubbled through the sorted section until it reaches the right spot:
//
//	sorted  | unsorted
//	1 3 5 8 | 4 6 7 9 2
//	1 3 4 5 8 | 6 7 9 2
	public static void sort_insert(int[] array)
	{
		for(int i=1;i<array.length;i++)
		{
			//Work Backwards
			for(int j=i;j>0;j--)
			{
				if(array[j]<array[j-1])
				{
					int temp = array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+"-");
		}
	}

}
