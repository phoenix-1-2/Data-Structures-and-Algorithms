import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
class Pair{
	int value;
	int index;
}
public class BuyTicket {
	
public static int buyTicket(int input[], int k) {
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
		Queue<Pair> queue = new LinkedList<>();
		
		for(int i=0;i < input.length;i++) {
			Pair pair = new Pair();
			pair.value = input[i];
			pair.index = i;
			priorityQueue.add(input[i]);
			queue.add( pair );
		}
		int count = 0;
		while(!queue.isEmpty()) {
			
			if(priorityQueue.peek() == queue.peek().value) {
				priorityQueue.remove();
				Pair pair = queue.poll();
				count++;
				if( pair.index == k ) {
					return count;
				}
			}
			else {
				
				queue.add(queue.poll());
				
			}
			
		}
		
		return count ; 
	}

}
