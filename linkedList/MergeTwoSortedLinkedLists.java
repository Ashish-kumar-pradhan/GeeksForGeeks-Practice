package linkedList;

public class MergeTwoSortedLinkedLists {
	
	
	Node sortedMerge(Node head1, Node head2) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method
	     Node temp1 = head1;
	     Node temp2 = head2;
	     
	     Node head = null;
	     Node pre = null;
	     if(temp1.data <= temp2.data){
	         head = temp1;
	         pre = temp1;
	         temp1 = temp1.next;
	     }
	     else {
	         head = temp2;
	         pre = temp2;
	         temp2 = temp2.next;
	     }
	     while(temp1 != null || temp2 != null){
	         if(temp1 == null){
	             pre.next = temp2;
	             break;
	         }
	         else if(temp2 == null){
	             pre.next = temp1;
	             break;
	         }
	         else if(temp1.data <= temp2.data){
	             pre.next = temp1;
	             pre = temp1;
	             temp1 = temp1.next;
	         }
	         else {
	             pre.next = temp2;
	             pre = temp2;
	             temp2 = temp2.next;
	         }
	        
	     }
	     
	     return head;
	     
	   } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
