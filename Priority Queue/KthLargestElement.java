import java.util.PriorityQueue;

public class KthLargestElement {


	public static int kthLargest(int arr[], int k) {

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		for(int i=0;i<k;i++)
			priorityQueue.add(arr[i]);
		for(int i= k ;i < arr.length;i++) {
			if(arr[i] > priorityQueue.peek() ) {
				priorityQueue.remove();
				priorityQueue.add(arr[i]);
			}
		}
		return priorityQueue.remove();

	}

}
