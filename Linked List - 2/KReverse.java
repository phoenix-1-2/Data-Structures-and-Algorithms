
public class KReverse {


	public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){

		LinkedListNode<Integer> pre=null,curr=head;
		while(curr!=null){

			LinkedListNode<Integer> temp= curr.next;
			curr.next=pre;
			pre=curr;
			curr=temp;
		}
		return pre;


	}
	public static int len(LinkedListNode<Integer> head){
		int l=0;
		while(head!=null){
			l++;
			head=head.next;
		}
		return l;
	}

	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {

		if(k >= len(head)){
			return reverse(head);
		}
		LinkedListNode<Integer> tempHead= head;
		for(int i=1;i<k;i++){
			head=head.next;
		}
		LinkedListNode<Integer> temp=head.next;
		head.next=null;
		LinkedListNode<Integer> reversedHead= reverse(tempHead);
		LinkedListNode<Integer> tail= tempHead;
		LinkedListNode<Integer> smallAns= kReverse(temp,k);
		tail.next= smallAns;
		return reversedHead;


	}
}
