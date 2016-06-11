package com.samsung.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class snake_ladder {
	class node
	{
		int value;
		int path_length;
		public node(int value, int length)
		{
			this.value = value;
			this.path_length = length;
		}
	}

	 public  int BFS(HashMap<Integer,Integer> ladders, HashMap<Integer,Integer> snakes)
	    {
		 HashSet<Integer> visited = new HashSet<Integer>();
		 Queue<node> que = new LinkedList<node>();
		 node n = new node(1,0);
		 que.add(n);
		 while(!que.isEmpty())
		 {
			node cur = que.poll();
			visited.add(cur.value);
			int path =cur.path_length;
			for(int i=1;i<=6;i++)
			{
			 int value = cur.value+i;
			  if(value ==100)  
			  {
				return path+1;
			  }
			  else
				  //discard all snakes
			  if(value <100 && !visited.contains(value))  
			  {
				  
				  if(ladders.containsKey(value))
				  {
					  if(ladders.get(value) == 100)
					  {
						  return path+1;
					  }
					  visited.add(value);
					  node nd = new node(ladders.get(value),path+1); 
					  que.add(nd);
				  }
				  else
				  if(snakes.containsKey(value))
				  {
					  visited.add(value);
					  node nd = new node(snakes.get(value),path+1); 
					  que.add(nd);
				  }
				  else
				  {
					  node nd = new node(value,path+1); 
					  que.add(nd); 
				  }
				  
			  }
			}
		 }
	     
		 return -1;
	    }
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in = new Scanner(System.in);
	        int num_tests = Integer.parseInt(in.nextLine());
	        for(int i=0;i<num_tests;i++)
	            {
	            int ladders = Integer.parseInt(in.nextLine());
	            HashMap<Integer,Integer> ladder_map = new HashMap<Integer,Integer>();
	            HashMap<Integer,Integer> snake_map = new HashMap<Integer,Integer>();
	            for(int j=0;j<ladders;j++)
	                {
	                String s = in.nextLine();
	                String[] ladder_values = s.split(" ");
	                ladder_map.put(Integer.parseInt(ladder_values[0]),Integer.parseInt(ladder_values[1]));
	            }
	            int snakes = Integer.parseInt(in.nextLine());
	            for(int j=0;j<snakes;j++)
	                {
	                String s = in.nextLine();
	                String[] snake_values = s.split(" ");
	                snake_map.put(Integer.parseInt(snake_values[0]),Integer.parseInt(snake_values[1]));
	            }
	            snake_ladder bfs = new snake_ladder();
	            System.out.println(bfs.BFS(ladder_map,snake_map));
	        }
	    }

}
