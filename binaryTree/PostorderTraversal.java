package binaryTree;

import java.util.ArrayList;

public class PostorderTraversal {
	
	void postO(Node root ,ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        postO(root.left , arr);
        postO(root.right , arr);
        arr.add(root.data);
    }
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        postO(root , arr);
        return arr;
       
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
