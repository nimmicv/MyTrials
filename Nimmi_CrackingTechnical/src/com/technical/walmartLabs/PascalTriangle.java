package com.technical.walmartLabs;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		//for (int i = 0; i < 5; i++) {
	           for (int j = 0; j <= 4; j++) {
	               System.out.print(pascal(4, j) + " ");
	           }
	           System.out.println();
	      // }
		//System.out.println(pascal(3,2));
	}
	
	
	
	public static int pascal(int i, int j) {
	       if (j == 0) {
	           return 1;
	       } else if (j == i) {
	           return 1;
	       } else {
	           return pascal(i - 1, j - 1) + pascal(i - 1, j);
	       }

	   }

}
