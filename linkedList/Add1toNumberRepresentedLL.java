package linkedList;

public class Add1toNumberRepresentedLL {
	
	public static Node reverse(Node head){
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
    public static Node addOne(Node head) 
    { 
        //code here.
        head = reverse(head);
        
        Node temp = head;
        Node tail = head;
        while(temp != null){
            if(temp.data != 9){
                temp.data += 1;
                break;
            }
            else{
                temp.data = 0;
                tail = temp;
                temp = temp.next;
            }
            
        }
        
        if(temp == null){
            Node newNode = new Node(1);
            tail.next = newNode;
        }
        
        head = reverse(head);
        
        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
