package com.technical.google;

public class hist_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,2,7,8,6,1};
		int[] min = {0,0,0,0,0,0,0};
		int count = 0;
		//int k=1;
		for (int i = 0,k = 1; i < arr.length; i++, k++) {
			min[i] = Math.min(arr[i], k);
			if (arr[i] <= 0) k = 0;
		}

		for (int i = arr.length - 1, k = 1; i >= 0; i--, k++) {
			count = Math.max(count, Math.min(min[i], Math.min(arr[i], k)));
			if (arr[i] <= 0) k = 0;
		}

		System.out.println("Count = "+ count);

	}

}
