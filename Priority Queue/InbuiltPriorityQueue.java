import java.util.PriorityQueue;

public class InbuiltPriorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<24;i+=5) {
			pq.add(i);
		}
		while(!pq.isEmpty()) {
			System.out.println(pq.peek());
			pq.remove();
		}
		
		
	}
	
}
