package com.technical.generic;

import java.util.ArrayList;

public class FindDeepestNode {
	
	static int maxdeepsize=0;
	static Tree maxDeepNode = null;
	
	public static void findDeepest(Tree node)
	{
		ArrayList<Tree> list = new ArrayList<Tree>();
		findDeeper(node,0);
		System.out.println("Max Deep Node = "+maxDeepNode.value );
	}
	
	private static void findDeeper(Tree node,int level)
	{
		if(node == null)
		{
			return;
		}
		if(node.right == null && node.left == null)
		{
			if(level>maxdeepsize)
			{
				maxdeepsize = level;
				maxDeepNode = node;
			}
		}
		//level=level+1;
		findDeeper(node.left,level++);
		findDeeper(node.right, level++);
	}
	

}
