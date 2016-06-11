package com.technical.generic;

public class LowestCommonAncestor {
	 public Tree lowestCommonAncestor(Tree root, int p, int q) {
	        if(root==null)
	        {
	            return null;
	        }
	        if(root.value==p || root.value == q)
	        {
	            return root;
	        }
	        Tree left = lowestCommonAncestor(root.left,p,q);
	        Tree right = lowestCommonAncestor(root.right,p,q);
	        
	        if(left != null && right !=null)
	        {
	            return root;
	        }
	        else
	        return((left==null)?right:left);
	    }
}
