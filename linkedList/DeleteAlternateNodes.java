package linkedList;

public class DeleteAlternateNodes {
	
	public void deleteAlternate (Node head){
        
        Node temp = head;
        while(temp != null && temp.next != null){
            temp.next = temp.next.next;
            temp = temp.next;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
