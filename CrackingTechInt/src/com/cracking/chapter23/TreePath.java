package com.cracking.chapter23;

import java.util.ArrayList;

public class TreePath {
	
	public static Tree root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreePath tp = new TreePath();
		root = tp.createTree();
		ArrayList<Integer> list = new ArrayList<Integer>();
		tp.findSum(root, list, 50);
		
	}
	
	public void findSum(Tree tree, ArrayList<Integer> list, int sum)
	{
		if(tree == null)
		{
			return;
		}
		list.add(tree.value);
		int temp=0;
		for(int val : list)
		{
			temp = temp+val;
		}
		if(temp == sum)
		{
			for(int val : list)
			{
				System.out.println(val);
			}
		}
		ArrayList list2 = (ArrayList) list.clone();
		ArrayList list3 = (ArrayList) list.clone();
		findSum(tree.left,list2,sum);
		findSum(tree.right,list3,sum);
	}
	
	
	
	public Tree createTree()
	{
			Tree tr = new Tree (20,null,null);
			Tree tr2 = new Tree (25,null,null);
			Tree tr3 = new Tree (30,null,null);
			Tree tr4 = new Tree (40,null,null);
			Tree tr5 = new Tree (5,null,null);
			Tree tr6 = new Tree (55,null,null);
			Tree tr7 = new Tree (57,null,null);
			tr.left = tr2;
			tr.right = tr3;
			tr2.left = tr4;
			tr2.right = tr5;
			tr3.left = tr6;
			tr3.right = tr7;
			
		
		return tr;
	}
	

}
