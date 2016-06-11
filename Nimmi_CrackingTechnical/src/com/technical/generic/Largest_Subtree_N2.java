package com.technical.generic;

public class Largest_Subtree_N2 {
	
	 public int largestBSTSubtree(Tree root) {
	        if(isBST(root,Integer.MAX_VALUE,Integer.MIN_VALUE))
	        {
	            return findNumNodes(root);
	        }
	        else
	        {
	            return Math.max(largestBSTSubtree(root.left),largestBSTSubtree(root.right));
	        }
	        
	    }
	    
	    public boolean isBST(Tree node,int max, int min)
	    {
	        if(node==null)
	        {
	            return true;
	        }
	        if(node.value<min || node.value>max)
	        {
	            return false;
	        }
	        return(isBST(node.left,node.value,min) && isBST(node.right,max,node.value));
	    }
	    
	    public int findNumNodes(Tree node)
		{
			if(node == null)
			{
				return 0;
			}
			return(findNumNodes(node.left)+findNumNodes(node.right)+1);
			//return 0;
		}

}
