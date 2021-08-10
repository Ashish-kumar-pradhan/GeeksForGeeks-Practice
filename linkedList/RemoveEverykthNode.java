package linkedList;

public class RemoveEverykthNode {
	
	Node delete(Node head, int k)
    {
	// Your code here
	    if(k == 0){
	        return head;
	    }
	    if(k == 1){
    	    return null;
        }
        Node temp = head;
        int n = 0;
        while(temp != null){
            temp = temp.next;
            n++;
        }
        temp = head;
        for(int i = 0 ; i < n/k ; i++){
            int j = 1;
    	    while(j < k-1){
    	        temp = temp.next;
    	        j++;
    	    }
    	    temp.next = temp.next.next;
    	    temp = temp.next;
        }
	    
    	return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
