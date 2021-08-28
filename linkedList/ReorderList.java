package linkedList;

public class ReorderList {
	
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
    Node reorderlist(Node head) {
        // Your code here
        Node slow = head;
        Node fast = head.next; // head.next
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        
        if(head2 != null){
            head2 = reverse(head2);
        }
        
        
        Node cur1 = head;
        Node cur2 = head2;
        
        while(cur1 != null && cur2 != null){
            
            Node nxt1 = cur1.next;
            Node nxt2  = cur2.next;
            
            cur1.next = cur2;
            cur2.next = nxt1;
            
            cur1 = nxt1;
            cur2 = nxt2;
            
        }
        
        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
