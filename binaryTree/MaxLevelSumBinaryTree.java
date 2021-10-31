package binaryTree;

import java.util.*;

public class MaxLevelSumBinaryTree {
	
	public int maxLevelSum(Node root) {
        // add code here.
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        int max = root.data;
        while(!qu.isEmpty()){
            int n = qu.size();
            int val = 0;
            for(int i = 0 ; i < n ; i++){
               Node cur = qu.remove();
               if(cur.left != null){
                   qu.add(cur.left);
               }
               if(cur.right != null){
                   qu.add(cur.right);
               }
               val += cur.data;
            }
            
            if(max < val) max = val;
        }
        
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
