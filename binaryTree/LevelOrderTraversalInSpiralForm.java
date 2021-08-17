package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalInSpiralForm {
	
	ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<Node> qu = new LinkedList<Node>();
        qu.add(root);
        int eo = 1;
        while(!qu.isEmpty()){
            int n = qu.size();
            ArrayList<Integer> arr = new ArrayList<>();
            int s = ans.size();
            for(int i = 0 ; i < n ; i++){
                Node cur = qu.remove();
                
                if(cur.left != null){
                    qu.add(cur.left);
                }
                if(cur.right != null){
                    qu.add(cur.right);
                }
                arr.add(cur.data);
            }
            
           for(int i = 0 ; i < arr.size() ; i++){
                if(eo % 2 == 0){
                    ans.add(arr.get(i));
                }
                else {
                    ans.add(arr.get(arr.size() - i - 1));
                }
           }
            eo++;
        }
        
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
