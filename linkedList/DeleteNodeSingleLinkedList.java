package linkedList;

public class DeleteNodeSingleLinkedList {
	
	Node deleteNode(Node head, int x)
    {
	// Your code here
    	if(x == 1){
    	    return head.next;
    	}
	    Node temp = head;
	    int i = 1;
	    while(i < x-1){
	        temp = temp.next;
	        i++;
	    }
	    temp.next = temp.next.next;
    	
    	return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
