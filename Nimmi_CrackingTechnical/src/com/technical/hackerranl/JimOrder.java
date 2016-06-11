package com.technical.hackerranl;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node implements Comparable<Node>
{
	int index;
	int start_time;
	int process_time;
	
	public Node(int index,int s_time,int p_time)
	{
		this.index = index;
		this.start_time = s_time;
		this.process_time = p_time;
	}
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		if(this.start_time!=o.start_time )
		{
			if(this.start_time+this.process_time < o.start_time+o.process_time)
			{
				return -1;
			}
			else
			{
				return 1;
			}
		}
		else
		{
			if(this.index<o.index)
			{
				return -1;
			}
			else
			{
				return 1;
			}
		}
		
	}
}

public class JimOrder {


    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(buf.readLine());
        List<Node> nodes = new ArrayList<Node>();
        Node node_min = null;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<N;i++)
            {
            String[] str = buf.readLine().split(" ");
            Node n = new Node(i+1,Integer.parseInt(str[0]),Integer.parseInt(str[1]));
            nodes.add(n);
            if(Integer.parseInt(str[0])<min)
            {
            	min = Integer.parseInt(str[0]);
            	node_min = n;
            }
        }
        nodes.remove(node_min);
        Collections.sort(nodes);
        nodes.add(0, node_min);
        for(Node nd : nodes)
        {
        	System.out.println(nd.index + "-" + nd.start_time + "-"+nd.process_time);
        }
        
        
    }
}
