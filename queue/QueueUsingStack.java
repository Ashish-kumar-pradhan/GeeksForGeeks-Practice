package queue;

import java.util.Stack;

public class QueueUsingStack {
	
	Stack<Integer> input = new Stack<Integer>(); 
    Stack<Integer> output = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
	    // Your code here
	    if(input.size() == 0){
	        return -1;
	    }
	    while(input.size() > 1){
	        output.push(input.pop());
	    }
	    int out = input.pop();
	    
	    while(output.size() > 0){
	        input.push(output.pop());
	    }
	    
	    return out;
	    
    }
	
    /* The method push to push element into the stack */
    void enqueue(int x)
    {
	    // Your code here
	    input.push(x);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
