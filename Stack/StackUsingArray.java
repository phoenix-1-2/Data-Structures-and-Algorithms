
public class StackUsingArray {
	
	private int[] arr ;
	private int top;
	public boolean isEmpty() {
		return top ==-1;
	}
	
	public int size() {
		return top+1;
	}
	public int top() throws StackEmptyException {
		if(isEmpty()) {
			throw new StackEmptyException();
		}
		return arr[top];
	}
	private void doubleCapacity() {
		
		int[] temp = arr;
		arr= new int[temp.length * 2];
		for(int i=0;i<temp.length;i++) {
			arr[i] = temp[i];
		}
	}
	
	public StackUsingArray() {
		arr = new int[10];
		top = -1;
	}
	public void push(int data){
		if(top==arr.length) {
			doubleCapacity();
		}
		top++;
		arr[top] = data;
	}
	public int pop() throws StackEmptyException {
		
		if(isEmpty()) {
			throw new StackEmptyException();
		}
		int temp= arr[top--];
		return temp;
	}

}
