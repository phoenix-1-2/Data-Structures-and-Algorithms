public class ConstructTreeFromPre_Inorder {

	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre,int[] in){

		return getTreeFromPreorderAndInorder(pre, in, 0, pre.length-1, 0, in.length-1);

	}
	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre,int[] in
			,int preSI,int preEI,int inSI,int inEI){


		if( inSI>inEI || preSI>preEI  ) {
			return null ;
		}
		int mid = 0;
		int data = pre[preSI];
		for(int i=inSI;i<=inEI;i++) {
			if(in[i]==data) {
				mid = i;
				break;
			}
		}
		
		
		
		int leftPreSI = preSI + 1 ;
		int leftPreEI = leftPreSI + mid-inSI -1;
		int leftInSI = inSI;
		int leftInEI = mid-1;
		int rightPreSI = leftPreEI + 1;
		int rightPreEI = preEI;
		int rightInSI = mid + 1;
		int rightInEI = inEI;
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>( pre[preSI] );
		root.left = getTreeFromPreorderAndInorder(pre, in, leftPreSI, leftPreEI, leftInSI, leftInEI);
		root.right = getTreeFromPreorderAndInorder(pre, in, rightPreSI, rightPreEI, rightInSI, rightInEI);
		return root;
	}
}
