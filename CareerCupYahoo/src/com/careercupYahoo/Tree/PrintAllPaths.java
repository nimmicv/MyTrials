package com.careercupYahoo.Tree;

import java.util.ArrayList;

import com.careercupYahoo.com.Tree;

public class PrintAllPaths {
	
public static Tree root;
public static int max=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {50,40,70,30,45,60,80,100,120};
		for(int i=0;i<values.length;i++)
		{
			root = insertTree(root,values[i]);
		}
		//ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> list = new ArrayList<Integer>();
//		
//		printPaths("",root,list);
//		
//		for(String S:list)
//		{
//			System.out.println(S);
//		}
//		System.out.println("LeafNodes = "+ countLeafNodes(root));
//		
		System.out.println("TreeHeight = " + treeSum(root,0));
//		findLeafNodesSum(root,0);
//		System.out.println(" Max is " + max);
		//pathSum(root,120,list);
		findDeepestNode(root, 0);
		System.out.println(maxNode.value+ " ->" + maxlevel);
	}
	
	public static int maxlevel = 0;
	public static Tree maxNode = null;
	public static void findDeepestNode(Tree node, int level)
	{
		if(node == null)
		{
			return;
		}
		if(node.left == null && node.right == null)
		{
			if(level > maxlevel)
			{
				maxlevel = level;
				maxNode = node;
			}
		}
		level++;
		findDeepestNode(node.left,level);
		findDeepestNode(node.right,level);
	}
	
	public static int treeSum(Tree node, int sum)
	{
		if(node == null)
		{
			return 0;
		}
		else
		{
			
			int lvalue = treeSum(node.right,sum);
			int rvalue = treeSum(node.left,sum);
			int curValue = node.value;
			
			int totValue = curValue +lvalue+rvalue;
			return totValue;
		}
	}
	
	public static void pathSum(Tree node , int sum, ArrayList<Integer> list)
	{
		
		if(node == null)
		{
			return;
		}
		
		else
		{
				
			   list.add(node.value);
			   int temp =0;
				for(int i= list.size()-1;i>=0;i--)
				{
					temp = temp+list.get(i);
					
					if(temp == sum)
					{
						System.out.println();
						for(int j=list.size()-1;j>=i;j--)
						{
							System.out.print(list.get(j)+"\t");
						}
					 }
				}
				ArrayList<Integer> list2 = (ArrayList<Integer>) list.clone();
				pathSum(node.right,sum,list2);
			
				ArrayList<Integer> list3 = (ArrayList<Integer>) list.clone();
				pathSum(node.left,sum,list3);
		}
		
		
	}
	
	public static int TreeHeight(Tree node)
	{
		if(node == null)
		{
			return -1;
		}
		int lheight = TreeHeight(node.left);
		int rheight = TreeHeight(node.right);
		int height = 1 + Math.max(lheight,rheight);
		return height;
	}
	
	private static int countLeafNodes(Tree node)
	{
		if(node == null)
		{
			return 0;
		}
		if(node.right == null && node.left == null)
		{
			return 1;
		}
		return (countLeafNodes(node.left) +countLeafNodes(node.right));
		
	}
	
	private static void printPaths(String s,Tree node, ArrayList<String> List)
	{
		if(node == null)
		{
			return;
		}
		if(node.right == null && node.left == null)
		{
			List.add(s+"->"+node.value);
			return;
		}
		printPaths(s+"->"+node.value,node.right,List);
		printPaths(s+"->"+node.value,node.left, List);
	}
	
	private static int findLeafNodesSum(Tree node,int curSum)
	{
		if(node == null)
		{
			return 0;
		}
		curSum = curSum +node.value;
		int lsum = curSum;
		if(node.left != null)
			lsum= findLeafNodesSum(node.left,curSum);
		
		int rsum = curSum;
		if(node.right != null)
			rsum=findLeafNodesSum(node.right,curSum);
		
		int maxsum = Math.max(lsum, rsum);
		if(node.right != null && node.left!=null)
			max= Math.max(max, (lsum+rsum-curSum));
		System.out.println("MaxSum = " + (maxsum) + "Current Max "+max + " lsum " +lsum + " rsum "+ rsum + "curSum " + curSum);
		return maxsum;
		
	}

	private static Tree insertTree(Tree node, int value) {
		// TODO Auto-generated method stub
		if(node == null)
		{
			Tree tree = new Tree(value);
			return tree;
		}
		if(value >node.value)
		{
			node.right = insertTree(node.right,value);
		}
		else
		{
			node.left = insertTree(node.left,value);
		}
		return node;
	}

}
