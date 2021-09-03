class Pair<T,V>{
	T first;
	V second;
}
public class DiameterOfBT {

	public static Pair<Integer,Integer> diameterOfBT(BinaryTreeNode<Integer> root){
		
		if(root ==null) {
			Pair<Integer,Integer> pair = new Pair<>();
			pair.first = 0;
			pair.second = 0;
			return pair;
		}
		
		Pair<Integer,Integer> leftPair = diameterOfBT(root.left);
		Pair<Integer,Integer> rightPair = diameterOfBT(root.right);
		
		Pair<Integer,Integer> ansPair = new Pair<>();
		ansPair.first = Math.max(leftPair.first , rightPair.first)+1 ;
		ansPair.second = Math.max(leftPair.first + rightPair.first,  Math.max(leftPair.second, rightPair.second) );
		return ansPair;
		
	}
	
	public static int diameter(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return 0;
		}
		int op1 = height(root.left) + height(root.right);
		int op2 = diameter(root.left);
		int op3 = diameter(root.right);
		return Math.max(op1,  Math.max(op2,op3 ));
		
	}
	public static int height(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		return Math.max(height(root.left), height(root.right)) + 1;
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInput_Print.takeInputLevelWise();
		System.out.println(
				diameterOfBT(root).second
				);
		
	}
}
