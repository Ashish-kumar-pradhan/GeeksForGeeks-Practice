package recursion;

import java.util.Stack;

public class DeleteMiddleElementStack {
	
	public void deleteMidI(Stack<Integer> s ,int sizeOfStack){
        // code here
        Stack<Integer> help = new Stack<>();
        int hs = (sizeOfStack + 1)/2;
        while(s.size() > hs){
            help.push(s.pop());
        }
        int del = s.pop(); 
        while(!help.isEmpty()){
            s.push(help.pop());
        }   
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
