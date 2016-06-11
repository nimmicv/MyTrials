package com.technical.facebook;
import java.util.*;

public class SuperSets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> lists = findSuperSets(4);
		for(ArrayList list : lists)
		{
			System.out.println(list.toString());
		}
	}
	public static ArrayList<ArrayList<Integer>> findSuperSets(int x)
	{
		if(x==0)
		{
			ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
			ArrayList alist = new ArrayList<Integer>();
			list.add(alist);
			return list;
		}
		ArrayList<ArrayList<Integer>> templist = findSuperSets(x-1);
		ArrayList<ArrayList<Integer>> newlist = new ArrayList<ArrayList<Integer>>();
		for(ArrayList list : templist)
		{
			newlist.add(list);
			ArrayList addedlist = new ArrayList<Integer>();
			addedlist.addAll(list);
			addedlist.add(x);
			newlist.add(addedlist);
		}
		return newlist;
	}

}
