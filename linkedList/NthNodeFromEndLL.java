package linkedList;

public class NthNodeFromEndLL {
	
	int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	Node temp = head;
    	int l = 0;
    	while(temp != null){
    	    l++;
    	    temp = temp.next;
    	}
    	
    	l = l - n;
    	temp = head;
    	while(l > 0){
    	    l--;
    	    temp = temp.next;
    	}
    	if(l < 0){
    	    return -1;
    	}
    	
    	return temp.data;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
