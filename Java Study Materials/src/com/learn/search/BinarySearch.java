package com.learn.search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] x = {2,5,12,30,45,57,60,80};
    BinarySearch bs = new BinarySearch();
    int res = bs.doSearch(x,60);
    System.out.println(res);
	}
	
	public int doSearch(int[] x,int num)
	{
		int low = 0;
		int high = x.length-1;
		int mid = (low+high)/2;
		while(low<=high)
		{
			mid = (low+high)/2;
			if(num == x[mid])
			{
				return mid;
			}
			else
			if(num>x[mid])
			{	
					if(num>x[high] && x[low]>x[mid])
					{
						high = mid-1;
					}
					else
					{
						low = mid+1;
					}
					
			}
			else
			if(num<x[mid])
			{
				if(num<x[high] && x[high]<x[mid])
				{
					low = mid+1;
					
				}
				else
				{
					high = mid -1 ;
				}
			}
		}
		return -1;
	}

}
