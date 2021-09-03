package AllWays;

public class AllWaysRecursion {

	public static int allWays(int x, int n) {

		return allWays(x,n,1);
	}
	public static int allWays(int x, int n,int num) {

		int val = x -(int)Math.pow(num,n);
		if(val==0){
			return 1;
		}
		if(val<0){
			return 0;
		}
		return allWays(x,n,num+1)  + allWays(val,n,num+1); 


	}

}
