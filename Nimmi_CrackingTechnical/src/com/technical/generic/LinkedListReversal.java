package com.technical.generic;

class List{
	int value;
	List next;
	public List(int value)
	{
		this.value = value;
		this.next = null;
	}
}


public class LinkedListReversal {
	
	

	/**
	 * @param args
	 */
	static List head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List previous = null;
		List list;
		for(int i=1;i<5;i++)
		{
			list = new List(i);
			if(previous !=null){
				previous.next = list;
			}
			
			if(head == null)
			{
				head =list;
			}
			previous = list;
		}
		//reverseLL(head);
		//reverseLL_recursive(head,null);
//		while(head !=null)
//		{
//			System.out.print(head.value+" ");
//			head=head.next;
//		}
		swap(head);
		while(head !=null)
		{
			System.out.print(head.value+" ");
			head=head.next;
		}
	
	}
	
	public static void reverseLL(List node)
	{
		List previous = null;
		List current = node;
		List next = null;
		while(current!=null)
		{
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		List curhead= previous;
//		while(curhead !=null)
//		{
//			System.out.print(curhead.value+" ");
//			curhead=curhead.next;
//		}
	}
	
	public static void swap(List node)
	{
		
		List current = node;
		List temp = current.next.next;
		current.next.next = current;
		head= current.next;
		current.next = temp;
		current = temp;
		List previous = current;
		
		while(current!=null && current.next!=null)
		{
			temp = current.next.next;
			current.next.next = current;
			previous.next = current.next;
			current.next = temp;
			current = temp;
		}
		List curhead= previous;
//		while(curhead !=null)
//		{
//			System.out.print(curhead.value+" ");
//			curhead=curhead.next;
//		}
	}
	
	public static List reverseLL_recursive(List curnode,List previous)
	{
		if(curnode.next == null)
		{
			curnode.next=previous;
			head = curnode;
			return null;
		}
		//Save next node
		List next_node = curnode.next;
		//Make previous next
		curnode.next = previous;
		//Call with current node as previous
		reverseLL_recursive(next_node,curnode);
		return head;
	}
	

}
