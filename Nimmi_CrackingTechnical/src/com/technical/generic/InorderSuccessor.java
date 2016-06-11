package com.technical.generic;

public class InorderSuccessor {

	/**
	 * @param args
	 */
//	If Parent Pointer Given
//	1) If right subtree of node is not NULL, then succ lies in right subtree. Do following.
//	Go to right subtree and return the node with minimum key value in right subtree.
//	2) If right sbtree of node is NULL, then succ is one of the ancestors. Do following.
//	Travel up using the parent pointer until you see a node which is left child of it’s parent. The parent of such a node is the succ.
	
//	 Node p = n.parent;
//     while (p != null && n == p.right) {
//         n = p;
//         p = p.parent;
//     }
//     return p;
	
	public Tree inorderSuccessor(Tree root,Tree node)
	{
		
		if(node.right!=null)
		{
			Tree succ = node.right;
			while(succ.left!=null)
			{
				succ = succ.left;
			}
			return succ;
		}
		else
		{
			Tree succ=null;
			while(root!=null)
			{
				if(root.value>node.value)
				{
					succ = root;
					root=root.left;
				}
				if(root.value<=node.value)
				{
					root=root.right;
				}
			}
			return succ;
			
		}
	}

}
