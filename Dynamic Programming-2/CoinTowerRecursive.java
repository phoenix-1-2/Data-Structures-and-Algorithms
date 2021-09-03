package CoinTower;

public class CoinTowerRecursive {

	public  String solve(int n,int x,int y){

		// Write your code here .

		if(solveH(n,x,y)==1){
			return "Beerus";
		}
		return "Whis";


	}
	public  int solveH(int n,int x,int y){

		// Write your code here .
		if( n<=0 ){
			return 0;
		}

		if(n==1){
			return 1;
		}
		if(n==x){
			return 1;
		}
		if(n==y){
			return 1;
		}

		int a =  solveH(n-x,x,y)^1 ;
		int b = solveH(n-1,x,y)^1;
		int c = solveH(n-y,x,y)^1 ;

		return Math.max(a,Math.max(b,c));





	}

}
