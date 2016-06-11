package com.learn.sort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 100, 87, 60, 33, 21, 10, 9, 5, 4, 1 };
		int length = arr1.length;
		
		for(int i=0;i<length;i++)
		{
			int smallest = i;
			for(int j=i+1;j<length;j++)
			{
				if(arr1[j]<arr1[smallest])
					smallest = j;
			}
			if(smallest!=i)
			{
				int tmp = arr1[i];
				arr1[i]=arr1[smallest];
				arr1[smallest]=tmp;
				
			}
		}
		for(int i=0;i<length; i++)
		{
			System.out.println(arr1[i]);
		}
	}

}
