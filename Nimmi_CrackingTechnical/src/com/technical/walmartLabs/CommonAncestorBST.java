package com.technical.walmartLabs;

import com.technical.generic.Tree;

public class CommonAncestorBST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Tree findCommonAncestor(Tree root, Tree p,Tree q)
	{
		if(root == null)
		{
			return null;
		}
		if(root ==p || root == q)
		{
			return root;
		}
		Tree left = findCommonAncestor(root.left,p,q);
		Tree right = findCommonAncestor(root.right,p,q);
		if(left!=null && right !=null)
		{
			return root;
		}
		if(left==null)
		{
			return right;
		}
		else
		{
			return left;
		}
	}
}
