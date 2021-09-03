package LCS;

import java.util.Scanner;

public class LCSDp {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String s2 = s.nextLine();
		String s1 = s.nextLine();
		System.out.println( longestConsecutiveSubsequence(s1, s2) );
	}

	public static int longestConsecutiveSubsequence(String s1, String s2) {
		
		int m = s1.length();
		int n = s2.length();
		int[][] storage = new int[m+1][n+1];
		
		for(int i=0;i<=m;i++)
			storage[i][0] = 0;
		for(int j=0;j<=n;j++)
			storage[0][j] = 0;
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(s1.charAt(m-i) == s2.charAt(n-j) ) {
					storage[i][j] = 1 + storage[i-1][j-1];
				}
				else {
					storage[i][j] =Math.max(storage[i-1][j], storage[i][j-1]);
				}
			}
		}
		return storage[m][n];
		
		
	}
	
	

}
