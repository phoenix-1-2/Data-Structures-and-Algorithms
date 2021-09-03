import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue<T> {

	private Queue<T> q1;
	private Queue<T> q2;

    public Queue<T> getQueue(){
        return q1;
    }
    
	public StackUsingQueue() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();

	}
	
	public void push(T data) {
		q1.add(data);
	}
	
	public T pop() {
		
		while(q1.size()>1) {
			q2.add(q1.poll());
		}
		T temp = q1.poll();
		Queue<T> ts = q1;
		q1 = q2;
		q2 = ts;
		return temp;
	}
	public T top() {
		while(q1.size()>1) {
			q2.add(q1.poll());
		}
		T temp = q1.peek();
		q2.add(q1.poll());
		Queue<T> ts = q1;
		q1 = q2;
		q2 = ts;
		return temp;
	}
	public int getSize() {
		return q1.size();
	}
	
	
}
