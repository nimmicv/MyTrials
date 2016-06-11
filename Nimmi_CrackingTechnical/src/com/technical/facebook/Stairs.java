package com.technical.facebook;

import java.util.ArrayList;

public class Stairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		ArrayList<ArrayList<Integer>> aList = getStairsCount(2,arr);
		for(ArrayList<Integer> list : aList)
		{
			System.out.println(list.toString());
		}

	}
	public static ArrayList<ArrayList<Integer>> getStairsCount(int height, int[] steps)
	{
		if(height ==0)
		{
			ArrayList<ArrayList<Integer>> glist = new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> list = new ArrayList<Integer>();
			glist.add(list);
			return glist;
		}
		ArrayList<ArrayList<Integer>> globlist =new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<steps.length;i++)
		{
			if(height>=steps[i])
			{
				ArrayList<ArrayList<Integer>> curlist = getStairsCount(height-steps[i],steps);
				for(ArrayList<Integer> list : curlist)
				{
					list.add(steps[i]);
				}
				globlist.addAll(curlist);
			}
		}
		return globlist;
	}

}
