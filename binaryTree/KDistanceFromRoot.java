package binaryTree;

import java.util.ArrayList;

public class KDistanceFromRoot {
	
	void kd(Node root, int k , ArrayList<Integer> arr ){
        if(root == null){
            return;
        }
        
        if(k == 0){
            arr.add(root.data);
            return;
        }
        if(root.left != null){
            k--;
            kd(root.left , k , arr);
            k++;
        }
        if(root.right != null){
            k--;
            kd(root.right , k , arr);
            k++;
        }
    }
    ArrayList<Integer> Kdistance(Node root, int k)
    {
         // Your code here
         ArrayList<Integer> arr = new ArrayList<Integer>();
         kd(root , k , arr);
         return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
