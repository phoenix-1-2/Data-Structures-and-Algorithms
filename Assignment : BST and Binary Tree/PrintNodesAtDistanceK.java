
public class PrintNodesAtDistanceK {
	
    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root,int node,int k) {
        nodesAtDistanceKWithRootDistance(root, node, k);
    }
    public static int nodesAtDistanceKWithRootDistance(BinaryTreeNode<Integer> root,int node,int k) {
        if(root==null)
            return -1;

        if(root.data == node) {

            printNodesDown(root,k);
            return 0;
        }
        int leftHeight = nodesAtDistanceKWithRootDistance(root.left, node, k);
        if(leftHeight!=-1) {
            if(leftHeight+1 == k) {
                System.out.println(root.data);
            }
            else {
                printNodesDown(root.right, k-leftHeight-2);
                
            }
            return leftHeight+1;
        }
        int rightHeight = nodesAtDistanceKWithRootDistance(root.right, node, k);
        if(rightHeight!=-1) {
            if(rightHeight+1 == k) {
                System.out.println(root.data);
            }
            else {
                printNodesDown(root.left, k-rightHeight-2);
            }
            return rightHeight+1;
        }
        return -1;

    }
    private static void printNodesDown(BinaryTreeNode<Integer> root, int k) {
        if(root==null) {
            return ;
        }
        if(k==0) {
            System.out.println(root.data);
            return ;
        }
        printNodesDown(root.left, k-1);
        printNodesDown(root.right, k-1);
    }

}
