package linkedList;

public class FindLengthLoop {
	
	static int countNodesinLoop(Node head)
    {
        
        Node slow = head.next ;
        Node fast = head.next.next ;
        while(slow != fast){
            if(fast == null || fast.next == null){
                return 0;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        
        fast = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow = slow.next;
        int i = 1;
        while(slow != fast){
            slow = slow.next;
            i++;
        }
        
        return i;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
