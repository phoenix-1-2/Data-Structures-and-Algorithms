
public class Fibonacci {

	public static int fibonacci(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	public static int fibonaciDP(int n) {
		int[] storage = new int[n+1];
		storage[0]=0;
		storage[1]=1;
		for(int i=2;i<=n;i++) {
			storage[i] = storage[i-1] + storage[i-2];
		}
		return storage[n];
	}
	public static int fibonacciMemo(int n) {
		int[] storage= new int[n+1];
		for(int i=0;i<n+1;i++) {
			storage[i] = -1;
		}
		return fibonacciMemo(n, storage);
	}
	public static int fibonacciMemo(int n,int[] storage) {
		if(n==0 || n==1) {
			storage[n] = n;
			return n;
		}
		if(storage[n]!=-1) {
			return storage[n];
		}
		storage[n] = fibonacciMemo(n-1,storage) + fibonacciMemo(n-2, storage);
		return storage[n];

	}

	public static void main(String[] args) {
		int n = 25;
		System.out.println( fibonacci(n)  );
	}

}
