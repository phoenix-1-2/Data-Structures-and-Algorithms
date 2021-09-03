import java.util.ArrayList;
public class MinPriorityQueue {

	private ArrayList<Integer> heap;
	
	public MinPriorityQueue() {
		heap = new ArrayList<>();
	}
	
	public int size() {
		return heap.size();
	}
	public boolean isEmpty() {
		return size()==0;
	}
	public int getMin() throws PriorityQueueEmptyException {
		if(isEmpty()) {
			throw new PriorityQueueEmptyException();
		}
		return heap.get(0);
	}
	public void insert(int data) {
		heap.add(data);
		upHeapify();
	}
	public void upHeapify() {
		
		int childIndex = heap.size()-1;
		
		
		while(childIndex>0) {
			int parentIndex = (childIndex - 1)/2;
			if(heap.get(parentIndex) > heap.get(childIndex)) {
				int temp = heap.get(parentIndex);
				heap.set(parentIndex, heap.get(childIndex));
				heap.set(childIndex, temp);
				childIndex = parentIndex;
			}
			else {
				break;
			}
		}
		
	}
	public void downHeapify() {
		int parentIndex = 0;
		int leftChildIndex = 2*parentIndex + 1;
		int rightChildIndex = 2*parentIndex + 2;
		int minIndex = 0;
		
		while(leftChildIndex<heap.size()) {
			if(heap.get(leftChildIndex) < heap.get(minIndex) ) {
				minIndex = leftChildIndex;
			}
			if( rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(minIndex) ) {
				minIndex = rightChildIndex;
			}
			if(minIndex!=parentIndex) {
				int temp = heap.get(parentIndex);
				heap.set(parentIndex, heap.get(minIndex));
				heap.set(minIndex,  temp );
				parentIndex = minIndex;
				leftChildIndex = 2*parentIndex + 1;
				rightChildIndex = 2*parentIndex + 2;
			}else {
				break;
			}
		}
	}
	public int removeMin() throws PriorityQueueEmptyException {
		if(isEmpty()) {
			throw new PriorityQueueEmptyException();
		}
		int temp = heap.get(0);
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		downHeapify();
		return temp;
	}
	
}
