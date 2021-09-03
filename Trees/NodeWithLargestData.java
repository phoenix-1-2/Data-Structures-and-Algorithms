
public class NodeWithLargestData {

	public static int nodeWithLargestData(TreeNode<Integer> root) {
		
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int maxData = root.data;
		for(int i=0;i < root.children.size();i++) {
			int max = nodeWithLargestData(root.children.get(i));
			if(maxData< max ) {
				maxData = max;
			}
			
		}
		return maxData;
		
	}
	
	public static void main(String[] args) {
		TreeNode<Integer> root = Input_Output.takeInputLevelWise();
		System.out.println(nodeWithLargestData(root));
	}
	
}
