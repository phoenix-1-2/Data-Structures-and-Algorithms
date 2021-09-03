import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Node<T>{
	T data;
	Node<T> next;
	Node(T data){
		this.data = data;
	}
}
public class LevelWiseLinkedlist {

	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {

		ArrayList<Node<BinaryTreeNode<Integer>>> arr = new ArrayList<>();
		Node<BinaryTreeNode<Integer>> head = null,tail = null;
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);
		while(!queue.isEmpty()) {

			BinaryTreeNode<Integer> frontNode = queue.poll();
			if(frontNode==null) {
				arr.add(head);
				head = tail = null;
				if(!queue.isEmpty()) {
					queue.add(null);
				}

			}
			else {
				Node<BinaryTreeNode<Integer>>  newNode = new Node<>(frontNode);
				if(head==null) {
					head = newNode;
					tail=newNode;
				}
				else {
					tail.next = newNode;
					tail = newNode;
				}
				if( frontNode.left!=null ) {
					queue.add(frontNode.left);
				}
				if(frontNode.right!=null) {
					queue.add(frontNode.right);
				}
			}

		}
		return arr;

	}

}
