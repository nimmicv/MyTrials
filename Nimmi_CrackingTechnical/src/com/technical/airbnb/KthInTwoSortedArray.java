package com.technical.airbnb;

public class KthInTwoSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2,4,6,8,10};
		int[] arr2 = {1,3,5,7,9,11};
		int num = 10;
		int x = findKthSmallest(arr1,arr2,0,arr1.length-1,0,arr2.length-1,num);
		int y = findKth(arr1,arr2,num,0,arr1.length-1,0,arr2.length-1);
		System.out.println(num + "th Element is = "+ x +" = "+ y );
	}
	
	 public static int findKth(int A[], int B[], int k, 
				int aStart, int aEnd, int bStart, int bEnd) {
			 
				int aLen = aEnd - aStart + 1;
				int bLen = bEnd - bStart + 1;
			 
				// Handle special cases
				if (aLen == 0)
					return B[bStart + k];
				if (bLen == 0)
					return A[aStart + k];
				if (k == 0)
					return A[aStart] < B[bStart] ? A[aStart] : B[bStart];
			 
				int aMid = aLen * k / (aLen + bLen); // a's middle count
				int bMid = k - aMid - 1; // b's middle count
			 
				// make aMid and bMid to be array index
				aMid = aMid + aStart;
				bMid = bMid + bStart;
			 
				if (A[aMid] > B[bMid]) {
					k = k - (bMid - bStart + 1);
					aEnd = aMid;
					bStart = bMid + 1;
				} else {
					k = k - (aMid - aStart + 1);
					bEnd = bMid;
					aStart = aMid + 1;
				}
			 
				return findKth(A, B, k, aStart, aEnd, bStart, bEnd);
			}
	public static int findKthSmallest(int[] arr1,int[] arr2,int l1,int u1,int l2,int u2,int k)
	{

		int m1 = u1-l1+1;
		int m2 = u2-l2+1;
		
		if (m1 == 0)
			return arr2[l2 + k];
		if (m2 == 0)
			return arr1[l1 + k];
		if (k == 0)
			return arr1[l1] < arr2[l2] ? arr1[l1] : arr2[l2];
			
		int i = m1 * k / (m1+m2);
		int j = (k-1) - i;
		
		i= l1+i;
		j=l2+j;
		if(arr1[i]<arr2[j]){
			return findKthSmallest(arr1,arr2,i+1,u1,l2,j,k-(i-l1+1));
		}
		else
			return findKthSmallest(arr1,arr2,l1,i,j+1,u2,k-(j-l2+1));
//		
//		  int Ai_1 = ((i == 0) ? Integer.MIN_VALUE : arr1[i-1]);
//		  int Bj_1 = ((j == 0) ? Integer.MIN_VALUE : arr2[j-1]);
//		  int Ai   = ((i == m1) ? Integer.MIN_VALUE : arr1[i]);
//		  int Bj   = ((j == m2) ? Integer.MIN_VALUE : arr2[j]);
//		
//		if(Ai < Bj && Ai>Bj_1)
//		{
//			return Ai;
//		}
//		if(Bj<Ai && Bj>Ai_1)
//		{
//			return Bj;
//		}
//		if(Ai < Bj)
//		{
//			return findKthSmallest(arr1,arr2,i+1,u1,l2,j-1,k-i-1);
//		}
//		else
//			return findKthSmallest(arr1,arr2,l1,i-1,j+1,u2,k-j-1);
		
	}

}
