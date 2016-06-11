package com.technical.google;

import java.util.Stack;

public class Verify_Preorder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[1][1];
		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
		String preorder = "9,#,#,1";
		Verify_Preorder vpf = new Verify_Preorder();
		boolean x = vpf.isValidSerialization(preorder);
		if(x)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	public boolean isValidSerialization(String preorder) {
        int i=0;
        String s= "1";
        String[] str = preorder.split(",");
        Stack<String> stck = new Stack<String>();
        while(i<str.length)
        {
            if(!str[i].equals("#"))
            {
                stck.push(str[i]);
            }
            else
            {
                while(!stck.isEmpty() && stck.peek().equals("#"))
                {
                    if(stck.size()<2)
                    {
                        return false;
                    }
                    stck.pop();
                    stck.pop();
                }
                stck.push("#");
            }
            i++;
        }
        if(stck.size()==1 && stck.peek().equals("#"))
        {
            return true;
        }
        else
        {
            return false;
        }
        
        
    }

}
