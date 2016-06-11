package com.learn.matrix;

public class MaxSubarray2D {

    static int LENGTH;
    final static int MAX_VAL = 10;

    public static void main(String[] args) {

        for (int i = 4; i <= 4; i += 10) {
            LENGTH = i;

            int[][] a = new int[LENGTH][LENGTH];

            for (int row = 0; row < LENGTH; row++) {
                for (int col = 0; col < LENGTH; col++) {
                    a[row][col] = (int) (Math.random() * (MAX_VAL + 1));
                    if (Math.random() > 0.5D) {
                        a[row][col] = -a[row][col];
                    }
                    //System.out.printf("%4d", a[row][col]);
                }
                //System.out.println();
            }
            
            for(int k=0;k<LENGTH;k++)
            {
            	System.out.println();
            	for(int j=0;j<LENGTH;j++){
            		System.out.print(a[k][j]+"  ");
            	}
            }
            System.out.println("N = " + LENGTH);
            System.out.println("-------");

            long start, end;
            start = System.currentTimeMillis();
            naiveSolution(a);
            end = System.currentTimeMillis();
            System.out.println("   run time: " + (end - start) + " ms   no auxiliary space requirements");
            start = System.currentTimeMillis();
            dynamicProgammingSolution(a);
            end = System.currentTimeMillis();
            System.out.println("   run time: " + (end - start) + " ms   requires auxiliary space for "
                    + ((int) Math.pow(LENGTH, 4)) + " integers");
            start = System.currentTimeMillis();
            kadane2D(a);
            end = System.currentTimeMillis();
            System.out.println("   run time: " + (end - start) + " ms   requires auxiliary space for " +
                    + ((int) Math.pow(LENGTH, 2)) + " integers");
            System.out.println();
            newkadane2D(a);
            System.out.println();
        }
    }
    
    public static void newkadane2D(int[][] a) {
    	
    	int dim = a.length;
    	int maxsum=0;
    	int sum=0;
    	int startcol=-1;
    	int endcol=-1;
    	int startrow=-1;
    	int endrow=-1;
        //computing the vertical prefix sum for columns
        int[][] ps = new int[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (j == 0) {
                    ps[j][i] = a[j][i];
                } else {
                    ps[j][i] = a[j][i] + ps[j - 1][i];
                }
            }
        }
   
        //iterate over the possible combinations applying Kadane's Alg.
        for (int i = 0; i < dim; i++) {
            for (int j = i; j < dim; j++) {
                sum = 0;
                int[] sumarray  = new int[dim];
                for (int k = 0; k < dim; k++) { 	
                    if (i == 0) {
                    	sumarray[k] = ps[j][k];
                    } else {
                    	sumarray[k] = ps[j][k] - ps[i - 1 ][k];
                    }                   
                }
                int col=0;
                for(int l=0;l<dim;l++)
                {
                	sum = sum+sumarray[l];
                	if(sum>maxsum)
                	{
                		maxsum=sum;
                		endcol=l;
                		startrow = i;
                        endrow= j;
                        startcol=col;
                	}
                	if(sum<0)
                	{
                		sum=0;
                		col=l+1;
                	}
                }
               
            }
        }
        
