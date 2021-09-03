package LCS;

import java.util.Arrays;
import java.util.Scanner;

public class LCSMemo {

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
		for(int[] i : storage) {
			Arrays.fill(i, -1);
		}
		return longestConsecutiveSubsequence(s1, s2,storage);
	}

	private static int longestConsecutiveSubsequence(String s1, String s2, int[][] storage) {

		int m = s1.length();
		int n = s2.length();
		if(storage[m][n]!=-1) {
			return storage[m][n];
		}
		if(m==0 || n==0) {
			storage[m][n] = 0;
			return storage[m][n];
		}

		if(s1.charAt(0)==s2.charAt(0)) {
			storage[m][n] = 1+ longestConsecutiveSubsequence(s1.substring(1), s2.substring(1), storage);
			return storage[m][n];
		}
		storage[m][n] = Math.max( longestConsecutiveSubsequence(s1.substring(1), s2, storage) ,
				longestConsecutiveSubsequence(s1, s2.substring(1), storage));
		return storage[m][n];

	}

}
