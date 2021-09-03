
public class Main {

	public static void main(String[] args) throws PriorityQueueEmptyException{
		
		MaxPriorityQueue priorityQueue = new MaxPriorityQueue();
		int[] arr = {4,3,5,7,8,1,0};
		for(int i : arr) {
			priorityQueue.insert(i);
		}
		while(!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.getMax());
			priorityQueue.removeMax();
		}
		
	}
	
}
