package com.technical.twitter;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKList {
	public class ListNode {
		     int val;
		     ListNode next;
		      ListNode(int x) { val = x; }
		  }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public ListNode mergeKLists(ListNode[] lists) {
	int size = lists.length;
//	PriorityQueue<ListNode> queue= new PriorityQueue<ListNode>(size,new Comparator<ListNode>(){
//        public int compare(ListNode o1,ListNode o2){
//            if (o1.val<o2.val)
//                return -1;
//            else if (o1.val==o2.val)
//                return 0;
//            else 
//                return 1;
//        }
//    });
	
  
        PriorityQueue<ListNode> pqueue = new PriorityQueue<ListNode>(lists.length,new Comparator<ListNode>(){
        	 public int compare(ListNode l1, ListNode l2) {                         
                 return l1.val-l2.val;  
             }  
        });
        
        for(int i=0;i<lists.length;i++)
        {
        	pqueue.add(lists[i]);     	
        }
        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;
        while(!pqueue.isEmpty())
        {
        	ListNode node = pqueue.poll();
        	tail.next = node;
        	if(node.next!=null)
        		pqueue.add(node.next);
        }
        return dummy.next;
        
    }

}
