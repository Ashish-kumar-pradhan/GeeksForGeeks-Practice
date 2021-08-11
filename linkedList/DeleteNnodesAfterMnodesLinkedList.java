package linkedList;

public class DeleteNnodesAfterMnodesLinkedList {
	
	static void linkdelete(Node head, int M, int N)
    {
        // your code here
        Node start = head;
        Node end = head;
        while(end != null && start != null){
            start = end;
            int m = M;
            int n = N;
            while(start != null && m != 1){
                start = start.next;
                m--;
            }
            if(start != null){
                end = start.next;
                while(end != null && n != 0){
                    end = end.next;
                    n--;
                }
                start.next = end;
            }
        
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
