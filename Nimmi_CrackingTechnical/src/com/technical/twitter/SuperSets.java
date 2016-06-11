package com.technical.twitter;

import java.util.ArrayList;
import java.util.HashSet;

public class SuperSets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3};
		ArrayList<ArrayList<Integer>> alist = permuteUnique(array,2);
		for(ArrayList<Integer> list : alist)
		{
			System.out.println(list.toString());
		}
	}

	
	public static ArrayList<ArrayList<Integer>> permuteUnique(int[] num,int length) {
		//1, num = [1,2,1], 3

		    ArrayList<ArrayList<Integer>> glist = new ArrayList<ArrayList<Integer>>();
		    if(length == 0)
		    {
		        ArrayList<Integer> ilist = new ArrayList<Integer>();
		        ilist.add(num[0]);
		        glist.add(ilist);
		        return glist;
		    }
		       int x = num[length];
		       ArrayList<ArrayList<Integer>> list = permuteUnique(num,length-1); 
		       ArrayList<ArrayList<Integer>> gllist = new ArrayList<ArrayList<Integer>>();
		       for(ArrayList<Integer> llist : list)
		       {
		    	 
		         for(int i=0;i<=llist.size();i++)
		         {
		        	 ArrayList<Integer> curlist = new ArrayList<Integer>(llist);
		        	 curlist.add(i,x);
		        	 gllist.add(curlist);
		         }
		       }
		       return gllist;
		}
}
