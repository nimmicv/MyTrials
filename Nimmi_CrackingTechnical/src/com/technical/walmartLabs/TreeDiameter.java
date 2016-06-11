package com.technical.walmartLabs;

import com.technical.generic.Tree;

public class TreeDiameter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int TreeDiameter(Tree node)
	{
		if(node == null)
		{
			return 0;
		}
		int lheight = TreeHeight(node.left);
		int rheight = TreeHeight(node.right);
		return Math.max(lheight+rheight+1,Math.max(TreeDiameter(node.left),TreeDiameter(node.right))); 
		
	}
	public int TreeHeight(Tree node)
	{
		if(node == null)
		{
			return 0;
		}
		return(1+Math.max(TreeHeight(node.left),TreeHeight(node.right)));
	}

}
