package com.technical.hackerranl;
import java.util.*;

public class Solution_Friends {
    
	 static int friendCircles(String[] friends) {
       int count =0;
       Map<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
        
       for(int i=0;i<friends.length;i++)
           {
           for(int j=0;j<friends.length;j++)
           {
             if(friends[i].charAt(j)=='Y')
                 {
                 //a->b
                 if(!map.containsKey(i))
                     {
                     map.put(i,new ArrayList());
                 }
                 else
                     {
                     ArrayList list = map.get(i);
                     list.add(j);
                     map.put(i,list);
                 }
                 //b->a
                 if(!map.containsKey(j))
                     {
                     map.put(j,new ArrayList());
                 }
                 else
                     {
                     ArrayList list = map.get(j);
                     list.add(i);
                     map.put(j,list);
                 }
                     
             }
           }
       }
           HashSet<Integer> visited = new HashSet<Integer>();
          for(int i=0;i<friends.length;i++)
              {
              if(!visited.contains(i))
                  {
                  count ++;
                  do_dfs(i,map,visited);
              }
          }
       return count;


   }

public static void do_dfs(int node,Map<Integer, ArrayList<Integer>> map, HashSet<Integer> set)
   {
   set.add(node); 
   for(Integer i : map.get(node))
       {
       if((set.contains(i)))
           do_dfs(i,map,set);
   }
}

public static void main(String[] args) {
   /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
//   final String fileName = System.getenv("OUTPUT_PATH");
//   BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
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
}
}
