package com.technical.generic;

import java.util.ArrayList;

public class AllPathSum {
	Tree root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {100,45,120,30,50,105,130,20,25,110,106};
		Tree root = null;
		AllPathSum aps = new AllPathSum();
		for(int i=0;i<values.length;i++)
		{
			root = aps.insertNode(root, values[i]);
		}
		ArrayList<Tree> lst = new ArrayList<Tree>();
		aps.findAllPathSum(root, lst, 0);
		System.out.println(root.value);
	}
	public Tree insertNode(Tree root,int value)
	{
		
		if(root == null)
		{
			Tree node = new Tree(value);
			return node;
		}
		if(value<root.value)
		{
			root.left = insertNode(root.left,value);
		}
		else
		{
			root.right = insertNode(root.right,value);
		}
		return root;
	}
	public static void findAllPathSum(Tree node, ArrayList<Tree> list,int gsum)
	{
		if(node == null)
		{	
			return;
		}
		list.add(node);
		gsum +=node.value;
		if(node.right == null && node.left == null)
		{
			System.out.println("Gsum = "+gsum);
//			int sum=0;
//			for(int i=0;i<list.size();i++)
//			{
//				sum = sum + list.get(i).value;
//			}
//			System.out.println("Path Sum = "+ sum);
		}
		
		ArrayList<Tree> llist = (ArrayList<Tree>) list.clone();
		ArrayList<Tree> rlist = (ArrayList<Tree>) list.clone();
		findAllPathSum(node.left,llist,gsum);
		findAllPathSum(node.right,rlist,gsum);
	}
	
	public static void findPathWithSpecificSum(Tree node, ArrayList<Tree> list, int Sumvalue)
	{
		if(node == null)
		{	
			return;
		}
		list.add(node);
		int sum=0;
		for(int i=list.size()-1;i>=0;i--)
		{
				sum = sum + list.get(i).value;
				if(sum == Sumvalue)
				{
					System.out.println();
					for(int j=i;j<list.size();j++)
					{
						System.out.print(list.get(j).value+" ->");
					}
				}
		}
		//System.out.println("Path Sum = "+ sum);
		
		ArrayList<Tree> llist = (ArrayList<Tree>) list.clone();
		ArrayList<Tree> rlist = (ArrayList<Tree>) list.clone();
		findPathWithSpecificSum(node.left,llist,Sumvalue);
		findPathWithSpecificSum(node.right,rlist,Sumvalue);
		
	}

}
