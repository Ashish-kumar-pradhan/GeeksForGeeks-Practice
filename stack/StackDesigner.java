package stack;

import java.util.ArrayList;
import java.util.Stack;

public class StackDesigner {
	
	public static Stack<Integer>_push(ArrayList<Integer> arr,int n)
	{
	    //Your code here
	    Stack<Integer> st = new Stack<Integer>();
	    for(int i = 0 ; i < n ; i++){
	        st.push(arr.get(i));
	    }
	    
	    return st;
	    
	}

	public static void _pop(Stack<Integer>s)
	{
	    //Your code here
	    while(!s.isEmpty()){
	        System.out.print(s.pop() + " ");
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
