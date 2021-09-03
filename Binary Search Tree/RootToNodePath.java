import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RootToNodePath {
	
	static Scanner s = new Scanner(System.in);
	
	public static BinaryTreeNode<Integer> takeInput(){
		Queue<BinaryTreeNode<Integer>>  pendingNodes = new LinkedList<BinaryTreeNode<Integer>>(); 
		int rootData = s.nextInt();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.add(root);

		while(!pendingNodes.isEmpty()){
			BinaryTreeNode<Integer> currentNode;
//			try {
				currentNode = pendingNodes.poll();
//			} 
			int leftChildData = s.nextInt();
			if(leftChildData != -1){
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
				currentNode.left = leftChild;
				pendingNodes.add(leftChild);
			}
			int rightChildData = s.nextInt();
			if(rightChildData != -1){
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
				currentNode.right = rightChild;
				pendingNodes.add(rightChild);
			}
		}
		return root;
	}
	
	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = takeInput();
		
		ArrayList<Integer> arrayList = getRootToNodePath(root, 13);
		
		for(int i : arrayList) {
			System.out.print(i+" ");
		}
		
		
	}
	

	public static ArrayList<Integer> getRootToNodePath(BinaryTreeNode<Integer> root,int nodeData){
		
		
		if(root==null) {
			return new ArrayList<Integer>();
		}
		if(root.data == nodeData) {
			 ArrayList<Integer> arrayList = new ArrayList<>();
			 arrayList.add(nodeData);
			 return arrayList;
		}
		
		ArrayList<Integer> leftArrayList = getRootToNodePath(root.left, nodeData);
		ArrayList<Integer> rightArrayList = getRootToNodePath(root.right, nodeData);
		
		if(leftArrayList.size()==0 && rightArrayList.size()==0) {
			return new ArrayList<Integer>();
		}
		
		if(leftArrayList.size()==0) {
			
			rightArrayList.add(0, root.data);
			return rightArrayList;
		}
		if(rightArrayList.size()==0) {
			leftArrayList.add(0, root.data);
			return leftArrayList;
		}
		return new ArrayList<Integer>();
		
		
		
		
		
	}
	
}
