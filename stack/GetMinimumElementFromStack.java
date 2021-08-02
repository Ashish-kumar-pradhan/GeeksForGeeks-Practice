package stack;

import java.util.Stack;

public class GetMinimumElementFromStack {
	
	int minEle = Integer.MAX_VALUE;
    Stack<Integer> s = new Stack<Integer>();
    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	if(s.isEmpty()){
	    minEle = Integer.MAX_VALUE;
	    return -1;
	}
	return minEle;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here	
    	if(s.isEmpty()){
    	    minEle = Integer.MAX_VALUE;
    	    return -1;
    	}
    	if(s.peek() < minEle && minEle != Integer.MAX_VALUE){
    	    int val = minEle;
    	    minEle = 2*val - s.peek();
    	    s.pop();
    	    return val;
    	}
    	else {
    	    return s.pop();
    	}
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here
	    
    	if(minEle > x && !s.isEmpty()){
    	    s.push(2*x - minEle);
    	    minEle = x;
    	}
    	else{
    	    s.push(x);
    	}
    	
    	if(minEle == Integer.MAX_VALUE){
	        minEle = s.peek();
	    }
	
    }	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
