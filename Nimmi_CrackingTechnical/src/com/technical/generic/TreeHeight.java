package com.technical.generic;

public class TreeHeight {
	
	public static int findHeight(Tree node)
	{
		if(node == null)
		{
			return 0;
		}
		int lheight = findHeight(node.left)+1;
		int rheight = findHeight(node.right)+1;
		return Math.max(lheight,rheight);
	}

}
