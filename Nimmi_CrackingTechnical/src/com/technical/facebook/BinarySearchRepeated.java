package com.technical.facebook;

public class BinarySearchRepeated {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,5,5,5};
		int index = binarySeach_Higher(array,0,array.length-1,5);
		System.out.println("Index = " + index);
	}

	public static int binarySeach_Lower(int[] array,int low, int high, int number)
	{	
		while(low<=high)
		{
			int mid = low + ( high - low)/2;
			if(array[mid]==number)
			{
				if(mid == 0 ||array[mid-1]!=number)
				{
					return mid;
				}			
			}
			if(number<=array[mid])
			{
				high = mid-1;
			}
			if(number>array[mid])
			{
				low = mid+1;
			}
		}
		return -1;
	}
	
	public static int binarySeach_Higher(int[] array,int low, int high, int number)
	{	
		while(low<=high)
		{
			int mid = low + ( high - low)/2;
			if(array[mid]==number)
			{
				if(mid == array.length-1 ||array[mid+1]!=number)
				{
					return mid;
				}			
			}
			if(number<array[mid])
			{
				high = mid-1;
			}
			if(number>=array[mid])
			{
				low = mid+1;
			}
		}
		return -1;
	}
}
