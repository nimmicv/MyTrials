package com.technical.google.dp;

import java.util.HashMap;

public class LongestZigZag {

	/**
	 * @param args
	 */
	static HashMap<Integer,Node> count = new HashMap<Integer,Node>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {4,6,7,3,9,5,7,0,-1,10,-2};
		long previous = System.currentTimeMillis();
		Node count = LIS(array,array.length-1);
		long current = System.currentTimeMillis() - previous;
		System.out.println("Time = "+current);
		System.out.println("Max = " + Math.max(count.decrease,count.increase));
		LIS_bottom_up(array,array.length-1);
		
		
	}
	static class Node
	{
		int decrease = Integer.MIN_VALUE;
		int increase= Integer.MIN_VALUE;
		public Node(int dec,int inc)
		{
			this.decrease=1;
			this.increase=1;
		}
	}
	
	//Top_Down with memoization
	public static Node LIS(int[] array,int length)
	{
		if(length==0)
		{
			return new Node(1,1);
		}
		if(count.containsKey(length))
		{
			return count.get(length);
		}
		Node node=null;
		for(int i=0;i<length;i++)
		{
			node = LIS(array,i);
			if(array[i]<=array[length])
				node.increase = Math.max(node.increase,node.decrease+1);
			else
				node.decrease = Math.max(node.decrease,node.increase+1);
		}
		
        count.put(length,node);
		return node;
	}
	
	//Bottom_Up
	
	public static void LIS_bottom_up(int[] array,int length)
	{
		int[] array2 = {4,6,7,3,9,5,7,0,-1,10,-2};
		int max = Integer.MIN_VALUE;
		int[][] tmparray_increase = new int[length+1][2];
		int[][] tmparray_decrease = new int[length+1][2];
		boolean increase = false;
		boolean decrease = false;
		int max_index = -1;
		for(int i=0;i<=length;i++)
		{
			tmparray_increase[i][0]=1;
			tmparray_decrease[i][0]=1;
			tmparray_increase[i][1]=i;
			tmparray_decrease[i][1]=i;
			for(int j=0;j<=i;j++)
			{
				if(array[j]<array[i])
				{
					if(tmparray_decrease[j][0]+1>tmparray_increase[i][0])
					{
						tmparray_increase[i][1] = j;
					}
					tmparray_increase[i][0]=Math.max(tmparray_increase[i][0], tmparray_decrease[j][0]+1);
					
				}
				if(array[j]>array[i])
				{
					if(tmparray_increase[j][0]+1>tmparray_decrease[i][0])
					{
						tmparray_decrease[i][1] = j;
					}
					tmparray_decrease[i][0]=Math.max(tmparray_decrease[i][0], tmparray_increase[j][0]+1);
					
				}
			}
			if(tmparray_increase[i][0]>max || tmparray_decrease[i][0]>max)
			{
				max =Math.max(tmparray_increase[i][0],tmparray_decrease[i][0]);
				if(tmparray_increase[i][0]>tmparray_decrease[i][0])
				{
					increase = true;
					decrease = false;
				}
				else
				{
					increase = false;
					decrease = true;
				}
				max_index =i;
				
			}
			//max = Math.max(max, Math.max(tmparray_increase[i],tmparray_decrease[i]));
		}
		int curindex = max_index;
		
		if(increase)
		{
			while(true)
			{
				System.out.println(array[curindex]);
				int nextindex = tmparray_increase[curindex][1];
				if(nextindex == curindex)
					break;
				System.out.println(array[nextindex]);
				curindex = tmparray_decrease[nextindex][1];
				if(nextindex == curindex)
					break;
			}
		}
		else
		{
			while(true)
			{
				System.out.println(array[curindex]);
				int nextindex = tmparray_decrease[curindex][1];
				if(nextindex == curindex)
					break;
				System.out.println(array[nextindex]);
				curindex = tmparray_increase[nextindex][1];
				if(nextindex == curindex)
					break;
			}
		}
		for(int i=0;i<=length;i++)
		{
			System.out.print(tmparray_increase[i][0]+"\t");
		}
		System.out.println();
		for(int i=0;i<=length;i++)
		{
			System.out.print(tmparray_decrease[i][0]+"\t");
		}
		System.out.println("Max = "+max);
	}
}
