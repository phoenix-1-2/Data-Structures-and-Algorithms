import java.util.ArrayList;

public class RootToNodePathBST {
	
	public static ArrayList<Integer> findPath(BinaryTreeNode<Integer> root, int data){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		
		if(root==null) {
			return new ArrayList<Integer>();
		}
		if( root.data == data ) {
			ArrayList<Integer> arrayList = new ArrayList<>();
			arrayList.add(data);
			return arrayList;
		}
		
		if(data < root.data) {
			
			ArrayList<Integer> leftArrayList = findPath(root.left, data);
			if(leftArrayList.size()!=0) {
				leftArrayList.add(root.data);
			}
			return leftArrayList;
			
		}
		if( data > root.data ) {
			
			ArrayList<Integer> rightArrayList = findPath(root.right, data);
			if(rightArrayList.size()!=0) {
				rightArrayList.add(root.data);
			}
			return rightArrayList;
		}
		return new ArrayList<Integer>();
		
		
		
	}

}
