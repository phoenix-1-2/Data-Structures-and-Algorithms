package Loothouses;

import java.util.Scanner;

public class LootHousesRecursion {
	
	public static int getMaxMoney(int arr[], int n){
		
		if(n<=0) {
			return 0;
		}
		return Math.max( getMaxMoney(arr, n-1)  , arr[n-1] + getMaxMoney(arr, n-2)  );
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = s.nextInt();
		}
		System.out.println(getMaxMoney(arr, n));
	}

}
