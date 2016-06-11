package com.careercupYahoo.Hashing;

public class ArrayTest {
	
private static int[] arr2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int[3];
		arr1[0] = 3;
		arr1[1] = 4;
		arr1[2] = 5;
		arr2= arr1;
		arr1 = new int[2];
		arr1[0] =6;
		System.out.println(arr2[0]);
		
	}

}
