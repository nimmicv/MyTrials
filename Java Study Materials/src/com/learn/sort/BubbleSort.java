package com.learn.sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 100, 87, 60, 33, 21, 10, 9, 5, 4, 1 };
		int length = arr1.length;
		for (int i = length-1; i >0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr1[j] > arr1[j + 1]) {
					int temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				}
			}
		}
		for(int i=0;i<length; i++)
		{
			System.out.println(arr1[i]);
		}
	
	}

}
