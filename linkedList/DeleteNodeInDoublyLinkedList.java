package linkedList;

public class DeleteNodeInDoublyLinkedList {
	
	Node deleteNode(Node head,int x)
    {
	// Your code here
	   Node temp = head;
	   if(x == 1){
	       temp = temp.next;
	       temp.prev = null;
	      return temp;
	   }
	   int i = 1;
	   while(i != x - 1){
	       temp = temp.next;
	       i++;
	   }
	   
	   if(temp.next.next == null){
	       temp.next = null;
	   }
	   else {
	       temp.next = temp.next.next;
	       temp = temp.next;
	       temp.prev = temp.prev.prev;
	   }
	   
	   return head;
	   
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
