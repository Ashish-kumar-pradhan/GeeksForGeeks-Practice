package linkedList;

public class FindingMiddleElementLL {
	
	int getMiddle(Node head)
    {
         // Your code here.
         Node s = head;
         Node f = head;
         
         while(f != null && f.next != null){
             f = f.next.next;
             s = s.next;
         }
         
         return s.data;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
