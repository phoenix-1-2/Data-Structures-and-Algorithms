
public class PostOrder {
	
	public static void postOrder(TreeNode<Integer> root) {
		
		if(root==null) {
			return ;
		}
		for(int i=0;i<root.children.size();i++) {
			postOrder(root.children.get(i));
		}
		System.out.print(root.data+" ");
		
	}

}
