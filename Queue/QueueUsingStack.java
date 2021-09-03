import java.util.Stack;

public class QueueUsingStack<T> {

	Stack<T> stack1;
	Stack<T> stack2;
	
	public QueueUsingStack() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}
	public int size() {
		return stack1.size();
	}
	public boolean isEmpty() {
		return size() ==0;
	}
	public void enqueue(T data) {
		stack1.push(data);
	}
	public T dequeue() {
		
		while(stack1.size()>1) {
			stack2.push(stack1.pop());
		}
		T dataT  = stack1.pop();
		while(!stack2.isEmpty()) {
			stack1.push( stack2.pop() );
		}
		return dataT;
		
	}
	public T front() {
		while(stack1.size()>1) {
			stack2.push(stack1.pop());
		}
		T dataT  = stack1.peek();
//		stack2.push(stack1.pop());
		while(!stack2.isEmpty()) {
			stack1.push( stack2.pop() );
		}
		return dataT;
	}
	
	
}
