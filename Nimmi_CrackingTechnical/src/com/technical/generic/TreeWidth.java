package com.technical.generic;

public class TreeWidth {
	
	public static int findwidth(Tree node)
	{
		if(node == null)
		{
			return 0;
		}
		int lheight = TreeHeight.findHeight(node.left);
		int rheight = TreeHeight.findHeight(node.right);
		int lwidth =findwidth(node.left);
		int rwidth = findwidth(node.right);
		return Math.max(lheight+rheight+1, Math.max(lwidth, rwidth));
	}

}
