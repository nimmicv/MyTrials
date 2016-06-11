package com.careercupYahoo.Tree;

import com.careercupYahoo.com.Tree;

public class MirrorImage {
	public static Tree root;
	public static Tree root2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		root = null;
		root2 = null;
		int[] values = {50,40,70,30,45};
		for(int i=0;i<values.length;i++)
		{
			root = insertTree(root,values[i]);
		}
		int[] values2 = {55,40,70,30,45};
		for(int i=0;i<values.length;i++)
		{
			root2 = insertTree(root2,values[i]);
		}
		traverseInorder(root);
		if(checkIfSimilar(root,root2))
		{
			System.out.println("Trees are similar");
		}
		
	}
	
	public static void traverseInorder(Tree node)
	{
		if(node == null)
		{
			return;
		}
		traverseInorder(node.left);
		System.out.print(node.value + "\t");
		traverseInorder(node.right);
		
		
	}
	
	public static boolean checkIfSimilar(Tree node1, Tree node2)
	{
		if(node1==null && node2 == null)
		{
			return true;
		}
		if(node1== null || node2==null)
		{
			return false;
		}
		return(node1.value == node2.value && checkIfSimilar(node1.left,node2.left) && checkIfSimilar(node1.right, node2.right));
	}
	
	public static Tree insertTree(Tree node, int value)
	{
		if(node == null)
		{
			Tree tree = new Tree(value);
			return tree;
		}
		if(value >node.value)
		{
			node.right = insertTree(node.right,value);
		}
		else
		{
			node.left = insertTree(node.left,value);
		}
		return node;
	}

}
