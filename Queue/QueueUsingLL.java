
public class QueueUsingLL<T> {

	private LinkedListNode<T> head;
	private LinkedListNode<T> tail;
	private int size;
	
	public QueueUsingLL() {
		// TODO Auto-generated constructor stub
		head=null;
		tail=null;
		size=0;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public T front() throws QueueEmptyException {
		
		if(isEmpty()) {
			throw new QueueEmptyException();
		}
		return head.data;
		
	}
	public void enqueue(T data) {
		LinkedListNode<T> newNode = new LinkedListNode<T>(data);
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
		size ++;
	}
	public T dequeue() throws QueueEmptyException {
		
		if(isEmpty()) {
			throw new QueueEmptyException();
		}
		T temp = head.data;
		head = head.next;
		size --;
		if(size==0) {
			head = null;
			tail = null;
		}
		return temp;
		
	}
	
}
