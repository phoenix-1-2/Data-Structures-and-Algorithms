
public class DeleteNRetainM {

	public static LinkedListNode<Integer> deleteM(LinkedListNode<Integer> head,int m,int n){

		 if(m==0) {
	            return null;
	        }
	        LinkedListNode<Integer> orginal=head;
	        LinkedListNode<Integer> temp1=head,temp2=head;
	        while(head!=null) {
	            temp1=head;
	            for(int i=1;i<m && temp1!=null;i++) {
	                temp1=temp1.next;
	            }
	            if(temp1!=null) {
	                temp2=temp1.next;
	            }
	            for(int i=1;i<n && temp2!=null;i++) {
	                temp2=temp2.next;
	            }
	            if(temp2!=null) {
	                temp2=temp2.next;
	            }
	            if(temp1!=null)
	                temp1.next=temp2;
	            head=temp2;



	        }
	        return orginal;
	}

}
