
public class PrintAtK {
	
	
	public static void printAtDepthK(TreeNode<Integer> root,int k) {
		
		if(root==null) {
			return ;
		}
		if(k<0) {
			return ;
		}
		if(k==0) {
			System.out.print(root.data+" ");
			return ;
		}
		for(int i=0;i<root.children.size();i++) {
			printAtDepthK(root.children.get(i), k-1);
		}
		
	}
	
	public static void main(String[] args) {
		TreeNode<Integer> root = Input_Output.takeInputLevelWise();
//		System.out.println(height(root));
		printAtDepthK(root, 0);
	}

}
