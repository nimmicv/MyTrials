package com.crack.hortons;

public class FindNumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,2,2,2,2,3,3,4};
		int[] b = {1,2,3,4,5,6,10,15,16};
		FindNumberCount fnc = new FindNumberCount();
		System.out.println(fnc.findLowestCount(a,0,a.length-1,2));
		System.out.println(fnc.binarySearch(b, 0, b.length-1, 6));
		System.out.println(fnc.findHighestCount(a, 0, a.length-1, 2));
	}
	public int first(int arr[], int low, int high, int x, int n)
	{
	  if(high >= low)
	  {
	    int mid = (low + high)/2;  /*low + (high - low)/2;*/
//	    if( ( mid == 0 || x > arr[mid-1]) && arr[mid] == x)
//	      return mid;
	    if(x == arr[mid])
	    {
	    	return mid;
	    }
	    else if(x > arr[mid])
	      return first(arr, (mid + 1), high, x, n);
	    else
	      return first(arr, low, (mid -1), x, n);
	  }
	  return -1;
	}
	
	public int binarySearch(int[] arr, int low,int high, int elem)
	{
		
		if(high>=low)
		{
			int mid = (low + high) /2;
			if(arr[mid]==elem)
			{
				return mid;
			}
			else
			if(elem>arr[mid])
			{
				return binarySearch(arr,mid+1,high,elem);
			}
			else
			{
				return binarySearch(arr,low,mid-1,elem);
			}
		}
		return -1;
		//return 0;
	}
	
//	public int countElements(int[] arr, int x)
//	{
//		
//		
//		return 0;
//		
//	}
//	
	
	public int findHighestCount(int[] arr, int low, int high,int elem)
	{
		
		if(high>=low)
		{
			int mid = (low+high) /2 ;
			if((arr[mid] == elem ) && (mid == arr.length-1 || arr[mid+1]>elem ))
			{
				return mid;
			}
			else
			if(elem >= arr[mid])
			{
				return findHighestCount(arr,mid+1, high,elem);
			}
			else
			{
				return findHighestCount(arr,low, mid-1,elem);
			}
		}
		return -1;
	}
	public int findLowestCount(int[] arr, int low, int high,int elem)
	{
		if(high>=low)
		{
			int mid = (low + high )/2;
			if(arr[mid] == elem && (mid ==0 || arr[mid-1]<elem))
			{
				return mid;
			}
			else
				if(elem <= arr[mid])
				{
					return findLowestCount(arr,low,mid-1,elem);
				}
				else
				{
					return findLowestCount(arr,mid+1,high,elem);
				}
		}
		return -1;
	}
}
