class LinkedListNode<T>{
	T data;
	LinkedListNode<T> next;
	public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
	}
}
class Pair1<T,V>{
	T first;
	V second;
	public Pair1(T first,V second) {
		this.first = first;
		this.second = second;
	}
}
public class BSTToSortedLL {

	public static LinkedListNode<Integer> BSTToSortedLL(BinaryTreeNode<Integer> root){

		return BSTToSortedLL2(root).first;

	}
	public static Pair1<LinkedListNode<Integer>,LinkedListNode<Integer>> BSTToSortedLL2(BinaryTreeNode<Integer> root){

		if( root==null ) {
			Pair1<LinkedListNode<Integer>,LinkedListNode<Integer>> ansPair1 = new Pair1<LinkedListNode<Integer>, LinkedListNode<Integer>>(null, null);
			return ansPair1;
		}
		Pair1<LinkedListNode<Integer>,LinkedListNode<Integer>> leftPair = BSTToSortedLL2(root.left);
		Pair1<LinkedListNode<Integer>,LinkedListNode<Integer>> rightPair = BSTToSortedLL2(root.right);
		LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(root.data);

		if(leftPair.second!=null)
			leftPair.second.next = newNode;
		else
			leftPair.first = newNode;
		if(rightPair.first!=null)
			newNode.next = rightPair.first;
		else
			rightPair.second = newNode;
		Pair1<LinkedListNode<Integer>,LinkedListNode<Integer>> ansPair = new Pair1<LinkedListNode<Integer>, LinkedListNode<Integer>>(leftPair.first, rightPair.second);
		return ansPair;

	}

}
