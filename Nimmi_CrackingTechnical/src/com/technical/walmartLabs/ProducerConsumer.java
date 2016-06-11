package com.technical.walmartLabs;

import java.util.*;


public class ProducerConsumer {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BlockingQueue<Integer> bqueue = new LinkedBlockingQueue<Integer>();
		Queue<Integer> sharedQueue = new LinkedList<Integer>();
		 Thread prodThread = new Thread(new Producer(sharedQueue));
	     Thread consThread = new Thread(new Consumer(sharedQueue));
	     prodThread.start();
	     consThread.start();
		//Thread t1 = new Thread(new Producer(bque));
		

	}
}
	
	class Producer implements Runnable
	{
		Random generator = new Random();
		Queue<Integer> bqueue;
		public Producer(Queue sharedQ)
		{
			this.bqueue = sharedQ;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			produce();
		}
		
		public void produce()
		{
			synchronized(bqueue)
			{
				while(true)
				{
					if(bqueue.size()>=5)
					{
						try {
							bqueue.wait();
							System.out.println("Queue is Full");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

					int result = generator.nextInt();
					System.out.println("Produced = "+ result );
					bqueue.add(result);
					bqueue.notifyAll();

				}
			}
			
		}
		
	}
	
	class Consumer implements Runnable
	{

		Queue<Integer> bqueue;
		public Consumer(Queue sharedQ)
		{
			this.bqueue = sharedQ;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			consume();
		}
		
		public void consume()
		{
			synchronized(bqueue)
			{
				while(true){
					if(bqueue.isEmpty())
					{
						System.out.println("Queue is Empty");
						try {
							bqueue.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					System.out.println("Consumed = "+ bqueue.poll());
					bqueue.notifyAll();
				}
			}
			
		}
		
	}

