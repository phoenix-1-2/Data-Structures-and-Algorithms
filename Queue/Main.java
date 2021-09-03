import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws QueueEmptyException {
//		QueueWithArray queueWithArray = new QueueWithArray();
//		Queue<Integer> queue = new LinkedList<Integer>();
		QueueUsingStack<Integer> queue = new QueueUsingStack<>();
		for(int i=10;i<=50;i+=10) {
			queue.enqueue(i);
		}
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		for(int i=60;i<=100;i+=10) {
			queue.enqueue(i);
		}
		System.out.println(queue.size());
		System.out.println("QUEUE");
		while(!queue.isEmpty()) {
			System.out.print(queue.dequeue()+" ");
		}
		System.out.println();
		System.out.println(queue.size());
		
	}
}
