package linkedList;

public class CountNodesLL {
	
	 public static int getCount(Node head)
	    {
	        int i = 0;
	        Node temp = head;
	        while(temp != null){
	            temp = temp.next;
	            i++;
	        }
	        return i;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
