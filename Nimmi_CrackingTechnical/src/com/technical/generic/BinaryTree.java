package com.technical.generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {100,45,120,30,50,105,130,20,25,110,106};
		Tree root = null;
		for(int i=0;i<values.length;i++)
		{
			root = InsertTree.insert(root,values[i]);
		}
		//int[] values2 = {100,44,36,120,30,50,105,130,20,110,106,104};
		 int[] values2 = {2};
		Tree root2 = null;
		for(int i=0;i<values2.length;i++)
		{
			root2 = InsertTree.insert(root2,values2[i]);
		}
		Queue queueA = new LinkedList();
		System.out.println("Root = "+root.value);
		System.out.println("Inorder Traversal = ");
		InorderTraversal.inorderTraveral(root);
		System.out.println("Inorder Traversal = ");
		InorderTraversal.inorderTraveral(root2);
//		System.out.println("Tree Height = "+TreeHeight.findHeight(root));
//		System.out.println("Tree Width = "+ TreeWidth.findwidth(root));
		ArrayList<Tree> list = new ArrayList<Tree>();
		//AllPathSum.findAllPathSum(root, list);
//		AllPathSum.findPathWithSpecificSum(root,list,195);
//		if(MirrorImage.checkIfSameImage(root, root2))
//		{
//			System.out.println("Trees are similar");
//		}
//		else
//		{
//			System.out.println("Trees are not similar");
//		}
//		System.out.println("Leaf Nodes = "+CountLeafNodes.countLeafNodes(root));
//		FindDeepestNode.findDeepest(root);
//		MinimumValDiff.inorderMin(root);
		//System.out.println("Maximum Difference = "+Maxm_diff_node_ancestor.findiff(root2));
		//VerticalOrderTraversal.max_min_width(root2);
//		Paths pt = new Paths();
//		pt.binaryTreePaths(root2);
//		Validate_BinaryTree vt =new Validate_BinaryTree();
//		if(vt.isValidBST(root2))
//		{
//			System.out.println("Is Valid");
//		}
		//largest_BSTSubtTree lt= new largest_BSTSubtTree();
//		LowestCommonAncestor lcs = new LowestCommonAncestor();
//		Tree node = lcs.lowestCommonAncestor(root2, 19, 30);
//		System.out.println("LCS = "+node.value);
		//lt.largestBSTSubtree(root2);
		//System.out.println("MinimumSum = "+vt.find_minimalSum(root2));
		VerticalOrderTraversal vt = new VerticalOrderTraversal();
		vt.verticalOrder(root2);
		
	}

}
