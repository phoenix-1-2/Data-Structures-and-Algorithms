
public class FindNextLargerNode {
	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
		if(root==null) {
			return root;
		}
		int min=Integer.MAX_VALUE;
		TreeNode<Integer> minNode = null;
		for(int i=0;i<root.children.size();i++) {
			
			TreeNode<Integer> maxNode = findNextLargerNode(root.children.get(i), n);
			if(maxNode==null) {
				continue;
			}
			int max = maxNode.data;
			if(min>max) {
				min = max;
				minNode = maxNode;
			}
		}
		if( root.data > n && root.data < min ) {
			return root;
		}
		return minNode;
		
	}

}
