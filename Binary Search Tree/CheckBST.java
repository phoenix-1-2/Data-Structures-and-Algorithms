class Pair<T,V>{
	T first;
	V second;
	public Pair(T first,V second) {
		this.first = first;
		this.second = second;
	}
}
public class CheckBST {
	
	public static int minimum(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		return Math.min( root.data   ,  Math.min( minimum(root.left)  , minimum(root.right) ) );  
		
	}
	public static int maximum(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		return Math.max( root.data   ,  Math.max( maximum(root.left)  , maximum(root.right) ) );  
		
	}
	public static boolean isBST(BinaryTreeNode<Integer> root) {
	
		
//		if(root==null) {
//			return true;
//		}
//		int maxLeft = maximum(root.left);
//		int minRight = minimum(root.right);
//		
//		if(maxLeft < root.data && minRight > root.data ) {
//			return  isBST(root.left) && isBST(root.right) ;
//		}
//		return false;
		return isBSTBetter(root).second;
		
	}
	public static Pair< Pair<Integer,Integer>,Boolean > isBSTBetter(BinaryTreeNode<Integer> root){
		
		if(root==null) {
			Pair<Integer,Integer> innerPair = new Pair<>(Integer.MIN_VALUE, Integer.MAX_VALUE);
			Pair<Pair<Integer,Integer>,Boolean> ansPair = new Pair<>(innerPair, true);
			return ansPair;
		}
		
		Pair<Pair<Integer,Integer>,Boolean> leftAns = isBSTBetter(root.left);
		Pair<Pair<Integer,Integer>,Boolean> rightAns = isBSTBetter(root.right);
		
		int max = Math.max( Math.max(leftAns.first.first,  rightAns.first.first ) , root.data );
		int min = Math.min( Math.min(leftAns.first.second,  rightAns.first.second ) , root.data );
		
		boolean isBst= leftAns.second && rightAns.second && ( leftAns.first.first < root.data)
				&& ( rightAns.first.second > root.data );
		
		Pair<Integer,Integer> innePair = new Pair<>(max,min);
		Pair<Pair<Integer,Integer>,Boolean> ansPair = new Pair<>(innePair, isBst);
		
		return ansPair;
		
	}
	
  	public static boolean isBSTBetter2( BinaryTreeNode<Integer> root,int a ,int b ) {
		
		if(root==null) {
			return true;
		}
		
		if( root.data < a || root.data >b ) {
			return false;
		}
		return isBSTBetter2(root.left, a, root.data) && isBSTBetter2(root.right, root.data, b) ;
		
		
	}
}
