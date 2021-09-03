import java.util.Stack;
public class ReverseStack {

	public static void reverseStack( Stack<Integer> stack1,Stack<Integer> stack2 ) {
		
		if(stack1.isEmpty()) {
			return ;
		}
		int temp = stack1.pop();
		reverseStack(stack1, stack2);
		while(!stack1.isEmpty() ) {
			stack2.push(stack1.pop());
		}
		stack1.push(temp);
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		
		
	}
	
}
