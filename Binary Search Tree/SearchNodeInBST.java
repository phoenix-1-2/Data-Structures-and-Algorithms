
public class SearchNodeInBST {
	
	public static BinaryTreeNode<Integer> searchInBST(BinaryTreeNode<Integer> root , int k){

        if(root==null){
            return null;
        }
        if(root.data == k){
            return root;
        }
        if(root.data < k){
            return searchInBST(root.right,k);
        }
        return searchInBST(root.left,k);
	}

}
