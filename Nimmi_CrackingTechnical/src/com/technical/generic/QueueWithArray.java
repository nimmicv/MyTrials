package com.technical.generic;

public class QueueWithArray {

	/**
	 * @param args
	 */
	static int front = 0;
	static int rear = 0;
	static int[] array = new int[2];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		enqueue(3,2);
		enqueue(8,2);
		dequeue(2);
		enqueue(10,2);
		dequeue(2);
		dequeue(2);
		

	}
	
	public static void enqueue(int number,int size)
	{
		if(((rear+1)%size) == front)
		{
			System.out.println("Queue is Full");
		}
		else
		{
			array[rear] = number;
			rear=(rear+1)%size;
		}
		
		
	}
	public static int dequeue(int size)
	{
		if(front == rear)
		{
			System.out.println("Queue is empty");
			return -1;
		}
		int value = array[front];
		front = (front+1)%size;	
		System.out.println(value);
		return value;
		
	}

}
