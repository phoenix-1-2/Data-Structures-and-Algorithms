import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Input_Output {
	
	public static TreeNode<Integer> takeInputLevelWise(){
		Scanner scanner = new Scanner(System.in);
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		int data = scanner.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(data);
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode<Integer> frontNode = queue.poll();
			int childCount = scanner.nextInt();
			for(int i=0;i<childCount;i++) {
				data = scanner.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>(data);
				frontNode.children.add(child);
				queue.add(child);
			}			
		}
		return root;
	}
	public static TreeNode<Integer> takeInput(Scanner scanner){
		
		
		int data = scanner.nextInt();
		int childCount = scanner.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(data);
		for(int i=0;i<childCount;i++) {
			TreeNode<Integer> childNode = takeInput(scanner);
			root.children.add(childNode);
		}
		return root;
	}
	public static void printLevelWise(TreeNode<Integer> root) {
		if(root==null) {
			return ;
		}
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);
		while(!queue.isEmpty()) {
			TreeNode<Integer> frontNode = queue.poll();
			if(frontNode==null) {
				System.out.println();
				if(!queue.isEmpty()) {
					queue.add(null);
				}
			}else {
				System.out.print(frontNode.data+" ");
				for(int i=0;i<frontNode.children.size();i++) {
//					System.out.print(frontNode.children.get(i).data+",");
					queue.add(frontNode.children.get(i));
				}
			}
		}
		
	}
	
	public static void print(TreeNode<Integer> root) {
		if(root==null) {
			return ;
		}
		System.out.print(root.data+":");
		for(int i=0;i<root.children.size();i++) {
			System.out.print(root.children.get(i).data+",");
		}
		System.out.println();
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TreeNode<Integer> rooTreeNode = takeInputLevelWise();
		printLevelWise(rooTreeNode);
	}
}
