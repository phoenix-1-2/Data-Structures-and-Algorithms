package CoinTower;

import java.util.Arrays;

public class CoinTowerMemo {

	public static String solve(int n,int x,int y){
		
		// Write your code here .
		
		int[] storage = new int[n+1];
		Arrays.fill(storage, -1);
		return solveH(n, x, y, storage) ==1 ?  "Beerus" : "Whis" ;
		
	}
	public static int solveH(int n,int x,int y,int[] storage){
		
		if(n==x || n==1 || n==y) {
			storage[n] = 1;
			return storage[n];
		}
		if(n<=0) {
			return 0;
		}
		if(storage[n]!=-1 ) {
			return storage[n];
		}
		int a = solveH(n-1, x, y, storage);
		int b = solveH(n-x, x, y, storage);
		int c = solveH(n-y, x, y, storage);
		
		storage[n] = Math.max(a^1, Math.max(b^1,c^1));
		return storage[n];
		
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println( solve( 4 ,2 ,3)   );
		
	}
	
}
