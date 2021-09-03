
public class ReplaceWithLargerNodesSum {

	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		helper(root,0);
	}
	public static int helper(BinaryTreeNode<Integer> root,int sum) {

		if(root==null) {
			return 0;
		}
		int sumOfGreaterNodes = helper(root.right,sum);
		int temp = root.data;
		root.data += sumOfGreaterNodes + sum;
		int leftSum  = helper(root.left,root.data);
		return temp + leftSum+ sumOfGreaterNodes ;


	}

}
