import java.util.LinkedList;

public class LinkedListUses {

	
	public static void main(String[] args) {
		
		LinkedList<Integer> head=new LinkedList<Integer>();
		
		head.add(1);
		head.add(1, 2);
		head.addFirst(10);
		head.addLast(20);
		System.out.println(head.size());
		head.set(3, 6);
		while(!head.isEmpty()) {
			System.out.print(head.remove()+" ");
		}
		
		
		
	}
}