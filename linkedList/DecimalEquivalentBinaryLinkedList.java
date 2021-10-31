package linkedList;

public class DecimalEquivalentBinaryLinkedList {
	
	Node reverse(Node head){
	       Node pre = head;
	       Node cur = pre.next;
	       while(cur != null){
	           Node nxt = cur.next;
	           cur.next = pre;
	           pre = cur;
	           cur = nxt;
	       }
	       head.next = null;
	       head = pre;
	       return head;
	   }
	   long DecimalValue(Node head)
	   {
	       
	       Node temp = reverse(head);
	       long ans = 0;
	       long mul = 1;
	       while(temp != null){
	           if(temp.data == 1){
	               ans = (ans + mul)%1000000007;
	           }
	           temp = temp.next;
	           mul = (mul*2)%1000000007;
	       }
	       
	       return ans;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
