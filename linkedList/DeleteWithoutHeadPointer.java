package linkedList;

public class DeleteWithoutHeadPointer {
	
	void deleteNode(Node del)
    {
         
         del.data = del.next.data;
         del.next = del.next.next;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
