package com.technical.generic;

public class SelectionSort {
	
	public static void sort_selection(int[] array)
	{
		//Select the smallest integer and swap it with integer at location 0,1,2.. n
		
		for(int i=0;i<array.length;i++)
		{
			int smallest = array[i];
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]<smallest)
				{
					smallest = array[j];
				}
			}
			if(smallest!=array[i])
			{
				int temp = array[i];
				array[i] = smallest;
				smallest = temp;
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+"-");
		}
		
	}

}
