import java.util.Scanner;

public class LinkedListNode<T> {
	
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data=data;
		this.next=null;
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

	
	public static void print(LinkedListNode<Integer> head){
		
		if(head==null) {
			return ;
		}
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		
	}

	

}
