package binaryTree;

import java.util.ArrayList;
import java.util.Collections;

public class PrintAllNodesThatDontHaveSibling {
	
	
	void nS(Node node , ArrayList<Integer> arr){
        if(node == null){
            return;
        }
        if(node.left == null && node.right == null){
            return;
        }
        if(node.right == null){
            arr.add(node.left.data);
            nS(node.left , arr);
        }
        else if(node.left == null){
            arr.add(node.right.data);
            nS(node.right , arr);
        }
        else {
            nS(node.left , arr);
            nS(node.right , arr);
        }
    }
    ArrayList<Integer> noSibling(Node node)
    {
        // code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        nS(node , arr);
        if(arr.size() == 0) arr.add(-1);
        Collections.sort(arr);
        return arr;
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
