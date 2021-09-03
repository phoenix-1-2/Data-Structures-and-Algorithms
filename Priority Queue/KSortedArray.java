import java.util.PriorityQueue;

public class KSortedArray {
	
	public static void ksortedArray(int[] arr,int k) {
		
		PriorityQueue<Integer> priorityQueue  = new PriorityQueue<>();
		int i=0;
		while(i<k) {
			priorityQueue.add(arr[i]);
			i++;
		}
		while(i<arr.length) {
			arr[i-k] = priorityQueue.remove();
			priorityQueue.add(arr[i]);
			i++;
		}
		i = arr.length - k;
		while(i<arr.length) {
			arr[i] = priorityQueue.remove();
			i++;
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,1,9,6,8};
		ksortedArray(arr,3);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

}
