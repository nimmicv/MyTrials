	package com.technical.generic;

public class QuickSort_Solution {
	
	public static void main(String[] args)
	{
		QuickSort_Solution qsr = new QuickSort_Solution();
		int[] array = {0,1,2,4,6,5,3};
		System.out.println(qsr.findKthLargest(array, 3));
	}
    public int findKthLargest(int[] nums, int k) {
        
      return(quicksort(nums,0,nums.length-1,k));  
    }
    
    public int quicksort(int[]array,int low,int high,int index)
    {
        if(high>=low)
		{
			int partition = partition(array,low,high);
			if(partition == index)
			{
				return array[partition];
			}
			else
			{
				if(partition > index)
				{
					return(quicksort(array,low,partition-1,index));
				}
				else
				{
					return(quicksort(array,partition+1,high,index));
				}
			}
		}
		else
		{
		    return -1;
		}
    }
    
    public int partition(int[] nums, int lb,int ub)
    {
        int pivot = nums[lb];
        int low = lb;
        int high = ub;
        while(low<high)
        {
            while(low<ub && nums[low]<=pivot)
            {
                low++;
            }
            while(high>lb && nums[high]>pivot)
            {
                high--;
            }
            if(low<high)
            {
                int temp = nums[low];
                nums[low]= nums[high];
                nums[high] = temp;
            }
        }
        if(low>=high)
        {
            int temp = nums[high];
            nums[high] = nums[lb];
            nums[lb] = temp;
        }
        return high;
        
    }
}
