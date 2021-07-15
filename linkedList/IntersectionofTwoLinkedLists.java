package linkedList;

import java.util.HashMap;

public class IntersectionofTwoLinkedLists {
	
	public static Node findIntersection(Node head1, Node head2)
    {
        
        boolean headCheck = true;
        HashMap<Integer,Integer> hp = new HashMap<>();
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp2 != null){
            hp.put(temp2.data , 1);
            temp2 = temp2.next;
        }
        
        Node pre = null;
        Node head = null;
        while(temp1 != null){
            if(hp.containsKey(temp1.data)){
                if(headCheck){
                    head = temp1;
                    pre = temp1;
                    headCheck = false;
                }
                else {
                    pre.next = temp1;
                    pre = temp1;
                }
            }
            temp1 = temp1.next;
        }
        pre.next = null;
        
        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
