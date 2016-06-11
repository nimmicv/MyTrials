package com.samsung.DP;

import java.util.ArrayList;

public class Array_Permute {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lst = new ArrayList<Integer>();
		for(int i=1;i<=3;i++)
		{
			lst.add(i);
		}
		ArrayList<Integer> alist = new ArrayList<Integer>();
		permute_array(lst,alist);
	}
	
	public static void permute_array(ArrayList<Integer> list, ArrayList<Integer> final_list)
	{
		if(list.size()==0)
		{
			System.out.println(final_list.toString());
			return;
		}
		for(int i=0;i<list.size();i++)
		{
			ArrayList listnew = (ArrayList) list.clone();
			int x = (int) listnew.remove(i);
			ArrayList listnew_final = (ArrayList) final_list.clone();
			listnew_final.add(x);
			permute_array(listnew,listnew_final);
		}
	}

}
