
public class SwapTwoNodes {
	public static  LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head,int I,int J){

		LinkedListNode<Integer> prev1=null,curr1=head,curr2=head,prev2=null;

		for(int i=1;i<=I;i++){
			prev1=curr1;
			curr1=curr1.next;
		}
		for(int i=1;i<=J;i++){
			prev2=curr2;
			curr2=curr2.next;
		}
		if(prev1==null){
			head=curr2;
		}
		else{
			prev1.next=curr2;
		}

		LinkedListNode<Integer> temp=curr2.next;
		if(prev2!=curr1)
			curr2.next=curr1.next;
		else
			curr2.next=curr1;
		if(prev2==null){
			head=curr1;
		}
		else{
			prev2.next=curr1;
		}
		curr1.next=temp;
		return head;



	}
}
