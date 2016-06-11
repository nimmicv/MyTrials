package com.samsung.DP;


import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

public class Fibonacci {
	static BigInteger zero = new BigInteger("0");
	static BigInteger one = new BigInteger("1");
	static BigInteger two = new BigInteger("2");
	 public static BigInteger findfib(BigInteger a, BigInteger b, BigInteger num, HashMap<BigInteger,BigInteger> map)
     {
     if(map.containsKey(num))
         {
         return map.get(num);
     }
     if(num.equals(zero))
         {
         return a;
     }
     if(num.equals(one))
         {
         return b;
     }
     BigInteger num1 = num.subtract(one);
     BigInteger num2 = num.subtract(two);
     BigInteger val_mul = (findfib(a,b,num1,map).multiply(findfib(a,b,num1,map))).add(findfib(a,b,num2,map));
     map.put(num,val_mul);
     return val_mul;
 }

 public static void main(String[] args) {
     /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
	    String[] values = s.split(" ");
     HashMap<BigInteger,BigInteger> map = new HashMap<BigInteger,BigInteger>();
     Fibonacci sn = new Fibonacci();
     BigInteger a_bg = new BigInteger(values[0]);
     BigInteger b_bg = new BigInteger(values[1]);
     BigInteger c_bg = new BigInteger(values[2]);
     
     c_bg = c_bg.subtract(one);;
     System.out.println(sn.findfib(a_bg,b_bg,c_bg,map));
     
 }

}
