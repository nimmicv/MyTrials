package com.careercupYahoo.sort;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {6,5,7};
		int[] answer = mergeSort(arr);
		
		for(int i: answer)
		{
			System.out.print(i+"\t");
		}
		

	}
	
	public static int[] mergeSort(int[] arr)
	{
		int size = 1;
		int lb1=0,ub1=0,lb2=1,ub2=1;
		
		while(size<arr.length)
		{
			int[] newarr = new int[arr.length];
			int i=0;
			while(ub1<arr.length)
			{
				lb2=ub1+1;
				ub2 = lb2+size-1;
				if(ub2>=arr.length)
				{
					ub2=arr.length-1;
				}
				while(lb1<=ub1 && lb2<=ub2)
				{
					if(arr[lb1]<arr[lb2])
					{
						newarr[i++] = arr[lb1];
						lb1++;
					}
					else
					{
						newarr[i++] = arr[lb2];
						lb2++;
					}
					
				}
				if(lb1<=ub1)
				{
					while(lb1<=ub1)
					{
						newarr[i++] = arr[lb1];
						lb1++;
					}
				}
				if(lb2<=ub2)
				{
					while(lb2<=ub2)
					{
						newarr[i++] = arr[lb2];
						lb2++;
					}
				}
				
				lb1 = ub2+1;
				ub1 = lb1+size-1; 
				
			}
			while(i<arr.length)
			{
				newarr[i] = arr[i];
				i++;
			}
			arr=newarr.clone();
			size=size*2;
			lb1 = 0;
			ub1 = lb1+size-1; 
			for(int x : arr)
			{
				System.out.print(x + "\t");
			}
			System.out.println("\n");
			
		}
		return arr;
	}

}
