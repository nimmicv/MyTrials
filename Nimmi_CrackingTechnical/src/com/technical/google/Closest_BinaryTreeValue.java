package com.technical.google;

import com.technical.generic.Tree;

public class Closest_BinaryTreeValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	double minvalue = Double.MAX_VALUE;
    int value;
    public int closestValue(Tree root, double target) {
        
       inorder_traverse(root,target);
       return value;
        
    }
    
    public void inorder_traverse(Tree root, double target)
    {
         if(root!=null)
        {
            inorder_traverse(root,target);
            if(Math.abs(root.value-target)<minvalue)
            {
                value = root.value;
                minvalue = Math.abs(root.value-target);
             }
            inorder_traverse(root.right,target);
        }
    }

}
