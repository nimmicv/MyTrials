package com.technical.generic;

public class BinarySearch_Rotated {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,15,30,50,80};
		//int index = binarySearch(array,0,array.length-1,100);
		//System.out.println("Found item at index = "+ index);
		
//		int[] array2 = {5,5,5,5,5,5,5,5,6,8};
//		
//		binarySearch_repeated(array2,0,array2.length-1,5);
		//int[] array3 = {4,5,6,7,8,1,2,3};
		//int[] array3 = {6,7,8,1,2,3,4,5};
		int[] array3 = {3,1};
		System.out.println(binarySearch_rotatedArray(array3,0,array3.length-1,1));
	}
	
	public static int binarySearch(int[] array,int lb, int ub, int item)
	{
		if(lb>ub)
		{
			return -1;
		}
		int mid = (lb+ub)/2;
		if(array[mid] == item)
		{
			return mid;
		}
		if(item>array[mid])
		{
			return binarySearch(array, mid+1, ub, item);
		}
		else
		{
			return binarySearch(array, lb, mid-1, item);
		}
	}
	
	public static void binarySearch_repeated(int[] array,int lb, int ub, int item)
	{
		int left_index =  binarySearch_leftindex(array,0,array.length-1,5);
		System.out.println("Left Index = "+ left_index);
		int right_index = binarySearch_rightindex(array,0,array.length-1,5);
		System.out.println("Right Index = "+ right_index);
	}
	
	public static int binarySearch_leftindex(int[]array,int lb, int ub, int item)
	{
		if(lb>ub)
		{
			return -1;
		}
		int mid = (lb+ub)/2;
		if(array[mid] == item)
		{
			if(mid>0 && array[mid-1] == item)
			{
				return binarySearch_leftindex(array, lb, mid-1, item);
			}
			else
			{
				return mid;
			}
		}
		else
		if(item<=array[mid])
		{
			return binarySearch_leftindex(array, lb, mid-1, item);			
		}
		else
		{
			return binarySearch_leftindex(array, mid+1, ub, item);
		}
	}
	
	public static int binarySearch_rightindex(int[]array,int lb, int ub, int item)
	{
		if(lb>ub)
		{
			return -1;
		}
		int mid = (lb+ub)/2;
		if(array[mid] == item)
		{
			if(mid<(array.length-1) && array[mid+1] == item)
			{
				return binarySearch_rightindex(array, mid+1, ub, item);
			}
			else
			{
				return mid;
			}
		}
		else
		if(item>=array[mid])
		{
			return binarySearch_rightindex(array, mid+1, ub, item);			
		}
		else
		{
			return binarySearch_rightindex(array, lb, mid-1, item);
		}
	}
	
	//There are 2 cases where left elements are all in ascending order 
	// or  right elements are all in ascending order
	public static int binarySearch_rotatedArray(int[]array,int lb, int ub, int item)
	{
		if(lb>ub)
		{
			return -1;
		}
		int mid = (lb+ub)/2;
		if(array[mid] == item)
		{
			return mid;
		}
		else
		//Case 1 All left elements are sorted
		if(array[lb]<=array[mid])
		{
			if(item<=array[mid] && item>=array[lb])
				return(binarySearch_rotatedArray(array,lb,mid-1,item));	
			else
				return(binarySearch_rotatedArray(array,mid+1,ub,item));
		}
		else
		//Case 2 All right elements are sorted
		{
			if(item>=array[mid] && item<=array[ub])
				return(binarySearch_rotatedArray(array,mid+1,ub,item));
			else
				return(binarySearch_rotatedArray(array,lb,mid-1,item));	
		}
	}

}
