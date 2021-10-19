package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class OddEvenLevelDifference {
	
	int getLevelDiff(Node root)
	{
	    //code here
	    Queue<Node> qu = new LinkedList<>();
	    qu.add(root);
	    int odd = 0;
	    int even = 0;
	    boolean oe = false;
	    while(!qu.isEmpty()){
	        int n = qu.size();
	        for(int i = 0 ; i < n ; i++){
	            Node cur = qu.remove();
	            if(cur.left != null){
	                qu.add(cur.left);
	            }
	            if(cur.right != null){
	                qu.add(cur.right);
	            }
	            
	            if(oe){
	                even += cur.data;
	            }
	            else{
	                odd += cur.data;
	            }
	        }
	        
	        oe = !oe;
	    }
	    
	    return odd - even;
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
