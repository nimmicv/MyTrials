package com.trials.others;

public class RecSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {20,30,40,60};
		RecSum rc = new RecSum();
		System.out.println(rc.findSum(numbers,0));
	}
	
	public int findSum(int[] arr, int index)
	{
		int sum=0;
		if(index == arr.length)
		{
			return sum;
		}
		
		sum = arr[index]+findSum(arr, index+1);
		return sum;
		
	}

}
