package com.samsung.LL;

import java.util.HashMap;
import java.util.Random;

public class RandomList {
	 public static void main(String[] args)
	 {
		 Random rand = new Random();
		 
		 for(int i=10;i<=15;i++)
		 {
		 System.out.println(rand.nextInt(i));
		 }
		 RandomListNode new_head = new RandomListNode(-1); 
		 
		 RandomListNode a = new RandomListNode(2); 
		 new_head.next = a;
		 
		 RandomListNode test_head = copyRandomList(new_head);
	 }
	 public static RandomListNode copyRandomList(RandomListNode head) {
	        if(head == null)
	        {
	            return null;
	        }
	        HashMap<RandomListNode,RandomListNode> map = new HashMap<RandomListNode,RandomListNode>();
	        RandomListNode current_head = head;
	        RandomListNode copy_head = null;
	        RandomListNode previous = null;
	        while(current_head != null)
	        {
	            RandomListNode new_head = new RandomListNode(current_head.label);
	            new_head.next = null;
	            new_head.random = null;
	            if(previous!=null)
	            {
	                previous.next=new_head;
	            }
	            if(copy_head==null)
	            {
	                copy_head = new_head;
	            }
	            map.put(current_head,new_head);
	            previous = new_head;
	            current_head = current_head.next;
	        }
	        current_head = head;
	        while(current_head != null)
	        {
	            if(current_head.random!=null)
	            {
	               RandomListNode random_node = map.get(current_head.random);
	               map.get(current_head).random = random_node;
	            }
	            current_head = current_head.next;
	        }
	       return copy_head;
	    }

}
