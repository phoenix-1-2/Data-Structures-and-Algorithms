import java.util.ArrayList;
import java.util.PriorityQueue;

public class Klargest {

	public static ArrayList<Integer> kLargest(int input[], int k) {
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		for(int i=0;i<k;i++)
			priorityQueue.add(input[i]);
		for(int i=k;i<input.length;i++) {
			if(priorityQueue.peek() < input[i] ) {
				priorityQueue.remove();
				priorityQueue.add(input[i]);
			}
		}
		
		ArrayList<Integer> ans = new ArrayList<>();
		while(!priorityQueue.isEmpty()) {
			ans.add(priorityQueue.remove());
		}
		return ans;
	}
	
}
