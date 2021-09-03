
public class BalancedBinaryTrees {
	
	public static int balancedTreesOfHeightH(int height){
		
		if(height == 0 || height == 1) {
			return 1;
		}
		int mod = (int)Math.pow(10, 9) + 7;
		long x = (long)balancedTreesOfHeightH(height-1);
		long y = (long)balancedTreesOfHeightH(height-2);
		
		long x_2 = (x*x)%mod;
		long x_y = (x*y)%mod;
		long x_y_2 = (2*x_y)% mod ;
		return (int)(x_2+x_y_2)%mod;
		

	}
	public static int balancedTreesOfHeightHDP(int height){
		int mod = (int)Math.pow(10, 9) + 7;
		int[] storage  = new int[height + 1];
		storage[0]=1;
		storage[1]=1;
		for(int i=2;i<=height;i++) {
			long x =(long) storage[i-1];
			long y = (long)storage[i-2];
			
			long x_2 =(x*x)% mod;
			long x_y_2 = (2*x*y)% mod;
			storage[i] = (int)(x_2+x_y_2)%mod;
		}
		return storage[height];

	}
	public static void main(String[] args) {
		System.out.println(balancedTreesOfHeightHDP(6) );
	}

}
