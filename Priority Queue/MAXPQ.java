import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class PriorityQueueMaxComparator implements Comparator<String>{
	
	public int compare(String o1 , String o2) {
		if(o1.length()<=o2.length())
			return -1;
		else
			return 1;
	}
	
}
public class MAXPQ {

	public static void main(String[] args) {
		PriorityQueueMaxComparator maxComparator = new PriorityQueueMaxComparator();
		
		PriorityQueue<String> maxPriorityQueue = new PriorityQueue<>(maxComparator);
		
//		int[] arr = {1,2,3,5,4};
		String[] arr = {"this","a" ,"is" ,"bat"};
		
		for(String i : arr)
			maxPriorityQueue.add(i);
		while(!maxPriorityQueue.isEmpty()) {
			System.out.print(maxPriorityQueue.remove() +" ");
		}
		
		
	}
}
