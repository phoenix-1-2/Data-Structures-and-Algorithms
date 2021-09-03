
public class FindNumberOfNodes {
	
	public static int findCount(TreeNode<Integer> root) {
		
		if(root == null) {
			return 0;
		}
		int count =1;
		for(int i=0;i<root.children.size();i++) {
			count += findCount(root.children.get(i));
		}
		return count;
		
		
	}
	
	public static int sumOfNodes(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int sum = root.data;
		for( TreeNode<Integer> childNode : root.children ) {
			sum+= sumOfNodes(childNode);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		TreeNode<Integer> root = Input_Output.takeInputLevelWise();
		System.out.println(sumOfNodes(root));
	}

}
