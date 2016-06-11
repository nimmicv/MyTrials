package com.technical.generic;

public class RemoveDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2};
		System.out.println(removeDuplicates(nums));
	}
	public static int removeDuplicates(int[] nums) {
        int pos=0;
        int i=0;
        int repeat=nums[0];
        while(i<nums.length)
        {
            while(i<nums.length && nums[i]==repeat)
            {
                i++;
            }
            nums[pos]=repeat;
            pos++;
            if(i<nums.length)
            repeat=nums[i];
        }
        return pos;
        
    }

}
