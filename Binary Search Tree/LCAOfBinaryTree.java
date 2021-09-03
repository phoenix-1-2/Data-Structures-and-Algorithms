
public class LCAOfBinaryTree {
	
	public static int lcaBinaryTree(BinaryTreeNode <Integer> root , int a, int b){
		if(root==null) {
			return -1;
		}
		if(root.data==a || root.data==b) {
			return root.data;
		}
		int leftLca = lcaBinaryTree(root.left, a, b);
		int rightLca = lcaBinaryTree(root.right, a, b);
		if(leftLca==-1 && rightLca ==-1) {
			return -1;
		}
		else if(leftLca==-1) {
			return rightLca;
		}
		else if(rightLca==-1) {
			return leftLca;
		}
		else {
			return root.data;
		}
	} 

}
