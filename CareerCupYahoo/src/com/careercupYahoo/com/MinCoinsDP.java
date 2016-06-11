package com.careercupYahoo.com;

public class MinCoinsDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int sum = 11;
     int[] coins = {3,1,5};
     int[] arr = new int[sum+1];
     arr[0] = 0;
     for(int i=1;i<arr.length;i++)
     {
    	 arr[i] = Integer.MAX_VALUE;
     }
     for(int i=1;i<=sum;i++)
     {
    	 for(int j=0;j<coins.length;j++)
    	 {
    		 if(coins[j]<=i && arr[i-coins[j]]<arr[i])
    		 {
    			arr[i] = arr[i-coins[j]] +1;
    		 }
    	 }
     }
     
     for(int i=0;i<arr.length;i++)
     {
    	 System.out.println(arr[i]);
     }
     
	}

}
