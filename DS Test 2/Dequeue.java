import java.util.LinkedList;

public class Dequeue{
	
	private LinkedList<Integer> list;
	private int capacity;
	
	public Dequeue(int capacity) {
		this.capacity = capacity;
		list = new LinkedList<>();
	}
	
	public int getFront() {
		if(list.isEmpty()) {
			return -1;
		}
		return list.getFirst();
	}
	public int getRear() {
		if(list.isEmpty()) {
			return -1;
		}
		return list.getLast();
	}
	public void deleteFront() {
		if(list.isEmpty()) {
			System.out.println(-1);
			return ;
		}
		list.removeFirst();
	}
	public void deleteRear() {
		if(list.isEmpty()) {
			System.out.println(-1);
			return ;
		}
		list.removeLast();
	}
	
	public void insertFront(int data) {
		if(list.size()==capacity) {
			System.out.println(-1);
			return ;
		}
		list.addFirst(data);
	}
	public void insertRear(int data) {
		if(list.size()==capacity) {
			System.out.println(-1);
			return ;
		}
		list.addLast(data);
	}
	
	
}