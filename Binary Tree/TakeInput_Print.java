import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInput_Print {

	public static BinaryTreeNode<Integer> takeInputLevelWise(){

		Scanner scanner = new Scanner(System.in);
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>() ;
		int data = scanner.nextInt();
		BinaryTreeNode<Integer> root = null;
		if(data!=-1) {
			root = new BinaryTreeNode<Integer>(data);
			queue.add(root);
		}

		while(!queue.isEmpty()) {

			BinaryTreeNode<Integer> frontNode = queue.poll();
			data = scanner.nextInt();
			if(data!=-1) {
				BinaryTreeNode<Integer> leftNode = new BinaryTreeNode<Integer>(data);
				frontNode.left = leftNode;
				queue.add(frontNode.left);
			}
			data = scanner.nextInt();
			if(data!=-1) {
				BinaryTreeNode<Integer> rightNode = new BinaryTreeNode<Integer>(data);
				frontNode.right = rightNode;
				queue.add(frontNode.right);
			}

		}
		scanner.close();
		return root;

	}

	public static void printLevelWise(BinaryTreeNode<Integer> root){

		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		//		queue.add(null);
		while(!queue.isEmpty()) {

			BinaryTreeNode<Integer> frontNode = queue.poll();

			//			if(frontNode==null) {
			//				System.out.println();
			//				if(!queue.isEmpty()) {
			//					queue.add(null);
			//				}
			//			}
			//			else {
			System.out.print(frontNode.data+":");
			if(frontNode.left!=null) {
				System.out.print("L:"+frontNode.left.data+",");
				queue.add(frontNode.left);
			}
			else {
				System.out.print("L:"+-1+",");
			}
			if(frontNode.right!=null) {
				System.out.print("R:"+frontNode.right.data);
				queue.add(frontNode.right);
			}
			else {
				System.out.print("R:"+-1);
			}
			System.out.println();
			//			}

		}
	}

	public static BinaryTreeNode<Integer> takeInput(Scanner scanner){

		int data = scanner.nextInt();
		if(data==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
		root.left = takeInput(scanner);
		root.right = takeInput(scanner);
		return root;

	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		printLevelWise(root);
		scanner.close();
	}
	public static void print(BinaryTreeNode<Integer> root) {

		if(root==null) {
			return ;
		}
		System.out.print(root.data+":");
		if(root.left!=null) {
			System.out.print("L"+root.left.data+",");
		}
		if(root.right!=null) {
			System.out.print("R"+root.right.data+",");
		}
		System.out.println();
		print(root.left);
		print(root.right);

	}

}
