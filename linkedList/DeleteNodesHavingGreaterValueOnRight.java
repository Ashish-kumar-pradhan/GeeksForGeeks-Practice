package linkedList;

import java.util.Stack;

public class DeleteNodesHavingGreaterValueOnRight {
	
	Node compute(Node head)
    {
        // your code here
        Stack<Node> st = new Stack<Node>();
        Stack<Node> ans = new Stack<Node>();
        Node temp = head;
        while(temp != null){
            while(st.size() != 0 && temp.data > st.peek().data){
                st.pop();
            }
            st.push(temp);
            temp = temp.next;
        }
        
        while(!st.isEmpty()){
            ans.push(st.pop()); 
        }
        
        head = ans.pop();
        Node pre = head;
        while(!ans.isEmpty()){
            pre.next = ans.pop();
            pre = pre.next;
        }
        
        pre.next = null;
        
        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
