package MatrixChainMultiplication;

import java.util.Arrays;
import java.util.Scanner;

public class MCMMemo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int p[] = new int[n + 1];
		for(int i = 0; i <= n; i++){
			p[i] = s.nextInt();
		}
		System.out.println(mcm(p));
	}


	static int mcm(int[] p ) {
		int[][] storage = new int[p.length + 1][p.length + 1];
		for(int[] i : storage) {
			Arrays.fill(i, -1);
		}
		return mcm(p,0,p.length-1,storage);
	}
	static int mcm(int[] p,int si,int ei,int[][] storage) {
		if(si==ei || si==ei-1 ) {
			storage[si][ei] = 0;
			return storage[si][ei];
		}
		if(storage[si][ei]!=-1) {
			return storage[si][ei];
		}
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		for(int i=si+1;i<ei;i++) {
			int c = mcm(p, si, i, storage) + mcm(p, i, ei, storage);
			if(min > c) {
				min = c;
				minIndex = i;
			}
		}
		storage[si][ei] = p[si] * p[minIndex]*p[ei] + min;
		return storage[si][ei];

	}

}
