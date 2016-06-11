package com.technical.generic;

public class Validate_BinaryTree {
	Tree previous=null;
	int minvalue=Integer.MAX_VALUE;
	
	public boolean validate_Tree(Tree node)
	{
		if(node == null)
		{
			return true;
		}
		else
		{
			if(!validate_Tree(node.left))
			{
				return false;
			}
			if(previous!=null && previous.value>node.value)
			{
				return false;
			}
			previous = node;
			return(validate_Tree(node.right));
		}
		
	}
	
	
	
	public int find_minimalSum(Tree node)
	{
		previous=null;
		minimal_sum(node);
		
		return minvalue;
	}
	
	public void minimal_sum(Tree node)
	{
		if(node == null)
		{
			return;
		}
		else
		{
			minimal_sum(node.left);
			if(previous!=null && ((node.value-previous.value)<minvalue))
			{
				minvalue = node.value-previous.value;
			}
			previous = node;
			minimal_sum(node.right);
		}
		
	}
	public boolean isValidBST(Tree root) {
	    return isValidBST(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);    
	}
	 
	public boolean isValidBST(Tree p, double min, double max){
	    if(p==null) 
	        return true;
	 
 	    if(p.value < min || p.value > max)
	        return false;
	    //Whenever you move left, value should not be greater than parent, update max
 	    
 	    // left [-INF<Value<Root]
 	    // Right [ +INF>Value>Root]
 	    //left-right[curval<value<Root]
 	    //left-right-left[]
 	    //Whenever you move right, value should not be lesser than parent, update min
 	    //left & right [update max and min]
	    return isValidBST(p.left, min, p.value) && isValidBST(p.right, p.value, max);
	}

}
