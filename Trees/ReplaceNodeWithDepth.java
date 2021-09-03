
public class ReplaceNodeWithDepth {

	public static void replaceWithDepthValue(TreeNode<Integer> root){

		// Write your code here
		replaceWithDepthValue(root, 0);
		
	}
	public static void replaceWithDepthValue(TreeNode<Integer> root,int depth){

		// Write your code here
		if(root==null) {
			return ;
		}
		root.data = depth;
		for(int i=0;i<root.children.size();i++) {
			replaceWithDepthValue(root.children.get(i),depth+1);
		}
		
		
	}
	
}
