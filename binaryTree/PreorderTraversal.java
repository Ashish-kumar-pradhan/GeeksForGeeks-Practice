package binaryTree;

import java.util.ArrayList;

public class PreorderTraversal {
	
	 static void preO(Node root ,ArrayList<Integer> arr){
	        if(root == null){
	            return;
	        }
	        arr.add(root.data);
	        preO(root.left , arr);
	        preO(root.right , arr);
	    }
	    static ArrayList<Integer> preorder(Node root)
	    {
	        // Code here
	        ArrayList<Integer> arr = new ArrayList<Integer>();
	        preO(root , arr);
	        return arr;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
