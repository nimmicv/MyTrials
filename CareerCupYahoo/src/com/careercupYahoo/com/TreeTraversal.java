package com.careercupYahoo.com;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;





public class TreeTraversal {
	


	public static Tree root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		root = null;
		//int[] values = {50, 35, 20,40,100,90,80,70,65,95,120};
		//int[] values = {10,8,15,7,-10};
		//int[] values = {50,40,70,30,45};
		int[] values= {30,15,50,5,40,60};
		for(int i=0;i<values.length;i++)
		{
			insertTree(root,values[i]);
		}
		
		//System.out.println(countLeafNodes(root));
		ArrayList list = new ArrayList();
		preOrder(root, list);
		
		System.out.println();
		//preorderTraverse(root);
		String[] array = new String[list.size()];
//		for(int i=0;i<list.size();i++)
//		{
//			array[i]= (String) list.get(i);
//			//System.out.print(list.get(i) + "\t");
//		}
		
//		Tree trr = createTree(array);
//		System.out.println();
		
//		Tree tmp1= new Tree(6);
//		Tree temp2 = root.left;
//		root.left = tmp1;
//		tmp1.left = temp2;
//		System.out.println(inorder(root));
//		preorderTraverse(trr);
//		parent = null;
//		System.out.println(inorder(trr));
 		//inorderTraverse(root);
 		//levelOrderTraversal(root);
// 		int height = TreeHeight(root);
// 		System.out.println("Height of Tree = " + height);
		ArrayList<Integer> list2 = levelOrderRec(root,2,new ArrayList());
		for(Integer i : list2)
		{
			System.out.println(i);
		}
		//levelOrderRec(root,1);
// 		for(int i=0;i<height;i++)
// 		{
// 			levelOrderRec(root,i);
// 		}
 		//System.out.println(TreeDiameter(root));
 		
