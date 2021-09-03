package MinCostPath;

import java.util.Arrays;
import java.util.Scanner;

public class MinCostPathMemo {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int m = s.nextInt();
		int n = s.nextInt();
		int input[][] = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				input[i][j] = s.nextInt();
			}
		}
		System.out.println(minCostPath(input));
	}

	public static int minCostPath(int input[][]) {
		int m = input.length;
		int n = input[0].length;
		int[][] storage = new int[m][n];
		for(int[] i : storage) {
			Arrays.fill(i,-1);
		}
		return minCostPath(input, 0, 0, storage);
		
	}
	public static int minCostPath(int input[][],int x,int y,int[][] storage) {
		if(storage[x][y]!=-1) {
			return storage[x][y];
		}
		int m = input.length;
		int n = input[0].length;
		if( x == m-1 && y==n-1 ) {
			storage[x][y] = input[x][y];
			return storage[x][y];
		}
		if(x>=m || y>=n) {
			return Integer.MAX_VALUE;
		}
		
		
		storage[x][y] = Math.min( minCostPath(input, x+1, y, storage)  ,
				Math.min( minCostPath(input, x, y+1, storage) , 
						minCostPath(input, x+1, y+1, storage)));
		
		return storage[x][y];
		
	}
}
