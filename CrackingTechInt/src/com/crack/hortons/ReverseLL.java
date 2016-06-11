package com.crack.hortons;

public class ReverseLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Node head=null;;
		for(int i=0;i<5;i++)
		{
			int x = (int) ((Math.random()) *100);
			System.out.print(x+"\t");
			Node node = new Node(x);
			if(head ==null)
			{
				head = node;
			}
			else
			{
				node.next = head;
				head = node;
			}
		}
		ReverseMe(head);
	}
	
	public static Node ReverseMe(Node node)
	{
		Node previous = null;
		Node current = node;
		Node next;
		while(current!=null)
		{
		next = current.next;
		current.next=previous;
		previous = current;
		current=next;
		
		}
		Node start = previous;
		System.out.println("\n");
		while(start!=null)
		{
			System.out.println(start.value);
			start = start .next;
		}
		return null;
	}

}
