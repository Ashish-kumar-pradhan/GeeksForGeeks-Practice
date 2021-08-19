package binaryTree;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumDepthOfaBinaryTree {
	
	void mD(Node root , ArrayList<Integer> arr , int n){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null ){
            arr.add(n);
            return;
        }
        if(root.left != null){
            mD(root.left , arr , n + 1);
        }
        if(root.right != null){
            mD(root.right , arr , n + 1);
        }
        
    }
	int minDepth(Node root)
	{
	    //code here
	    ArrayList<Integer> arr = new ArrayList<>();
	    mD(root , arr , 1);
	    return Collections.min(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
