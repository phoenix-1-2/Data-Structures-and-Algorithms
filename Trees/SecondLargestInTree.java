
public class SecondLargestInTree {

	public static void change(TreeNode<Integer> root,int m) {

		if(root==null) {
			return ;
		}
		if(root.data == m) {
			root.data = Integer.MIN_VALUE;
		}
		for(int i=0;i<root.children.size();i++) {
			change(root.children.get(i), m);
		}

	}

	public static TreeNode<Integer> largest(TreeNode<Integer> rootNode ) {
		if(rootNode==null) {
			return rootNode;
		}
		int max =rootNode.data;
		TreeNode<Integer> maxNode = rootNode;
		for(int i=0;i<rootNode.children.size();i++) {
			TreeNode<Integer> large = largest(rootNode.children.get(i));
			if(large == null){
				continue;
			}
			if(max <large.data) {
				max = large.data;
				maxNode = large;
			}
		}
		return maxNode;
	}

	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> rootNode) {
		if(rootNode==null) {
			return null;
		}
		int largest = largest(rootNode).data;

		change(rootNode, largest);

		return largest(rootNode);
	}

}
