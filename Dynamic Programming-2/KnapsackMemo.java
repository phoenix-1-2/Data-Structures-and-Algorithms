package Knapsack;

import java.util.Arrays;

public class KnapsackMemo {

	public static int knapsack(int[] weight,int value[],int maxWeight){

		int n = weight.length;
		int[][] storage = new int[n+1][maxWeight+1];
		for(int[] i : storage) {
			Arrays.fill(i, -1);
		}
		return knapsack(weight, value, maxWeight,storage,n);

	}

	private static int knapsack(int[] weight, int[] value, int maxWeight, int[][] storage, int n) {
		if(n==0 || maxWeight==0) {
			storage[n][maxWeight] = 0;
			return storage[n][maxWeight];
		}
		if(storage[n][maxWeight]!=-1) {
			return storage[n][maxWeight];
		}
		
		if(weight[n-1] > maxWeight ) {
			storage[n][maxWeight] = knapsack(weight, value, maxWeight, storage, n-1);
			return storage[n][maxWeight];
		}
		storage[n][maxWeight] = Math.max( knapsack(weight, value, maxWeight, storage, n-1) , 
				knapsack(weight, value, maxWeight-weight[n-1], storage, n-1) + value[n-1]
				);
		return storage[n][maxWeight];
	}

}
