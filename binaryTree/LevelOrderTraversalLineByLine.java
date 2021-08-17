package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalLineByLine {
	
	static ArrayList<ArrayList<Integer>> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<Node> qu = new LinkedList<Node>();
        qu.add(node);
        while(!qu.isEmpty()){
            int n = qu.size();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int i = 0 ; i < n ; i++){
                Node cur = qu.remove();
                arr.add(cur.data);
                if(cur.left != null){
                    qu.add(cur.left);
                }
                if(cur.right != null){
                    qu.add(cur.right);
                }
            }
            ans.add(arr);
        }
        
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
