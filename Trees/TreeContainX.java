
public class TreeContainX {

	public static boolean treeContainX(TreeNode<Integer> root,int x) {
		
		if(root==null) {
			return false;
		}
		if(root.data == x) {
			return true;
		}
		for(int i=0;i<root.children.size();i++) {
			
			if( treeContainX(root.children.get(i), x) ) {
				return true;
			}
			
		}
		return false;
		
	}
	
}
