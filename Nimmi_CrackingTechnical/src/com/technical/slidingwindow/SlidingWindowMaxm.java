package com.technical.slidingwindow;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.DelayQueue;

public class SlidingWindowMaxm {
	public static void main(String[] args)
	{
		int[] values = {7,3,-1,-3,5,3,6,7};
		int[] array = slidingMaxm(values,3);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" - ");
		}
	}
	public static int[] slidingMaxm(int[] values,int n)
	{
		
		Deque<Integer> dequeB = new ArrayDeque();
		int[] maxvalues = new int[values.length-n+1];
		for(int i=0;i<n;i++)
		{
			if(dequeB.isEmpty())
			{
				dequeB.addLast(i);
			}
			else
			{
				while(!dequeB.isEmpty() && values[(int) dequeB.peekFirst()]<values[i])
				{
					dequeB.poll();
				}
				dequeB.addLast(i);
			}
		}
		maxvalues[0]=values[dequeB.peekFirst()];
		for(int i=n;i<values.length;i++)
		{
			maxvalues[i-n]=values[dequeB.peekFirst()];
			
			while(!dequeB.isEmpty() && dequeB.peekFirst()<=(i-n))
			{
				dequeB.poll();
			}
			while(!dequeB.isEmpty() && values[(int) dequeB.peekFirst()]<=values[i])
			{
				dequeB.poll();
			}
			dequeB.addLast(i);
			
		}
		maxvalues[values.length-n]=values[dequeB.peekFirst()];
		return maxvalues;
		
	}

}
