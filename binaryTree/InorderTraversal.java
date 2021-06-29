package binaryTree;

import java.util.ArrayList;

public class InorderTraversal {
	
	void inO(Node root ,ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        inO(root.left , arr);
        arr.add(root.data);
        inO(root.right , arr);
    }
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> arr = new ArrayList<Integer>();
        inO(root , arr);
        return arr;
       
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
