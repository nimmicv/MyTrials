package com.technical.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class MedianFinder {
	
	public static void main(String[] args)
	{
		MedianFinder mf = new MedianFinder();
		int [] nums = {5,2,8,9,100,80,20,60,50};
		//2,5,8,9,20,80,100
		for(int i=0;i<nums.length;i++)
		{
			mf.addNum(nums[i]);
			System.out.println(mf.findMedian());
		}
	}

    // Adds a number into the data structure.
	PriorityQueue minQ = new PriorityQueue<Double>();
    PriorityQueue maxQ = new PriorityQueue<Double>(10,new MaxHeapComparator());
    int numElements=0;
    
    public void addNum(int num) {
    	maxQ.add((double)num);
    	numElements++;
    	if(numElements%2==0)
    	{
    		if(minQ.size()<maxQ.size())
    		{
    			minQ.add(maxQ.poll());
    		}
    	}
    	else
    	{
    		if(minQ.size()>0)
    		{
	    		if((double)maxQ.peek()>(double)minQ.peek())
	    		{
	    			double min = (double)minQ.poll();
	    			double max = (double)maxQ.poll();
	    			maxQ.add(min);
	    			minQ.add(max);
	    		}
    		}
    	}
        
    }

    // Returns the median of current data stream
    public double findMedian() {
    	double val =0;
    	if(numElements%2!=0)
    	{
    		return (double)maxQ.peek();
    	}
    	else
    	{
    		val = ((double)maxQ.peek()+(double)minQ.peek())/2;
    	}
    		
        return val;
    }
    private class MaxHeapComparator implements Comparator<Double> {
		@Override
		public int compare(Double o1, Double o2) {
			if(o1<o2)
			{
				return 1;
			}
			if(o1>o2)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		}
	}

}