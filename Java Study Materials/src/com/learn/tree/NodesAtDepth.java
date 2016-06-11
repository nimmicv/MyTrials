package com.learn.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NodesAtDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BinaryTree bt = new BinaryTree();
		
		NodesAtDepth ndt = new NodesAtDepth();
		Tree root = ndt.createTree();
		ArrayList<LinkedList<Tree>> list = ndt.doBFS(root);
		for(int i=0;i<list.size();i++)
		{
			List lst = list.get(i);
			System.out.println("\n");
			for(int j=0;j<lst.size();j++)
			{
				Tree node = (Tree) lst.get(j);
				System.out.print(node.value+" ");
			}
		}
		System.out.println("Tree Height =" +ndt.height(root));
	}
	
	public ArrayList<LinkedList<Tree>> doBFS(Tree root)
	{
		ArrayList<LinkedList<Tree>> listarray= new ArrayList<LinkedList<Tree>>();
		LinkedList<Tree> list = new LinkedList<Tree>();
		list.add(root);
		listarray.add(list);
		int size = 0;
		while(listarray.size() > size)
		{
		LinkedList<Tree> templist = listarray.get(size);
		LinkedList<Tree> newlist = new LinkedList<Tree>();
			for(int i=0;i<templist.size();i++)
			{
			 
			  Tree node = (Tree) templist.get(i);
			  if(node.left!=null)
			  {
				  newlist.add(node.left);
			  }
			  if(node.right!=null)
			  {
				  newlist.add(node.right);
			  }
				  
			}
			if(newlist.size()>0)
			{
				listarray.add(newlist);
			}
				size++;
		}
		System.out.println("Tree height = "+ (size-1));
		return listarray;
		
		
	}
	
	public int height(Tree node)
	{
		int leftheight;
		int rightheight;
		if(node==null)
		{
			return -1;
		}
		else 
		{
			//if(node.left!=null)
			leftheight = height(node.left)+1;
			//if(node.right!=null)
			rightheight = height(node.right)+1;
		}
		if(leftheight>rightheight)
			return leftheight;
		else
			return rightheight;
	}
	
	public Tree createTree()
	{
		Tree root = null;
		BinaryTree bt = new BinaryTree();
		for(int i=0;i<10;i++)
		{
			root = insert(root,(int)(Math.random()*100)%50);
		}
		return root;
	}
	
	public Tree insert(Tree node, int  x)
	{
		if(node == null)
		{
			Tree node1 = new Tree(x);
			return node1;
		}
		if(x<=node.value)
			node.left = insert(node.left,x);
		else
		if(x>node.value)
			node.right =insert(node.right,x);
		return node;
	}

   
}
