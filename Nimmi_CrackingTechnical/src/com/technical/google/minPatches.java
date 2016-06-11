package com.technical.google;

public class minPatches {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,5,10};
		int n=20;
		long miss = 1, added = 0;
		int i = 0;
	    while (miss <= n) {
	        if (i < nums.length && nums[i] <= miss) {
	            miss += nums[i++];
	        } else {
	            miss += miss;
	            added++;
	        }
	    }
	   System.out.println("added = "+added);

	}
	
}
