
public class PrintNodesWithoutSiblings {


	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {

		if(root==null) {
			return ;
		}

		if(root.left!=null && root.right ==null) {
			System.out.println(root.left.data);
		}
		if(root.left==null && root.right !=null) {
			System.out.println(root.right.data);
		}
		printNodesWithoutSibling(root.left);
		printNodesWithoutSibling(root.right);


	}

}
