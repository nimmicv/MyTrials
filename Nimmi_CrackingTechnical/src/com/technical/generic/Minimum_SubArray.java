package com.technical.generic;

public class Minimum_SubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,4,4};
		System.out.println(minSubArrayLen(4,array));
	}
	 public static int minSubArrayLen(int s, int[] nums) {
	        if(nums.length==0)
	        {
	            return 0;
	        }
	        
	        int minlength=Integer.MAX_VALUE;
	        int cursum=nums[0];
	        int j=1;
	        int i=0;
	        while(i<=j && i<nums.length)
	        {
	            while(j<nums.length && cursum<s)
	            {
	                cursum=cursum+nums[j];
	                j++;
	            }
	            if(cursum>=s)
	            {
	                if(i==j && minlength>0)
	                {
	                    minlength=0;
	                }
	                else
	                if((j-i) < minlength)
	                {
	                    minlength=j-i;
	                }
	            }
	            cursum=cursum-nums[i];
	            i++;
	        }
	        if(minlength == Integer.MAX_VALUE)
	        {
	            return 0;
	        }
	        else
	        {
	            return minlength;
	        }
	        
	    }

}
