package com.technical.facebook;

public class BS_Modified {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2,3, 4, 5, 6, 7};
		BS_Modified bs = new BS_Modified();
		System.out.println("Index = "+bs.binarySerch_modified(array, 1));
	}
	
	public int binarySerch_modified(int[] array, int number)
	{
	    if(array.length == 0 )
	    {
	        return -1;
	    }
	    int low =0;
	    int high = array.length -1;
	    int mid;
	    
	    while(low<=high)
	    {
	        mid = low + (high-low)/2;
	        if(array[mid] == number)
	        {
	            return mid;
	        }
	        else
	        {
	             if(array[mid+1] < array[high])
	             {
	                 if(number>=array[mid+1] && number <= array[high])
	                 {
	                     low = mid +1;
	                 }
	                 else
	                 {
	                     high = mid -1;
	                 }
	             }
	             else
	             {
	                 if(number<=array[mid-1] && number >= array[low])
	                 {
	                     high = mid -1;          
	                 }
	                 else
	                 {
	                     low = mid +1;
	                 }
	             }

	        }
	    }
	    
	    return -1;
	    
	}


}