		//Tree curRoot= createTree();
		//findAllPAthsWithSum(root,new ArrayList(),15);
// 		
	}
	
	public static Tree findCommonAncestor(Tree tree, Tree p, Tree q)
	{
		if(contains(tree.left,p) && contains(tree.left,q))
		{
			return findCommonAncestor(tree.left,p,q);
		}
		if(contains(tree.right,p) && contains(tree.right,q))
		{
			return findCommonAncestor(tree.right,p,q);
		}
		return tree;
	}
	
	public static boolean contains(Tree root, Tree p)
	{
		if(root == null)
			return false;
		if(root == p)
			return true;
		return contains(root.left,p)||contains(root.right,p);
	}
	
	public static void insertTree(Tree node,int value)
	{
		if(root == null)
		{
			root = new Tree(value);
			return;
		}
		else
		{
			 if(value>node.value)
			 {
				 if(node.right == null)
				 {
					 node.right = new Tree(value);
					 return;
				 }
				 else
				 {
					 insertTree(node.right,value);
				 }
			 }
			 else
			 {
				 if(node.left == null)
				 {
					 node.left = new Tree(value);
					 return;
				 }
				 else
				 {
					 insertTree(node.left,value);
				 } 
			 }
		}
	}
	
	
	public static void inorderTraverse(Tree node)
	{
		if(node == null)
		{
			return;
		}
		inorderTraverse(node.left);
		System.out.print(node.value+"\t");
		inorderTraverse(node.right);
	}
	
	public static void preorderTraverse(Tree node)
	{
		if(node == null)
		{
			return;
		}
		
		System.out.print(node.value+"\t");
		preorderTraverse(node.left);
		preorderTraverse(node.right);
	}
	
	
	
	public static void levelOrderTraversal(Tree node)
	{
		class Node
		{
			Tree node;
			int level;
			public Node(Tree tree, int lev)
			{
				node = tree;
				level = lev;
			}
		}
		
		Queue<Node> q = new ArrayDeque<Node>();
		q.add(new Node(root,0));
		while(!q.isEmpty())
		{
			System.out.println();
			int curlevel = q.peek().level;
			while(!q.isEmpty() && q.peek().level == curlevel)
			{
				Node curNode = q.poll();
				System.out.print(curNode.node.value+"\t");
				if(curNode.node.left != null)
				{
					q.add(new Node(curNode.node.left,curlevel+1));
				}
				if(curNode.node.right != null)
				{
					q.add(new Node(curNode.node.right,curlevel+1));
				}
			}
			
		}
	}
	
	
	public static ArrayList<Integer> levelOrderRec(Tree tree , int level, ArrayList list)
	{
		if(tree== null)
		{
			return null;
		}
		if(level ==0)
		{
			list.add(tree.value);
			//return list;
//			System.out.println(tree.value);
//			return;
		}
		else
		{
			levelOrderRec(tree.left,level-1,list);
			levelOrderRec(tree.right,level-1,list);
		}
		return list;
		
	}
	
	public static int TreeHeight(Tree tree)
	{
		if(tree == null)
		{
			return -1;
		}
		
		return 1+Math.max(TreeHeight(tree.left), TreeHeight(tree.right));

	}
	
	public static int countLeafNodes(Tree tree)
	{
		if(tree == null)
		{
			return 0;
		}
		if(tree.right == null && tree.left == null)
		{
			return 1;
		}
		return(countLeafNodes(tree.left) + countLeafNodes(tree.right));
	}
	
	
	public static int TreeDiameter(Tree tree)
	{
		if(tree == null)
		{
			return 0;
		}
		int lheight = TreeHeight(tree.left);
		int rheight = TreeHeight(tree.right);
		
		int ldiameter = TreeDiameter(tree.left);
		int rdiameter = TreeDiameter(tree.right);
		
		return(Math.max(lheight+rheight+1, Math.max(ldiameter,rdiameter)));
		//return 0;
		
	}
	
	public static Tree createTree()
	{
			Tree tr = new Tree (50);
			Tree tr2 = new Tree (40);
			Tree tr3 = new Tree (30);
			Tree tr4 = new Tree (-10);
			Tree tr5 = new Tree (-20);
			Tree tr6 = new Tree (-5);
			Tree tr7 = new Tree (10);
			Tree tr8 = new Tree (5);
			tr.left = tr2;
			tr.right = tr3;
			tr2.left = tr4;
			tr2.right = tr5;
			tr3.left = tr6;
			tr3.right = tr7;
			tr4.left = tr8;
			
		
		return tr;
	}
	
	public static void findAllPAthsWithSum(Tree tree,ArrayList<Integer> list, int sum)
	{
		if(tree == null)
		{
			return;
		}
		list.add(tree.value);
		int temp=0;
//		for(int val : list)
//		{
//			temp = temp+val;
//			if(temp == sum)
//			{
//				for(int val2 : list)
//				{
//					System.out.println(val2);
//				}
//			}
//		}
		
		for(int i= list.size()-1;i>=0;i--)
		{
			temp = temp+list.get(i);
			System.out.println();
			if(temp == sum)
			{
				for(int j=list.size()-1;j>=i;j--)
				{
					System.out.print(list.get(j)+"\t");
				}
			}
		}
		
		ArrayList list1 = (ArrayList) list.clone();
		ArrayList list2 = (ArrayList) list.clone();
		findAllPAthsWithSum(tree.left,list1,sum);
		findAllPAthsWithSum(tree.right,list2,sum);
	}
	public static Tree parent = null;
	
	//Check if Binary Tree is a BST
	public static boolean inorder(Tree node) {
		if (node == null) {
			return true;
		} else {
			if(!inorder(node.left))
				return false;
			if(parent == null || node.value>parent.value)
			{
				System.out.println(node.value);
				parent = node;
			}
			else
			{
				return false;
			}
			//System.out.println(node.value);
			return(inorder(node.right));
		}
	}
	
	public static void preOrder(Tree node , ArrayList list)
	{
		if(node == null)
		{
		  list.add("#");
		  return;
		}
		list.add(Integer.toString(node.value));
		preOrder(node.left, list);
		preOrder(node.right,list);

	}
	public static int curindex= 0;
	public static Tree createTree(String[] array)
	{
		if(curindex > array.length)
		{
			return null;
		}
		if(array[curindex] == "#")
		{
			curindex ++;
			return null;
		}
		int val =  Integer.parseInt(array[curindex]);
		Tree tree = new Tree(val);
		curindex++;
		tree.left = createTree(array);
		tree.right = createTree(array);
		return tree;
	}
	
	


}
