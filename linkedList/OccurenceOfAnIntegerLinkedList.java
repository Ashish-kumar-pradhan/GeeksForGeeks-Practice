package linkedList;

public class OccurenceOfAnIntegerLinkedList {
	
	public static int count(Node head, int search_for)
    {
		
        Node temp = head;
        int c = 0;
        while(temp != null){
            if(temp.data == search_for){
                c++;
            }
            temp = temp.next;
        }
        
        return c;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
