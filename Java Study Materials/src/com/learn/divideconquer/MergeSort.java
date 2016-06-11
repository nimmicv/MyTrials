package com.learn.divideconquer;


public class MergeSort {
	
	int stacksize =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[] array = { 100, 80, 91, 77, 65, 53, 45, 36, 28, 14, 8, 3, 98, 76,
					54, 7, 8, 14, 13 };
			MergeSort mes = new MergeSort();
			int arraylength = array.length;
			mes.mergeSort(array,0,arraylength-1);
			mes.display(array);
		}
	public void mergeSort(int[] array, int lower, int upper) {
		
		if(upper == lower)
			return;
		else
		{
			int mid = (lower + upper)/2;
			
			stacksize++;
			System.out.println("Entering sort 1: "+stacksize);
			System.out.println("mid = "+mid+" lower = "+lower+" upper = "+upper);
			mergeSort(array,lower,mid);
			
			stacksize--;
			
			System.out.println("Exiting sort 1: "+stacksize);
			System.out.println("mid = "+mid+" lower = "+lower+" upper = "+upper);
			stacksize++;
			
			System.out.println("Entering sort 2: "+stacksize);
			
			int s= mid+1;
			System.out.println("mid = "+mid+" lower = "+s+" upper = "+upper);
			//System.out.println("mid2 = "+mid+" lower2 = "+ s +" upper2 = "+upper);
			mergeSort(array,mid+1,upper);
			stacksize--;

			System.out.println("Exiting sort 2: Merge"+stacksize);
			System.out.println("mid = "+mid+" lower1 = "+lower+"Upper1 = "+mid+" Lower2 = "+s+" upper2 = "+upper);
			array = this.merge(array,lower,mid,mid+1,upper);
			displaymid(array,mid,mid+1,lower,upper);
			
		}
	
	}
	
	public int[] merge(int[] array,int lower1,int upper1, int lower2, int upper2) {
		//System.out.println(" Lower1 = "+ lower1 + " Upper1 = "+upper1 +" Lower2 = "+ lower2 + " Upper2 = "+upper2);
		
		//int arraylength = array.length;
		int j=0;
		int st = lower1;
		int end = upper2;
		int[] temparray = new int[array.length];
		while(lower1<=upper1 && lower2<=upper2)
		{
			if(array[lower1]<=array[lower2])
			{
				temparray[j++]=array[lower1++];
			}
			else
			{
				temparray[j++]=array[lower2++];
			}
		}
			while(lower1<=upper1)
			{
				temparray[j++]=array[lower1++];
			}
			while(lower2<=upper2)
			{
				temparray[j++]=array[lower2++];
			}
			int i=0;
			while(st<=end)
			{
				array[st++] = temparray[i++];
			}
		
		return array;
		  
	}
    public void displaymid(int[] array ,int upper1,int lower2, int lower1, int upper2) {
    	
    	//System.out.println(" Lower1 = "+ lower1 + " Upper1 = "+upper1 +" Lower2 = "+ lower2 + " Upper2 = "+upper2);
	
    	int arraylength = array.length;
    	//System.out.println("NewPass : ");
    	for(int i=0;i<arraylength;i++)
    	{
    		//System.out.print(array[i] + " ");
    	}
    }

	public void display(int[] array) {
		
	}

}
