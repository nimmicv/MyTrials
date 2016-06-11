package com.technical.generic;

public class CountLeafNodes {
	
	public static int countLeafNodes(Tree node)
	{
		if(node == null)
		{
			return 0;
		}
		if(node.right == null && node.left == null)
		{
			return 1;
		}
		return(countLeafNodes(node.left)+countLeafNodes(node.right));
	}

}
