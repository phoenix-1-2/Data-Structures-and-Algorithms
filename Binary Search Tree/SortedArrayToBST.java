
public class SortedArrayToBST {

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr,int si,int ei){
		
		if(si>ei) {
			return null;
		}
		int mid = (si+ei)/2;
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
		root.left = SortedArrayToBST(arr,si,mid-1);
		root.right = SortedArrayToBST(arr, mid+1, ei);
		return root;
		
		
		
	}
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr){
		
		return SortedArrayToBST(arr,0,arr.length-1);
		
	}
	
}
