
public class LCAOfBST {
	
	public static int lcaInBST(BinaryTreeNode<Integer> root , int a , int b){
		
		if(root==null) {
			return -1;
		}
		if(a < root.data && b < root.data ) {
			return lcaInBST(root.left, a, b);
		}
		if(a>root.data && b > root.data) {
			return lcaInBST(root.right, a, b);
		}
		if(root.data == a || root.data == b) {
			return root.data;
		}
		int leftLca = lcaInBST(root.left, a, b);
		int rightLca = lcaInBST(root.right, a, b);
		if(leftLca==-1 && rightLca==-1) {
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
