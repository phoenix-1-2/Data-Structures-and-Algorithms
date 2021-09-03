import java.util.Scanner;

public class MidPointOfLL {
	
	public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head){
		LinkedListNode<Integer> slow=head,fast=head;
		while (fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	public static LinkedListNode<Integer> takeInput(){
		LinkedListNode<Integer> head=null,tail=null;
		Scanner scan=new Scanner(System.in);
		int data=scan.nextInt();
		while(data!=-1) {
			
			LinkedListNode<Integer> newNode=new LinkedListNode<Integer>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}else {
				tail.next=newNode;
				tail=newNode;
			}
			
			data=scan.nextInt();
		}
		return head;
		
	}

	
	public static void main(String[] args) {
		
		LinkedListNode<Integer> head=takeInput();
		System.out.println(midPoint(head).data);
	}

}
