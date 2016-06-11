package com.learn.max;

public class MaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[] ={-5,-10,5,4,-9,10,-2,};
	int length = a.length;
	int sum=0;
	int maxsum = 0;
	int startindex =0;
	int newstartindex =0;
	int endindex =-1;
     for(int i=0;i<length;i++)
     {
    	sum = sum+a[i]; 
    	if(sum>maxsum)
    	{
    		startindex = newstartindex;
    		maxsum=sum;
    		endindex =i;
    	}
    	else
    	if(sum<=0)
    	{
    		sum=0;
    		if(i<length-1)
    			newstartindex = i+1;
    	}
     }
    System.out.println("Max Sum = "+ maxsum +" , Start index = "+ startindex+" , Endindex = " + endindex);
	}

}
