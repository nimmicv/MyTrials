	package com.technical.generic;

import java.util.Stack;

public class MinimumValDiff {
	
	public static int minval1= Integer.MAX_VALUE;
	public static int minval2 = 0;
	public static int mindiff = Integer.MAX_VALUE;
	
	public static void minimumDiff(Tree node)
	{
		int val1 = 0;;
		int val2 = 0;
		Stack<Tree> stack = new Stack<Tree>();
		while(node!=null)
		{
			stack.add(node);
			node = node.left;
		}
		while(!stack.isEmpty())
		{
			Tree tree_node = stack.pop();
			System.out.print(tree_node.value+",");
			val1=val2;
			val2=tree_node.value;
			if(val2-val1 < mindiff)
			{
				minval1=val1;
				minval2=val2;
				mindiff = minval2-minval1;
			}
			if(tree_node.right!=null)
			{
				tree_node = tree_node.right;
				while(tree_node!=null)
				{
					stack.add(tree_node);
					tree_node = tree_node.left;
				}
			}
		}
		
		System.out.println("Minimum Diff = "+ mindiff);
		System.out.println("Values are = "+minval1+" - "+ minval2);
		
	}
	static Tree previous=null;
	public static void inorderMin(Tree node)
	{
		if(node==null)
		{
			return;
		}
		inorderMin(node.left);
		if(previous != null)
		{
			if(Math.abs(node.value - previous.value) < mindiff)
			{
				mindiff = Math.abs(node.value - previous.value);
				System.out.println("Mindiff = "+ mindiff);
			}
		}
		previous=node;
		inorderMin(node.right);
	}

}
