package com.technical.google.DivideConquer;

public class HistogramArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {6,2,5,4,5,1,6};
		int val = Divide_Conquer(array,0,array.length-1);
		System.out.println("Value = "+val);
	}
	
	public static int Divide_Conquer(int[] array, int left, int right)
	{
		if(right<left)
		{
			return Integer.MIN_VALUE;
		}
		if(left==right)
		{
			return array[left];
		}
		int mid = getMin(array,left,right);

	    return Math.max(Math.max(Divide_Conquer(array,left,mid-1), Divide_Conquer(array,mid+1,right)),(right-left+1)*array[mid]);

	}
	
	public static int getMin(int[]array, int l, int r)
	{
		int min = l;
		for(int i=l;i<=r;i++)
		{
			if(array[i]<array[min])
			{
				min = i;
			}
		}
		return min;
		
	}

}
