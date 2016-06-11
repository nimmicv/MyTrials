package com.technical.google;
import java.util.*;

import com.technical.generic.Tree;

public class zigzagTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] values = {100,60,150,50,70,140,160};
		Tree head = null;
		for(int i: values)
		{
			head = createTree(i,head);
		}
		zigzagTree ztree = new zigzagTree();
		List<List<Integer>> zlist = ztree.zigzagLevelOrder(head);
		for(List<Integer> list : zlist)
		{
			System.out.println(list.toString());
		}

	}
	
	public static Tree createTree(int val,Tree root)
	{
		if(root == null)
		{
			Tree tree = new Tree(val);
			return tree;
		}
		if(val>root.value)
		{
			root.right = createTree(val,root.right);
		}
		else
		if(val<root.value)
		{
			root.left = createTree(val,root.left);
		}
		return root;
	}
	 public List<List<Integer>> zigzagLevelOrder(Tree root) {
	        
	        List<List<Integer>> list = new ArrayList<List<Integer>>();
	        if(root == null)
	        {
	            return list;
	        }
	        
	        Stack<Tree> llist = new Stack<Tree>();
	        Stack<Tree> rlist = new Stack<Tree>();
	        
	        List<Integer> valueues = new ArrayList<Integer>();
	        valueues.add(root.value);
	        list.add(valueues);
	        valueues = new ArrayList<Integer>();
	        
	        
	        llist.push(root);
	        int flag = 0;
 
	        while(!llist.isEmpty())
	        {
	            Tree tn = llist.pop();
	            if(flag == 0)
	            {
	                if(tn.right!=null)
	                {
	                    rlist.push(tn.right);
	                    valueues.add(tn.right.value);
	                }
	                if(tn.left!=null)
	                {
	                    rlist.push(tn.left);
	                    valueues.add(tn.left.value);
	                }
	            }
	            if(flag == 1)
	            {
	                if(tn.left!=null)
	                {
	                    rlist.push(tn.left);
	                    valueues.add(tn.left.value);
	                }
	                if(tn.right!=null)
	                {
	                    rlist.push(tn.right);
	                    valueues.add(tn.right.value);
	                }
	            }
	            if(llist.isEmpty())
	            {
	                
	                if(!rlist.isEmpty())
	                {
	                   flag = flag==0?1:0;
	                   llist = rlist;
	                   rlist = new Stack<Tree>();
	                   list.add(valueues);
	                   valueues = new ArrayList<Integer>();
	                   
	                }
	                
	            }
	            
	        }
	        return list;
	        
	    }

}
