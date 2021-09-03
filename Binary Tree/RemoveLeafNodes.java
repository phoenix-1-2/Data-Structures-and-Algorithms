
public class RemoveLeafNodes {

	public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){

		// Write your code here
		if(root==null) {
			return root;
		}
		
		if(root.left==null && root.right ==null) {
			return null;
		}
		
		root.left = removeAllLeaves(root.left);
		root.right = removeAllLeaves(root.right);
		
		return root;

	}


}
