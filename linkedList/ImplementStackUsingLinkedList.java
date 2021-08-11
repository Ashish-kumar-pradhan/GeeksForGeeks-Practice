package linkedList;

public class ImplementStackUsingLinkedList {
	
    StackNode top;
    
    //Function to push an integer into the stack.
    void push(int a) 
    {
        // Add your code here
        StackNode newNode = new StackNode(a);
        if(top != null){
            newNode.next = top;
            top = newNode;
        }
        else {
            top = newNode;
        }
    }
    
    //Function to remove an item from top of the stack.
    int pop() 
    {
        // Add your code here
        if(top != null){
            int temp = top.data;
            top = top.next;
            return temp ;
        }
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
