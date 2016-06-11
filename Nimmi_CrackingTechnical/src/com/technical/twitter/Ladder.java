package com.technical.twitter;

import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class Ladder {

	/**
	 * @param args
	 */
//	static Map<Integer,Integer> stepmap = new HashMap<Integer,Integer>();
//	static Map<Integer,ArrayList<ArrayList<Integer>>> listmap = new HashMap<Integer,ArrayList<ArrayList<Integer>>>();
//	static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> glist = countSteps(5);
		for(ArrayList lst :glist)
		{
			System.out.println(lst.toString());
		}
		System.out.println("Count = " + count);
		
	}
	
	public static ArrayList<ArrayList<Integer>> countSteps(int steps) 
	{
		int sum=0;
		ArrayList<ArrayList<Integer>> glist = new ArrayList<ArrayList<Integer>>();
		if(steps==0)
		{
			//System.out.println("List = "+lst);
			count++;
			ArrayList list_array = new ArrayList();
			glist.add(list_array);
			return glist;
			//Collections.sort(lst);
			
			//return 1;
		}
		
		if(steps>0)
		{

			ArrayList<ArrayList<Integer>> list = countSteps(steps-1);
			for(ArrayList alist:list)
			{
				alist.add(1);
				glist.add(alist);
			}
			

		}
		if(steps>1)
		{
			ArrayList<ArrayList<Integer>> list = countSteps(steps-2);
			for(ArrayList alist:list)
			{
				alist.add(2);
				glist.add(alist);
			}
		}
		if(steps>2)
		{
			ArrayList<ArrayList<Integer>> list = countSteps(steps-3);
			for(ArrayList alist:list)
			{
				alist.add(3);
				glist.add(alist);
			}
		}
		return glist;
			//return(countSteps(steps-1)+countSteps(steps-2)+countSteps(steps-3));
	}

}
