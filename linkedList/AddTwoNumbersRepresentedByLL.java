package linkedList;

import java.util.ArrayList;

public class AddTwoNumbersRepresentedByLL {
	
	static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        ArrayList<Integer> ar1 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(first != null){
            ar1.add(first.data);
            first = first.next;
        }
        
        while(second != null){
            ar2.add(second.data);
            second = second.next;
        }
        
        int maxSize = Math.max(ar1.size() , ar2.size());
        int carry = 0;
        for(int i = 0 ; i < maxSize; i++){
            int fir = 0;
            int sec = 0;
            if(ar1.size() - i > 0){
                fir = ar1.get(ar1.size() - i - 1);
            }
            if(ar2.size() - i > 0){
                sec = ar2.get(ar2.size() - i - 1);
            }
            
            int sum = (fir + sec + carry)%10;
            carry = (fir + sec + carry)/10;
            ans.add(sum);
        }
        if(carry != 0){
            ans.add(carry);
        }
        
        Node head = new Node(ans.get(ans.size() - 1));
        Node temp = head;
        for(int i = ans.size() - 2 ; i >= 0 ; i--) {
           Node newNode = new Node(ans.get(i));
           temp.next = newNode;
           temp = newNode;
       }
       
       return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
