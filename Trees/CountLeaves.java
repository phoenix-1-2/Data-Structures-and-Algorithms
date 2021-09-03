
public class CountLeaves {
	
	public static int countLeafNodes(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		if(root.children.size()==0) {
			return 1;
		}
		int sum=0;
		for(int i=0;i<root.children.size();i++) {
			sum+=countLeafNodes(root.children.get(i));
		}
		return sum;
	}
	public static void main(String[] args) {
		TreeNode<Integer> root = Input_Output.takeInputLevelWise();
		System.out.println(
				countLeafNodes(root)
				);
	}
}
