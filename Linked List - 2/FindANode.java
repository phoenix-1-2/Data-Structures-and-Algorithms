
public class FindANode {
	
	public static int indexOfNRec(LinkedListNode<Integer> head, int n) {
        if(head==null){
            return -1;
        }
        if(head.data==n){
            return 0;
        }
        int smallAns= indexOfNRec(head.next,n);
        if(smallAns==-1){
            return -1;
        }
        return 1+ smallAns;
        
	}

}
