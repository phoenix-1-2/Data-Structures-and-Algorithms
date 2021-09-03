import java.util.Scanner;

public class DoublyLinkedList<T> {
	
	public T data;
	public DoublyLinkedList<T> prev,next;
	
	public DoublyLinkedList(T data) {
		this.data=data;
		this.prev=null;
		this.next=null;
	}
	// O(N)
	public static DoublyLinkedList<Integer> takeInput(){
		Scanner scan=new Scanner(System.in);
		DoublyLinkedList<Integer> head=null,tail=null;
		int data=scan.nextInt();
		while(data!=-1) {
			
			DoublyLinkedList<Integer> newNode=new DoublyLinkedList<Integer>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}else {
				head.prev=newNode;
				tail.next=newNode;
				newNode.prev=tail;
				newNode.next=head;
				tail=newNode;
			}
			data=scan.nextInt();
			
		}
		return head;
		
	}
	// O(N)
	public static void print(DoublyLinkedList<Integer> head) {
		if(head==null) {
			return ;
		}
		DoublyLinkedList<Integer> temp=head;
//		do {
//			System.out.print(temp.data+" ");
//			temp=temp.next;
//			
//		}while(temp!=head);
//		System.out.println();
		System.out.print(temp.data+" ");
		temp=temp.next;
		while(temp!=head) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		
	}
	// O(1)
	public static DoublyLinkedList<Integer> deleteAtFirst(DoublyLinkedList<Integer> head){
		
		if(head==null) {
			return head;
		}
		
		DoublyLinkedList<Integer> tail= head.prev;
		head=head.next;
		head.prev=tail;
		tail.next=head;
		return head;
	}
	// O(1)
	public static DoublyLinkedList<Integer> insertAtFirst(DoublyLinkedList<Integer> head,int data){
		
		if(head==null) {
			return head;
		}
		DoublyLinkedList<Integer> tail=head.prev;
		DoublyLinkedList<Integer> newNode= new DoublyLinkedList<Integer>(data);
		head.prev=newNode;
		newNode.next=head;
		tail.next=newNode;
		newNode.prev=tail;
		return newNode;	
	}
	
	
}
