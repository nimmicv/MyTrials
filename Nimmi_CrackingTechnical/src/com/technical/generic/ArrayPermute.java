package com.technical.generic;
import java.util.*;
public class ArrayPermute {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> alist = new ArrayList<Integer>();
		for(int i=0;i<3;i++)
		{
			alist.add(i);
		}
		ArrayList<ArrayList<Integer>> flist = new ArrayList<ArrayList<Integer>>();
		permute(list,alist,flist);
		for(ArrayList<Integer> ls : flist)
		{
			System.out.println(ls.toString());
		}
	}
	
	public static void permute(ArrayList<Integer> list,ArrayList<Integer> alist,ArrayList<ArrayList<Integer>> final_list )
	{
		if(alist.isEmpty())
		{
			final_list.add(list);
		}
		for(int i=0;i<alist.size();i++)
		{
			ArrayList<Integer> clone_lsit = (ArrayList<Integer>) list.clone();
			ArrayList<Integer> clone_curlsit = (ArrayList<Integer>) alist.clone();
			clone_lsit.add(alist.get(i));
			clone_curlsit.remove(i);
			permute(clone_lsit,clone_curlsit,final_list);
			
		}
	}

}
