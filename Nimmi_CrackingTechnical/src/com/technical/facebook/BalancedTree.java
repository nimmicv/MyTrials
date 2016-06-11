package com.technical.facebook;

import com.technical.generic.Tree;

public class BalancedTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {100,90,80,95};
		Tree root = null;
		for(int i : values)
		{
			root = createTree(root,i);
		}
		if(balancedTree(root))
		{
			System.out.println("Tree is balanced");
		}
		else
		{
			System.out.println("Tree is not balanced");
		}
	}
	
	public static Tree createTree(Tree root,int val)
	{
		if(root == null)
		{
			Tree node = new Tree(val);
			return node;
		}
		if(val>root.value)
		{
			root.right = createTree(root.right,val);
		}
			if(val<root.value)
			{
				root.left = createTree(root.left,val);
			}
		return root;
	}
	
	public static  int findMaxHeight(Tree node)
	{
		if(node == null)
		{
			return 0;
		}
		int lheight = findMinHeight(node.left)+1;
		int rheight = findMinHeight(node.right)+1;
		return Math.max(lheight, rheight);
	}
	
	public static int findMinHeight(Tree node)
	{
		if(node == null)
		{
			return 0;
		}
		int lheight = findMinHeight(node.left)+1;
		int rheight = findMinHeight(node.right)+1;
		return Math.min(lheight, rheight);
	}
	public static boolean balancedTree(Tree node)
	{
		int minheight = findMinHeight(node);
		int maxheight = findMaxHeight(node);
		boolean val = maxheight-minheight >1?false:true;
		return val;
	}

}
