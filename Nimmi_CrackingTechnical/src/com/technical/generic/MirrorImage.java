package com.technical.generic;

public class MirrorImage {
	
	public static boolean checkIfSameImage(Tree node1,Tree node2)
	{
		if(node1==null && node2==null)
		{
			return true;
		}
		if(node1==null || node2==null)
		{
			return false;
		}
		
		return(node1.value==node2.value && checkIfSameImage(node1.left,node2.left) && checkIfSameImage(node1.right,node2.right));
	}

}
