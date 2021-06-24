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
	
	private static void delete(Stack<Integer> S , int k){
		if(S.size() == k) {
			S.pop();
			return;
		}
		int topElem = S.pop();
		delete(S , k);
		S.push(topElem);
	}
    public void deleteMidR(Stack<Integer>s,int sizeOfStack){
    	
        int k = (sizeOfStack + 1)/2;
        delete(s , k);
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
