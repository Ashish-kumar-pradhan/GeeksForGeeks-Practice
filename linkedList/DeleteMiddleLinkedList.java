package linkedList;

public class DeleteMiddleLinkedList {
	
	Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        Node slow = head;
        Node fast = head.next.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        
        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
