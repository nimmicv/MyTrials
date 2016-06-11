package com.crack.hortons;

import java.util.ArrayList;

public class TreePathSum {
	
	static TreeNode root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {50,4,7,36,10,132,350,400};
		TreePathSum tps = new TreePathSum();
		//root = tps.createTree(a, 0, a.length-1);
		root = tps.insert(a);
		tps.InOrderTraverse(root);
		tps.sumPath(root, new ArrayList<Integer>(), 31);
	}
	
	public  void InOrderTraverse(TreeNode node)
	{
		if(node == null)
		{
			return;
		}
		InOrderTraverse(node.left);
		System.out.println(node.value);
		InOrderTraverse(node.right);
		
	}
	
	public TreeNode insert(int[] arr)
	{
		TreePathSum tps = new TreePathSum();
		TreeNode root1 = null;
		for(int i=0;i<arr.length;i++)
		{
			root1 = tps.createTreeRecursive(new TreeNode(arr[i]), root1);
		}
		return root1;
	}
	
	public TreeNode createTree(int[]arr, int low, int high)
	{
		if(high>=low)	
		{
			int mid = (low+high)/2;
			TreeNode node = new TreeNode(arr[mid]);
			node.left = createTree (arr,low,mid-1);
			node.right = createTree (arr,mid+1,high);
			return node;
		}
		else
		{
			return null;
		}
	}
	
	public TreeNode createTreeRecursive(TreeNode node,TreeNode rootNode)
	{
		if(rootNode == null)
		{
			rootNode = node;
			return rootNode;
		}
		else if(node.value<rootNode.value)
		{
			rootNode.left = createTreeRecursive(node,rootNode.left);
		}
		else if(node.value>rootNode.value)
		{
			rootNode.right = createTreeRecursive(node,rootNode.right);
		}
		
		return rootNode;
	}
	
	public void sumPath(TreeNode root, ArrayList<Integer>aList, int sum)
	{
		
		
		int localSum =0;
		if(aList.size()>0)
		{
			for(int i=aList.size()-1;i>=0;i--)
			{
				localSum = localSum + aList.get(i);
				
			}
			//System.out.println(localSum);
			if(localSum == sum)
			System.out.println("Sum = "+localSum);
		}
		if(root == null)
		{
			return;
		}
		aList.add(root.value);
		sumPath(root.left,(ArrayList<Integer>) aList.clone(),sum);
		sumPath(root.right,(ArrayList<Integer>) aList.clone(),sum);
		
	}

}
