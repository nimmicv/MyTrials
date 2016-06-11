package com.technical.facebook;

import java.util.ArrayList;

import com.technical.generic.Tree;

public class TreeToList {

	/**
	 * @param args
	 */
	static Tree head =null;
	static Tree tail =null;
    Tree prev = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {100,80,120,50,40,70,150,135,180,125,145};
		Tree root = null;
		for(int i=0;i<values.length;i++)
		{
			root = crateTree(root,values[i]);
		}
		TreeToList tl = new TreeToList();
		tl.flatten_Post_Order(root);
		Tree ll = head;
		while(ll!=null)
		{
			System.out.println(ll.value);
			ll = ll.left;
			
		}
		ll = tail;
		while(ll!=null)
		{
			System.out.println(ll.value);
			ll = ll.right;		
		}
	}
	
	public static Tree crateTree(Tree node,int val)
	{
		if(node == null)
		{
			Tree temp = new Tree(val);
			return temp;
		}
		if(val<node.value)
		{
			node.left = crateTree(node.left,val);
		}
		else
		{
			node.right = crateTree(node.right,val);
		}
		return node;
	}
	

    public void flatten_Pre_Order(Tree root) {
     
        Tree rightNode = null;
        Tree leftNode = null;
        if(root == null)
        {
            return;
        }

        if(root.left != null)
        {
        	leftNode = root.left;
        }
        if(root.right != null)
        {
        	rightNode = root.right;
        }
        if(prev == null)
        {
            head = root;
        }
        else
        {
            prev.right = null;
            prev.left = root;
            root.right = prev;
            
        }
        root.left = tail;
        tail.right = root;
        prev = root;
        flatten_Pre_Order(leftNode);
        flatten_Pre_Order(rightNode);
    }
    
    public void flatten_In_Order(Tree root) {
        
        Tree rightNode = null;
        Tree leftNode = null;
        if(root == null)
        {
            return;
        }

        if(root.left != null)
        {
        	leftNode = root.left;
        }
        if(root.right != null)
        {
        	rightNode = root.right;
        }
        flatten_In_Order(leftNode);
        if(prev == null)
        {
            head = root;
        }
        else
        {
            prev.left = root;
            root.right = prev;
            
        }
        tail=root;
        prev = root;
        flatten_In_Order(rightNode);
    }
    
 public void flatten_Post_Order(Tree root) {
        
//        Tree rightNode = null;
//        Tree leftNode = null;
        if(root == null)
        {
            return;
        }
//No need to save
//        if(root.left != null)
//        {
//        	leftNode = root.left;
//        }
//        if(root.right != null)
//        {
//        	rightNode = root.right;
//        }
        flatten_Post_Order(root.left);
        
        flatten_Post_Order(root.right);
        if(prev == null)
        {
            head = root;
        }
        else
        {
            prev.right = null;
            prev.left = root;
        }
        root.left=null;
        root.right=null;
        prev = root;
    }

}
