
public class numNodeGreater {

	public static int numNodeGreater(TreeNode<Integer> root,int x){
		
		if(root==null) {
			return 0;
		}
		int nodesGreater = 0;
		for(int i=0;i<root.children.size();i++) {
			 nodesGreater+=numNodeGreater(root.children.get(i), x);
			
		}
		if(root.data > x) {
			return nodesGreater + 1;
		}
		return nodesGreater;
		
		
	}
	
	public static void main(String[] args) {
		TreeNode<Integer> root = Input_Output.takeInputLevelWise();
		System.out.println(numNodeGreater(root, 20));
	}
}
