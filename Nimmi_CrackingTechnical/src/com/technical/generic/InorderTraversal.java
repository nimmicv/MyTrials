package com.technical.generic;

public class InorderTraversal {

	public static void inorderTraveral(Tree node)
	{
		if(node == null)
		{
			return;
		}
		inorderTraveral(node.left);
		System.out.print(node.value+" ");
		inorderTraveral(node.right);
	}
}
