
public class DoublyLinkedListUse {
	
	
	public static void main(String[] args) {
		
		DoublyLinkedList<Integer> head= DoublyLinkedList.takeInput();
		DoublyLinkedList.print(head);
		head=DoublyLinkedList.insertAtFirst(head, 10);
		head=DoublyLinkedList.insertAtFirst(head, 11);
		head=DoublyLinkedList.insertAtFirst(head, 15);
		DoublyLinkedList.print(head);
		head=DoublyLinkedList.deleteAtFirst(head);
		DoublyLinkedList.print(head);
		System.out.println(head.data +" "+ head.prev.data+" "+ head.next.data+" ");
		
	}

}
