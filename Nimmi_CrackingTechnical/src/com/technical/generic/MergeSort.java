package com.technical.generic;

public class MergeSort {
	
	public static void sort_merge(int[] array)
	{
		int lb1=0;
		int ub1=0;
		int lb2=0;
		int ub2=0;
		int length = array.length-1;
		int size =1;
		int[] teamp_array = new int[array.length];
		
		while(size<length)
		{
			lb1=0;
			ub1=lb1+size-1;
			int i=0;
			while(ub1<=length)
			{
				lb2 = ub1+1;
				ub2 = lb2+size -1;
				if(ub2>length)
				{
					ub2 = length;
				}
				
				while(lb1<=ub1 && lb2<=ub2)
				{
					if(array[lb1]<array[lb2])
					{
						teamp_array[i]=array[lb1];	
						lb1++;
					}
					else
					{
						teamp_array[i]=array[lb2];	
						lb2++;
					}
					i++;
					
				}
				while(lb1<=ub1)
				{
					teamp_array[i]=array[lb1];
					lb1++;
					i++;
				}
				while(lb2<=ub2)
				{
					teamp_array[i]=array[lb2];
					lb2++;
					i++;
				}
				lb1=ub2+1;
				ub1=lb1+size-1;
			}
			//To accomodate ub1<length cases
			while(i<array.length)
			{
				teamp_array[i] = array[i];
				i++;
			}
			for(int j=0;j<array.length;j++)
			{
				array[j] = teamp_array[j];
			}
			size=size*2;
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
	}

}
