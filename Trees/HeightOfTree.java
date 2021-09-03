
public class HeightOfTree {
	
	public static int height(TreeNode<Integer> root){
		if(root==null) {
			return 0;
		}
		int maxHeight = 0;
		for(int i=0;i<root.children.size();i++) {
			int max = height(root.children.get(i));
			if(maxHeight< max ) {
				maxHeight = max;
			}
		}
		return maxHeight + 1;
	}
	public static void main(String[] args) {
		TreeNode<Integer> root = Input_Output.takeInputLevelWise();
		System.out.println(height(root));
	}

}
