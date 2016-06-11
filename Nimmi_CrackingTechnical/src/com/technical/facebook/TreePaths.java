package com.technical.facebook;

import java.util.ArrayList;

import com.technical.generic.Tree;

public class TreePaths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {100,80,50,40,70,150,135,180,125,145};
		Tree root = null;
		for(int i=0;i<values.length;i++)
		{
			root = crateTree(root,values[i]);
		}
		ArrayList<ArrayList<Integer>> list = findTreePaths(root);
		for(ArrayList<Integer> ll: list)
		{
			System.out.println(ll.toString());
		}
		System.out.println(findVal(root,80));
	}
	
	public static Tree crateTree(Tree node,int val)
	{
		if(node == null)
		{
			Tree temp = new Tree(val);
			return temp;
		}
		if(val<node.value)
		{
			node.left = crateTree(node.left,val);
		}
		else
		{
			node.right = crateTree(node.right,val);
		}
		return node;
	}
	
	public static int findVal(Tree node,int value)
	{
		if(node == null)
		{
			return -1;
		}
		if(node.value == value)
		{
			return value;
		}
		if(findVal(node.left,value) !=-1)
		{
			return findVal(node.left,value);
		}
		if(findVal(node.right,value) !=-1)
		{
			return findVal(node.right,value);
		}
		return -1;
	}
	
	public static ArrayList<ArrayList<Integer>> findTreePaths(Tree root)
	{
		if(root.right == null && root.left == null)
		{
			ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> alist = new ArrayList<Integer>();
			alist.add(root.value);
			list.add(alist);
			return list;
		}
		ArrayList<ArrayList<Integer>> glist = new ArrayList<ArrayList<Integer>>();
		if(root.left != null)
		{
			ArrayList<ArrayList<Integer>> Llist = findTreePaths(root.left);
			glist.addAll(Llist);
		}
		if(root.right!=null)
		{
			ArrayList<ArrayList<Integer>> Rlist = findTreePaths(root.right);
			glist.addAll(Rlist);
		}
		for(ArrayList<Integer> list : glist)
		{
			list.add(root.value);
		}
		return glist;
		
		
	}

}
