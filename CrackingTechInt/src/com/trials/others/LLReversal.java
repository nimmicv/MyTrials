package com.trials.others;

public class LLReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList head = null;
		for(int i=0;i<5;i++)
		{
			int x = (int) (Math.random() * 100);
			//System.out.println(x);
			LinkedList lst = new LinkedList(x,null);
			if(head == null)
			{
				head = lst;
			}
			else
			{
				lst.next = head;
				head = lst;
			}
			
		}
		LinkedList ls = head;
		while(ls!=null)
		{
			System.out.println(ls.data);
			ls=ls.next;
		}
		
		LinkedList previous = null;
		LinkedList current = head;
		LinkedList next = current.next;
		current.next = previous;
		while(next!=null)
		{
			previous = current;
			current = next;
			next = current.next;
			current.next = previous;
			
		}
		
		head = current;
		
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
		
		
	}

}
