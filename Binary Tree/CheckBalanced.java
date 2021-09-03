
public class CheckBalanced {
	
	public static boolean checkBalanced(BinaryTreeNode<Integer> root){
		
		if(root==null) {
			return true;
		}
		int leftheight = height(root.left);
		int rightheight = height(root.right);
		if( Math.abs(leftheight-rightheight) > 1 ) {
			return false;
		}
		return checkBalanced(root.left) && checkBalanced(root.right);
		
	}
	public static int height(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return 0;
		}
		return Math.max( height(root.left)  , height(root.right) ) + 1;
		
	}

}
