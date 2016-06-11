package com.technical.hackerranl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Modified_fibonacci {

	/**
	 * @param args
	 * @throws IOException 
	 */

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	BigInteger bi = new BigInteger("1234");
		System.out.println(bi.longValue());
    	    Scanner in = new Scanner(System.in);
    		
    		BigInteger a = BigInteger.valueOf(in.nextLong());
    		BigInteger b = BigInteger.valueOf(in.nextInt());
    		int n = in.nextInt();
    		for(int i = 2; i < n; i++) {
    			BigInteger next = b.multiply(b).add(a);
    			a = b;
    			b = next;
    		}
    		System.out.println(b);
    	}

}

//public class Solution {
//    static int A, B, N;
//    static BigInteger[] memo;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        A = sc.nextInt();
//        B = sc.nextInt();
//        N = sc.nextInt();
//        memo = new BigInteger[N+1];
//        System.out.println(num(N));
//    }
//    
//    public static BigInteger num(int N) {
//        if (memo[N] != null) return memo[N];
//        if (N == 1) return BigInteger.valueOf(A);
//        if (N == 2) return BigInteger.valueOf(B);
//        return memo[N] = (num(N-1).multiply(num(N-1)).add(num(N-2)));
//    }
//}
