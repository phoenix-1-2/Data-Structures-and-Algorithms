
public class MergeSort {
	
	
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head){
		
		if(head.next==null) {
			return head;
		}
		LinkedListNode<Integer> middle= MidPointOfLL.midPoint(head);
		LinkedListNode<Integer> head1=head,head2=middle.next;
		middle.next=null;
		
		head1=mergeSort(head1);
		head2=mergeSort(head2);
		head=MergeTwoSortedLL.merge(head1, head2);
		return head;
	}
	public static void main(String[] args) {
		LinkedListNode<Integer> head= MidPointOfLL.takeInput();
		head=mergeSort(head);
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}

}
