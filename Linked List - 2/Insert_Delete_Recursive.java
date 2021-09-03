
public class Insert_Delete_Recursive {
	
	
	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head,int pos,int data){
		
	
		if(pos==0) {
			
			LinkedListNode<Integer> newNode=new LinkedListNode<Integer>(data);
			newNode.next=head;
			return newNode;
			
		}
		if(head==null) {
			return head;
		}
		
		head.next= insert(head.next, pos-1, data);
		return head;
	}
	
	
	public static LinkedListNode<Integer> delete(LinkedListNode<Integer> head,int pos){
		
		if(head==null) {
			return head;
		}
		
		if(pos==0) {
			return head.next;
		}
		head.next=delete(head.next, pos-1);
		
		return head;
	}
	
	public static void main(String[] args) {
		
		LinkedListNode<Integer> head=LinkedListNode.takeInput();
//		head=insert(head, 3, 10);
		head=delete(head, 2);
		LinkedListNode.print(head);
		
	}

}
