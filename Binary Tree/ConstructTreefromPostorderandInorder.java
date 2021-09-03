
public class ConstructTreefromPostorderandInorder {

	public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] post,
			int[] in){

		// Write your code here
		return getTreeFromPostorderAndInorder(post, in, 0, post.length-1, 0, in.length -1);

	}
	public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] post,
			int[] in,int postSI,int postEI,int inSI,int inEI){

		if( inSI>inEI || postSI>postEI ) {
			return null;
		}

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>( post[postEI]  );

		int index=0;
		for(int i=inSI;i<=inEI;i++) {
			if(post[postEI] == in[i]) {
				index = i;
				break;
			}
		}

		int leftPostSI=postSI ;
		int leftPostEI= postSI + index - inSI -1;
		int rightPostSI= leftPostEI + 1 ;
		int rightPostEI= postEI-1;

		int leftInSI=inSI;
		int leftInEI=index - 1;
		int rightInSI=index + 1;
		int rightInEI=inEI;

		root.left = getTreeFromPostorderAndInorder(post, in, leftPostSI, leftPostEI, leftInSI, leftInEI);
		root.right = getTreeFromPostorderAndInorder(post, in, rightPostSI, rightPostEI, rightInSI, rightInEI);
		return root;

	}

}
