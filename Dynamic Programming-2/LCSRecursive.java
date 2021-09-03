package LCS;

import java.util.Scanner;

public class LCSRecursive {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String s2 = s.nextLine();
		String s1 = s.nextLine();
		System.out.println( longestConsecutiveSubsequence(s1, s2) );
	}
	
	public static int longestConsecutiveSubsequence(String s,String t) {
		
		if(s.length()==0 || t.length()==0) {
			return 0;
		}
		if(s.charAt(0) == t.charAt(0)) {
			return 1+ longestConsecutiveSubsequence(s.substring(1),t.substring(1));
		}
		return  Math.max( longestConsecutiveSubsequence(s, t.substring(1)) ,
				Math.max(longestConsecutiveSubsequence(s.substring(1), t),
						longestConsecutiveSubsequence(s.substring(1), t.substring(1)))
				
				);
				
		
	}

}
