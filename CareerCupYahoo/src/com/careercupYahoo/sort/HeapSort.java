package com.careercupYahoo.sort;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,9,23};
		
		//Heapify
	    for( int i = (int)Math.floor( arr.length)/2; i >= 0; i-- )
	    {
	    	System.out.println();
	        maxheapify( arr, i, arr.length );
	        
	        System.out.print("Pass "+ i+ "=>");
	        for(int j=0;j<arr.length;j++)
	        {
	        	System.out.print(arr[j]+" ,");
	        }
	    }
//	    for( int i = (int)Math.floor( arr.length)/2; i >= 0; i-- )
//	    {
//	    	System.out.println();
//	        minheapify( arr, i, arr.length );
//	        
//	        System.out.print("Pass "+ i+ "=>");
//	        for(int j=0;j<arr.length;j++)
//	        {
//	        	System.out.print(arr[j]+" ,");
//	        }
//	    }
	    //Heap Sort
	    int length = arr.length;
	    while(length>1)
	    {
	    	int temp = arr[0];
	    	arr[0] = arr[length-1];
	    	arr[length-1] = temp;
	    	length--;
	    	System.out.println();
	    	maxheapify( arr, 0, length );
	    	 System.out.print("Pass => ");
		        for(int j=0;j<arr.length;j++)
		        {
		        	System.out.print(arr[j]+" ,");
		        }
	    }
	    
	    
	    

	}
	
	public static void maxheapify(int[] arr, int pos,int length)
	{
		int left = pos*2+1;
		int right = pos*2+2;
		int largest = pos;
		if(length>left && arr[left]>arr[largest])
		{
			largest = left;
		}
		if(length>right && arr[right]>arr[largest])
		{
			largest = right;
		}
		if(largest !=pos)
		{
			int temp = arr[pos];
			arr[pos] = arr[largest];
			arr[largest] = temp;
			maxheapify(arr,largest,length);
		}
		
		
	}
	public static void minheapify(int[] arr, int pos,int length)
	{
		int left = pos*2+1;
		int right = pos*2+2;
		int smallest = pos;
		if(length>left && arr[left]<arr[smallest])
		{
			smallest = left;
		}
		if(length>right && arr[right]<arr[smallest])
		{
			smallest = right;
		}
		if(smallest !=pos)
		{
			int temp = arr[pos];
			arr[pos] = arr[smallest];
			arr[smallest] = temp;
			minheapify(arr,smallest,length);
		}
		
		
	}

}