        System.out.println("Maxsofar = "+ maxsum+" Start Cell ("+startrow+","+startcol+")"+" End Cell = ("+endrow+","+endcol+")");
    	
    }

    // O(N^2) !!!
    public static void kadane2D(int[][] a) {
        int[][] s = new int[LENGTH + 1][LENGTH]; // [ending row][sum from row zero to ending row] (rows 1-indexed!)
        for (int r = 0; r < LENGTH + 1; r++) {
            for (int c = 0; c < LENGTH; c++) {
                s[r][c] = 0;
            }
        }
        for (int r = 1; r < LENGTH + 1; r++) {
            for (int c = 0; c < LENGTH; c++) {
                s[r][c] = s[r - 1][c] + a[r - 1][c];
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int maxRowStart = -1;
        int maxColStart = -1;
        int maxRowEnd = -1;
        int maxColEnd = -1;
        for (int r1 = 1; r1 < LENGTH + 1; r1++) { // rows 1-indexed!
            for (int r2 = r1; r2 < LENGTH + 1; r2++) { // rows 1-indexed!
                int[] s1 = new int[LENGTH];
                for (int c = 0; c < LENGTH; c++) {
                    s1[c] = s[r2][c] - s[r1 - 1][c];
                }
                int max = 0;
                int c1 = 0;
                for (int c = 0; c < LENGTH; c++) {
                    max = s1[c] + max;
                    if (max <= 0) {
                        max = 0;
                        c1 = c + 1;
                    }
                    if (max > maxSum) {
                        maxSum = max;
                        maxRowStart = r1 - 1;
                        maxColStart = c1;
                        maxRowEnd = r2 - 1;
                        maxColEnd = c;
                    }
                }
            }
        }

        System.out.print("KADANE SOLUTION |   Max sum: " + maxSum);
        System.out.print("   Start: (" + maxRowStart + ", " + maxColStart +
                ")   End: (" + maxRowEnd + ", " + maxColEnd + ")");
    }

    // O(N^4) !!!
    public static void dynamicProgammingSolution(int[][] a) {
        int[][][][] dynTable = new int[LENGTH][LENGTH][LENGTH + 1][LENGTH + 1]; // [row][col][height][width]
        int maxSum = Integer.MIN_VALUE;
        int maxRowStart = -1;
        int maxColStart = -1;
        int maxRowEnd = -1;
        int maxColEnd = -1;

        for (int r = 0; r < LENGTH; r++) {
            for (int c = 0; c < LENGTH; c++) {
                for (int h = 0; h < LENGTH + 1; h++) {
                    for (int w = 0; w < LENGTH + 1; w++) {
                        dynTable[r][c][h][w] = 0;
                    }
                }
            }
        }

        for (int r = 0; r < LENGTH; r++) {
            for (int c = 0; c < LENGTH; c++) {
                for (int h = 1; h <= LENGTH - r; h++) {
                    int rowTotal = 0;
                    for (int w = 1; w <= LENGTH - c; w++) {
                        rowTotal += a[r + h - 1][c + w - 1];
                        dynTable[r][c][h][w] = rowTotal + dynTable[r][c][h - 1][w];
                    }
                }
            }
        }
        for (int r = 0; r < LENGTH; r++) {
            for (int c = 0; c < LENGTH; c++) {
                for (int h = 0; h < LENGTH + 1; h++) {
                    for (int w = 0; w < LENGTH + 1; w++) {
                        if (dynTable[r][c][h][w] > maxSum) {
                            maxSum = dynTable[r][c][h][w];
                            maxRowStart = r;
                            maxColStart = c;
                            maxRowEnd = r + h - 1;
                            maxColEnd = c + w - 1;
                        }
                    }
                }
            }
        }

        System.out.print("    DP SOLUTION |   Max sum: " + maxSum);
        System.out.print("   Start: (" + maxRowStart + ", " + maxColStart +
                ")   End: (" + maxRowEnd + ", " + maxColEnd + ")");
    }


    // O(N^6) !!!
    public static void naiveSolution(int[][] a) {
        int maxSum = Integer.MIN_VALUE;
        int maxRowStart = -1;
        int maxColStart = -1;
        int maxRowEnd = -1;
        int maxColEnd = -1;

        for (int rowStart = 0; rowStart < LENGTH; rowStart++) {
            for (int colStart = 0; colStart < LENGTH; colStart++) {
                for (int rowEnd = 0; rowEnd < LENGTH; rowEnd++) {
                    for (int colEnd = 0; colEnd < LENGTH; colEnd++) {
                        int sum = 0;
                        for (int row = rowStart; row <= rowEnd; row++) {
                            for (int col = colStart; col <= colEnd; col++) {
                                sum += a[row][col];
                            }
                        }
                        if (sum > maxSum) {
                            maxSum = sum;
                            maxRowStart = rowStart;
                            maxColStart = colStart;
                            maxRowEnd = rowEnd;
                            maxColEnd = colEnd;
                        }
                    }
                }
            }
        }

        System.out.print(" NAIVE SOLUTION |   Max sum: " + maxSum);
        System.out.print("   Start: (" + maxRowStart + ", " + maxColStart +
                ")   End: (" + maxRowEnd + ", " + maxColEnd + ")");
    }

}