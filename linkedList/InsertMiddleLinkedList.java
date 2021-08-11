package linkedList;

public class InsertMiddleLinkedList {
	
	public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newNode = new Node(data);
        newNode.next = slow.next;
        slow.next = newNode;
        
        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
