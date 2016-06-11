package com.technical.facebook;

public class WallsAndGates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] x = new int[0][];
		System.out.println(x[0].length);
	 //int[][] wallsGates = {{2147483647,-1,0,2147483647},{2147483647,2147483647,2147483647,-1},{2147483647,-1,2147483647,-1},{0,-1,2147483647,2147483647}};
	 //wallsAndGates(wallsGates);
	}
	
	public static void wallsAndGates(int[][] rooms) {
        boolean[][] visited = new boolean[rooms.length][rooms[0].length];
        int rows = rooms.length-1;
        int columns = rooms[0].length-1;
        for(int i=0;i<=rows;i++)
        {
            for(int j=0;j<=columns;j++)
            {
                if(rooms[i][j]==0)
                {
                    visited = new boolean[rooms.length][rooms[0].length];
                    findDistance(rooms,i,j,visited,rows,columns,0);
                }
            }
        }
    }
    
    public static void findDistance(int[][] rooms,int i,int j,boolean[][] visited, int rows, int columns,int distance)
    {
        if(i<0 || j <0 || i>rows || j>columns)
        {
            return;
        }
        if(rooms[i][j] == -1 || visited[i][j])
        {
            return;
        }
        // Distance greater than current
        if (distance > rooms[i][j]) {
            return;
        }
        if(rooms[i][j]>distance)
        {
            rooms[i][j] = distance;
            visited[i][j] = true;
        }
        findDistance(rooms,i-1,j,visited,rows,columns,distance+1);
        findDistance(rooms,i+1,j,visited,rows,columns,distance+1);
        findDistance(rooms,i,j-1,visited,rows,columns,distance+1);
        findDistance(rooms,i,j+1,visited,rows,columns,distance+1);
        
    }

}
