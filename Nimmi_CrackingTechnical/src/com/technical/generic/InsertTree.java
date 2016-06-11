package com.technical.generic;

public class InsertTree {
	
	public static Tree insert(Tree node, int value)
	{
		if(node == null)
		{
			Tree tree =new Tree(value);
			return tree;
		}
		if(value<node.value)
		{
			node.left = insert(node.left,value);
		}
		else
		{
			node.right = insert(node.right,value);
		}
		return node;
	}

}
