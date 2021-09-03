
public class MinStepsTo1 {

	public static int countStepsTo1(int n){

		if(n==1) {
			return 0;
		}
		int min = countStepsTo1(n-1);
		if(n%2==0) {
			min = Math.min(min, countStepsTo1(n/2));
		}
		if(n%3==0) {
			min = Math.min(min, countStepsTo1(n/3));
		}
		return min + 1;
	}
	public static int countStepsTo1Memo(int n) {

		int[] storage = new int[n+1];
		return countStepsTo1Memo(n,storage);
	}
	public static int countStepsTo1Memo(int n , int[] storage) {
		if(n<=1) {
			storage[n] = 0;
			return storage[n];
		}
		if(storage[n]!=0) {
			return storage[n];
		}

		int count1 = countStepsTo1Memo(n-1, storage);
		int count2= Integer.MAX_VALUE;
		int count3= Integer.MAX_VALUE;
		if(n%2==0) {
			count2= countStepsTo1Memo(n/2, storage);
		}
		if(n%3==0) {
			count3 = countStepsTo1Memo(n/3, storage);
		}
		storage[n] = Math.min(count1, Math.min(count2, count3)) +1;
		return storage[n];


	}
	public static int countStepsTo1DP(int n) {
		int[] storage = new int[n+1];
		storage[0] = 0;
		storage[1] = 0;
		for(int i=2;i<=n;i++) {
			int count1= Integer.MAX_VALUE,count2=Integer.MAX_VALUE,count3=Integer.MAX_VALUE;
			count1 = storage[i-1];
			if(i%2==0)
				count2 = storage[i/2];
			if(i%3==0)
				count3 = storage[i/3];
			
			storage[i] = Math.min(count1, Math.min(count2, count3)) + 1;

		}
		return storage[n];
	}
	
	public static void main(String[] args) {
		System.out.println(countStepsTo1(1000));
		System.out.println(countStepsTo1Memo(1000));
		System.out.println(countStepsTo1DP(1000));
	}

}
