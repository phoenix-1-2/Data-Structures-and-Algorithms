
public class RootToLeafPathsSumToK {
	
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {

        rootToLeafPathsSumToK(root, k,"");

    }
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k,String output) {

    	 if(root==null){
             return ;
         }
    	
        if(k==root.data) {
            System.out.println(output+root.data);
            return ;
        }
       
        rootToLeafPathsSumToK(root.left, k - root.data, output + root.data+" " );
        rootToLeafPathsSumToK(root.right, k - root.data, output + root.data+" " );


    }
}
