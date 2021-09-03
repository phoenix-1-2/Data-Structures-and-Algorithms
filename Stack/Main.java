import java.util.Stack;
public class Main {

	public static void main(String[] args) {
		
//		StackUsingArray stack = new StackUsingArray();
//		StackUsingLL<Integer> stack = new StackUsingLL<>();
		Stack<Integer> stack = new Stack<>();
		for(int i=10;i<=100;i+=10) {
			stack.push(i);
		}
		System.out.println( stack.size() );
		System.out.println( stack.peek() );
		while(!stack.isEmpty()) {
			System.out.println(stack.pop() +" ");
		}
		
		
	}
}
