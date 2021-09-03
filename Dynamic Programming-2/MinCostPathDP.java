package MinCostPath;

import java.util.Scanner;

public class MinCostPathDP {
	
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
		storage[m-1][n-1] = input[m-1][n-1];
		for(int i =m-2;i>=0;i--) {
			storage[i][n-1] =storage[i+1][n-1] + input[i][n-1]; 
		}
		for(int j=n-2;j>=0;j--) {
			storage[m-1][j] =storage[m-1][j+1] + input[m-1][j];
		}
		for(int i= m-2;i>=0;i--) {
			for(int j=n-2;j>=0;j--) {
				storage[i][j] = Math.min(storage[i+1][j],  
						Math.min(storage[i+1][j+1], 
								storage[i][j+1] ) ) + input[i][j]; 
			}
		}
		return storage[0][0];
	}

}