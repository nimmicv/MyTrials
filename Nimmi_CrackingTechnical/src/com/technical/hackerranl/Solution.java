package com.technical.hackerranl;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
	/**
	 * @param args
	 */
	 static int friendCircles(String[] friends) {
	        int count =0;
	        char[][] values = new char[friends.length][friends.length];
	        for(int i=0;i<friends.length;i++)
	            {
	            for(int j=0;j<friends.length;j++)
	            {
	              values[i][j] = friends[i].charAt(j);  
	            }
	        }
	        
	        for(int i=0;i<friends.length;i++)
            {
	        System.out.print("\n");
            for(int j=0;j<friends.length;j++)
                {
                System.out.print(values[i][j]+"\t");
                }
            }
       
	        for(int i=0;i<friends.length;i++)
	            {
	            for(int j=0;j<friends.length;j++)
	                {
	                if(values[i][j] == 'Y')
	                    {
	                    count++;
	                    dfs(values,i,j);
	                }
	            }
	        }
	        for(int i=0;i<friends.length;i++)
            {
	        System.out.print("\n");
            for(int j=0;j<friends.length;j++)
                {
                System.out.print(values[i][j]+"\t");
                }
            }
	        return count;


	    }

	    public static void dfs(char[][] values,int i,int j)
	    {
	        if(i<0||j<0||i>values.length-1||j>values.length-1)
	        {
	            return;
	        }
	        values[i][j] = 'N';
	        if(i<values.length-1 && values[i+1][j]=='Y')
	        {
	          dfs(values,i+1,j);  
	        }
	        if(j<values.length-1 && values[i][j+1]=='Y')
	        {
	          dfs(values,i,j+1);  
	        }
	        if(i>0 && values[i-1][j]=='Y')
	        {
	          dfs(values,i-1,j);  
	        }
	        if(j>0 && values[i][j-1]=='Y')
	        {
	          dfs(values,i,j-1);  
	        }
	        
	    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
//        final String fileName = System.getenv("OUTPUT_PATH");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;
        
        int _friends_size = Integer.parseInt(in.nextLine());
        String[] _friends = new String[_friends_size];
        String _friends_item;
        for(int _friends_i = 0; _friends_i < _friends_size; _friends_i++) {
            try {
                _friends_item = in.nextLine();
            } catch (Exception e) {
                _friends_item = null;
            }
            _friends[_friends_i] = _friends_item;
        }
        
        res = friendCircles(_friends);
        System.out.println(res);
//        bw.write(String.valueOf(res));
//        bw.newLine();
//        
//        bw.close();
    }
}

