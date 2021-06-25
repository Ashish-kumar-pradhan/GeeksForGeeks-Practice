package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DiagonalSumBinaryTree {
	
	public static ArrayList <Integer> diagonalSum(Node root) 
    {
        // code here.
        
       ArrayList<Integer> arr = new ArrayList<Integer>();
       Queue<Node> qu = new LinkedList<>(); 
       qu.add(root);
       while(!qu.isEmpty()){
           int n = qu.size();
           int sum = 0;
           for(int i = 0 ; i < n ; i ++){
               Node cur = qu.remove();
               while(cur != null){
                   if(cur.left != null){
                       qu.add(cur.left);
                   }
                   sum += cur.data;
                   cur = cur.right;
               }
           }
           arr.add(sum);
       }
       
       return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
