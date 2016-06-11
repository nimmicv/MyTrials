package com.technical.hackerranl;

import java.util.Scanner;

public class Stock_Buy_Sell {

	/**
	 * @param args
	 */

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for (int t=0; t<T; t++) {
            int N = input.nextInt();
            int[] A = new int[N];
            for (int n=0; n<N; n++) {
                A[n] = input.nextInt();
            }
            int[] max = new int[N];
            max[N-1]=A[N-1];
            for(int i=N-2;i>=0;i--)
                {
                max[i]= Math.max(max[i+1],A[i]);                
            }
            int buy =0;
            int profit =0;
            int num =0;
            for(int i=0;i<N;i++)
                {
                if(A[i]<max[i])
                    {
                    buy = buy + A[i];
                    num = num +1;
                }
                if(A[i]==max[i] && buy>0)
                    {
                    profit = profit+(num*max[i])-buy;
                    buy =0;
                    num =0;
                }
            }
            System.out.println(profit);
        }
    }

}
