package linkedList;

public class GivenLL0s1s2sSortIt {
	
	 static Node segregate(Node head)
	    {
	        // add your code here
	        int zero = 0;
	        int one = 0;
	        int two = 0;
	        
	        Node temp = head;
	        while(temp != null){
	            if(temp.data == 0) zero++;
	            else if(temp.data == 1) one++;
	            else two++;
	            temp = temp.next;
	        }
	        temp = head;
	        int i = 0;
	        while(temp != null){
	            if(i < zero) temp.data = 0;
	            else if(i < zero + one) temp.data = 1;
	            else if(i < zero + one + two) temp.data = 2;
	            
	            temp = temp.next;
	            i++;
	        }
	        
	        return head;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
