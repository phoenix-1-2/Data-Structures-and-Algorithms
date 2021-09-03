
public class BinaryTreeFns {

	public static void mirror(BinaryTreeNode<Integer> root){

		if(root==null) {
			return ;
		}
		
		mirror(root.left);
		mirror(root.right);
		BinaryTreeNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		
		
	}


	public static int height(BinaryTreeNode<Integer> root) {

		if(root==null) {
			return 0;
		}
		return Math.max( height(root.left) , height(root.right) )  + 1;

	}

	public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x){

		if(root==null) {
			return false;
		}
		if(root.data==x) {
			return true;
		}
		return isNodePresent(root.left, x) || isNodePresent(root.right, x);

	} 

	public static int count(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		return count(root.left) + count(root.right) + 1;
	}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInput_Print.takeInputLevelWise();
		System.out.println(
				count(root)
				);
	}

}
