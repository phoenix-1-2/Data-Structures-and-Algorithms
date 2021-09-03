package LongestIncreasingSubsequence;

import java.util.Scanner;

public class LongestIncreasingSubsequenceDP {


	public static int lis(int arr[]) {

		int[] storage = new int[arr.length];
		storage[0] =1;

		for(int i=1;i<arr.length;i++) {
			int max = 0;
			for(int j=i-1;j>=0;j--) {

				if(arr[i] > arr[j] && max < storage[j] ) {
					max = storage[j];
				}

			}
			storage[i] = max +1;

		}
		int max = Integer.MIN_VALUE;
		for(int i : storage) {
			max =  max < i ? i : max ;
		}
		return max;


	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = s.nextInt();
		}
		System.out.println(lis(arr));

	}

}
