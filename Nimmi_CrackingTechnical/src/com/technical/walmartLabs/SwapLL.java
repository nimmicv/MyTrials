package com.technical.walmartLabs;

public class SwapLL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class LinkedLL{
			int val;
			LinkedLL next;
			public LinkedLL(int value)
			{
				this.val = value;
				this.next = null;
			}
		}
		LinkedLL l1= new LinkedLL(10);
		LinkedLL l2= new LinkedLL(20);
		l1.next = l2;
		LinkedLL l3= new LinkedLL(30);
		l2.next = l3;
		LinkedLL head = l1;
		LinkedLL head2 = null;
		LinkedLL prev = null;
		while(head!=null && head.next!=null)
		{
			LinkedLL t1 = head;
			LinkedLL t2 = head.next;
			LinkedLL temp = t2.next;
			t2.next = t1;
			t1.next = temp;
			if(head2==null)
				head2 = t2;
			if(prev!=null)
				prev.next = t2;
			prev = t1;
			head=temp;
		}
		while(head2!=null)
		{
			System.out.println(head2.val);
			head2 = head2.next;
		}
		
	}

}
