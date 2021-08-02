package stack;

import java.util.PriorityQueue;
import java.util.Stack;

public class GetMinimumElementFromStack2 {
	
	Stack<Integer> s = new Stack<Integer>();
    /*returns min element from stack*/
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

    int getMin(){
        try{
            return pq.peek();
        
        }
        catch(Exception e){
            return -1;
        }
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here	
    	try{
            int j = s.pop();
            pq.remove(j);
            return j;
        }
        catch(Exception e){
            return -1;
        }
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here
    	int j=s.push(x);
        pq.add(j);
	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
