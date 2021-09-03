
public class SumOfAllNodes {
	
	public static int sum(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		return root.data + sum(root.left) + sum(root.right);
	}

}
