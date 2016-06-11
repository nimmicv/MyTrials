package com.technical.facebook;

public class MaxProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = { 3,-2,0,12};
		MaxProduct mp = new MaxProduct();
		System.out.println(mp.maxProduct(values));
	}
	public int maxProduct(int[] A) {
	    if(A==null || A.length==0)  
	        return 0;  
	 
	    int maxLocal = A[0];  
	    int minLocal = A[0];  
	    int global = A[0];  
	 
	    for(int i=1; i<A.length; i++){  
	        int temp = maxLocal;  
	        maxLocal = Math.max(Math.max(A[i]*maxLocal, A[i]), A[i]*minLocal);  
	        minLocal = Math.min(Math.min(A[i]*temp, A[i]), A[i]*minLocal);  
	        global = Math.max(global, maxLocal);  
	    }  
	    return global;
	}

}
