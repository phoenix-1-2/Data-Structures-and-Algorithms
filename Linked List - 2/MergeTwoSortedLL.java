
public class MergeTwoSortedLL {
	
	public static LinkedListNode<Integer> merge(LinkedListNode<Integer> head1,LinkedListNode<Integer> head2){
		
		LinkedListNode<Integer> head=null,tail=null;
		
		while(head1!=null && head2!=null) {
			
			if(head1.data<=head2.data) {
				
				if(head==null) {
					head=head1;
					tail=head1;
				}else {
					tail.next=head1;
					tail=head1;
				}
				head1=head1.next;
				
			}else {
				
				if(head==null) {
					head=head2;
					tail=head2;
				}else {
					tail.next=head2;
					tail=head2;
				}
			head2=head2.next;	
			}
			
		}
		if(head1==null) {
			tail.next=head2;
		}
		if(head2==null) {
			tail.next=head1;
		}
		return head;
		
		
	}
	
	public static void main(String[] args) {
		LinkedListNode<Integer> head1=MidPointOfLL.takeInput();
		LinkedListNode<Integer> head2=MidPointOfLL.takeInput();
		LinkedListNode<Integer> head= merge(head1, head2);
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}

}
