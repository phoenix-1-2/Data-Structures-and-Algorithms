package Loothouses;

import java.util.Arrays;

public class LootHousesMemo {

	public static int lootHousesMemo(int[] arr,int n) {
		int[] storage = new int[n+1];
		Arrays.fill(storage, -1);
		return lootHousesMemo(arr, n,storage);
	}

	public static int lootHousesMemo(int[] arr, int n, int[] storage) {
		
		if(n<=0) {
			storage[0] = 0;
			return storage[0];
		}
		if(storage[n]!=-1) {
			return storage[n];
		}
		
		storage[n] = Math.max(lootHousesMemo(arr, n-1,storage),  lootHousesMemo(arr, n-2, storage)+arr[n-1]);
		return storage[n];
	}
}
