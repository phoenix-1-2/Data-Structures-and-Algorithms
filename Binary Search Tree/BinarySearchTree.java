
public class BinarySearchTree {
	
	BinaryTreeNode<Integer> root;
	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	public boolean search(int data) {
		return search(root,data);
	}
	public boolean search(BinaryTreeNode<Integer> root, int data) {
		if(root==null)
			return false;
		if(root.data == data) {
			return true;
		}
		if(data < root.data) {
			return search(root.left,data);
		}
		return search(root.right,data);
		
	}
	public void insertData(int data) {
		root = insert(root,data);
	}
	public BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root,int data) {
		if(root==null) {
			BinaryTreeNode<Integer> newNode =  new BinaryTreeNode<Integer>(data);
			return newNode;
		}
		if(data < root.data) {
			root.left = insert(root.left, data);
		}
		else {
			root.right = insert(root.right,data);
		}
		return root;
	}
	
	public void deleteData(int data ) {
		root = delete(root,data);
	}
	public BinaryTreeNode<Integer> delete(BinaryTreeNode<Integer> root,int data){
		
		if(root==null) {
			return null;
		}
		if( root.data==data ) {
			
			if(root.left==null && root.right==null) {
				return null;
			}
			else if(root.left==null) {
				
				return root.right;
				
			}
			else if(root.right==null) {
				return root.left;
			}
			else {
				
				// inorder succeesor i.e. Right Subtree  Min 
				
				BinaryTreeNode<Integer> temp = root.right;
				while(temp.left!=null) {
					temp = temp.left;
				}
				int tempData = temp.data;
				root.data = tempData;
				root.right = delete(root.right,tempData);
				return root;
			}
			
		}
		
		
		
		if( data < root.data ) {
			
			root.left = delete(root.left, data);
			
		}
		else {
			root.right  = delete(root.right, data);
		}
		return root;
		
		
	}
	public void printTree() {
		printTree(root);
	}
	
	public void printTree(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return ;
		}
//		N:L:x,R:y
		System.out.print(root.data+":");
		if(root.left!=null) {
			System.out.print("L:"+root.left.data+",");
		}
		if(root.right!=null) {
			System.out.print("R:"+root.right.data);
		}
        System.out.println();
		printTree(root.left);
		printTree(root.right);
		
		
		
	}

}
