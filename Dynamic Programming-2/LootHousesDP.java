package Loothouses;

import java.util.Scanner;

public class LootHousesDP {

	public static int getMaxMoney(int arr[], int n){
		
		int[] storage = new int[n+1];
		storage[0] = 0;
		storage[1] = arr[0];
		for(int i=2;i<=n;i++) {
			storage[i] = Math.max(storage[i-1] , arr[i-1] + storage[i-2]);
		}
		return storage[n];
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
