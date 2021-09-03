import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {

	public static void findMedian(int arr[])  {
		
		PriorityQueue<Integer> min = new PriorityQueue<>();
		PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i : arr) {
			
			if(max.isEmpty()) {
				max.add(i);
			}
			else if( i  > max.peek() ) {
				min.add(i);
				if( (min.size() - max.size()) > 1 ) {
					int p = min.remove();
					max.add(p);
				}
			}
			else {
				max.add(i);
				if( (max.size() -min.size()) > 1  ) {
					int p = max.remove();
					min.add(p);
				}
			}
			
			if(max.size() > min.size()) {
				System.out.println(max.peek());
			}
			else if(max.size() < min.size()) {
				System.out.println(min.peek());
			}
			else {
				System.out.println( (max.peek() + min.peek()) /2  );
			}
			
			
		}
		
	}
	
}
