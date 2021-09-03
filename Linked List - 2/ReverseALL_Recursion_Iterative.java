class DoubleNode{
	LinkedListNode<Integer> head,tail;
	public DoubleNode() {
		head=null;
		tail=null;
	}
	
	public DoubleNode(LinkedListNode<Integer> head,LinkedListNode<Integer> tail) {
		this.head=head;
		this.tail=tail;
	}
}
public class ReverseALL_Recursion_Iterative {
	
	// O(N^2)
	public static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> head){
		if(head.next==null) {
			return head;
		}
		
		LinkedListNode<Integer> newHead=reverseLL(head.next),temp=newHead;
		
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=head;
		head.next=null;
		return newHead;
	}
	// O(N)
	public static DoubleNode reverseLLBest(LinkedListNode<Integer> head){
		
		if(head.next==null) {

			DoubleNode ans=new DoubleNode(head,head);
			return ans;
		}
		
		DoubleNode smallAns= reverseLLBest(head.next);
		
		smallAns.tail.next=head;
		head.next=null;
		DoubleNode ans=new DoubleNode(smallAns.head,head);
		return ans;

	}
	
	public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
		
		if(head.next==null) {
			return head;
		}
		LinkedListNode<Integer> tail=head.next;
		LinkedListNode<Integer> newHead= reverse(head.next);
		tail.next=head;
		head.next=null;
		return newHead;
		
	}
	
	public static LinkedListNode<Integer> reverseIterative(LinkedListNode<Integer> head){
		
		if(head.next ==null || head==null) {
			return head;
		}
		LinkedListNode<Integer> prev=null,curr=head;
		while(curr!=null) {
			LinkedListNode<Integer> temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
	}
 
	public static void main(String[] args) {

		LinkedListNode<Integer> head=LinkedListNode.takeInput();
//		head=reverseLL(head);
//		head=reverseLLBest(head).head;
//		head=reverse(head);
		head=reverseIterative(head);
		LinkedListNode.print(head);
	}

}
