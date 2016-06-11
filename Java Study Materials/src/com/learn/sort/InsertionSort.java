package com.learn.sort;

public class InsertionSort {
	long[] elements;
	int length;
	
	public void add(int elem)
	{
		elements[length] = elem;
		length ++;
	}
	
	public void create(int max)
	{
		elements= new long[max];
		length = 0;
	}
	
	public void shift(int pos)
	{
		elements[pos] = elements[pos-1];
	}
	
	public void sort()
	{
		
		for(int i=1;i<length;i++)
		{
			long temp = elements[i];
			while(i>0 && temp<elements[i-1])
			{
				elements[i]=elements[i-1];
			    i--;
//			    if(i==0)
//			    	break;
			}
			elements[i]=temp;
		}
	}
	
	public void display()
	{
		for(int i=0;i<length;i++)
		{
			System.out.println(elements[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      InsertionSort srt = new InsertionSort();
      srt.create(10);
      srt.add(100);
      srt.add(90);
      srt.add(85);
      srt.add(75);
      srt.add(60);
      srt.add(55);
      srt.add(40);
      srt.add(30);
      srt.add(25);
      srt.sort();
      srt.display();
			
	}

}
