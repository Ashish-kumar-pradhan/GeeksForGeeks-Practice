package linkedList;

public class RotateaLinkedList {
	
	public Node rotate(Node head, int k) {
        // add code here
        int n = 1;
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
            n++;
        }
        
        k = k % n;
        
        while(k-- > 0){
            Node temp = head;
            head = head.next;
            
            tail.next = temp;
            tail = temp;
            tail.next = null; 
           
        }
        
        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
