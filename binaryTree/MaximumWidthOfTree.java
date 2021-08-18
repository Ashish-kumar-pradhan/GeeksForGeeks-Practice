package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfTree {
	
	int getMaxWidth(Node root) {
        // Your code here
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        int max =  0;
        while(!qu.isEmpty()){
            int n = qu.size();
            if(n > max) {
                max = n;
            }
            for(int i = 0 ; i < n ; i++){
                Node cur = qu.remove();
                if(cur.left != null){
                    qu.add(cur.left);
                }
                if(cur.right != null){
                    qu.add(cur.right);
                }
            }
        }
        
        return max;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
