
public class StackUsingLL<T> {

	private LinkedListNode<T> head;
	private int size;

	public StackUsingLL() {
		head = null;
		size =0;
	}

	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public T top() throws StackEmptyException {
		if(isEmpty()) {
			throw new StackEmptyException();
		}
		return head.data;
	}
	public void push(T data) {
		
		LinkedListNode<T> newNode = new LinkedListNode<T>(data);
		if(head==null) {
			head = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
		size++;
		
	}
	
	public T pop() throws StackEmptyException {
		if(isEmpty()) {
			throw new StackEmptyException();
		}
		size--;
		T data = head.data;
		head = head.next;
		return data;
		
	}


}
