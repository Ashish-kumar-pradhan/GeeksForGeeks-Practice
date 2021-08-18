package binaryTree;

import java.util.ArrayList;

public class PrintBSTElementsInGivenRange {
	
	 static void pNN(Node root,int l,int h , ArrayList<Integer> ans) {
	        if(root == null){
	            return;
	        }
	        if(root.data > l ){
	            pNN(root.left, l , h , ans);
	        }
	        if(root.data >= l && root.data <= h){
	            ans.add(root.data);
	        }
	        if(root.data < h){
	            pNN(root.right, l , h , ans);
	        }
	        
	    }
		public static ArrayList<Integer> printNearNodes(Node root,int low,int high) {
	        // code here.
	        ArrayList<Integer> ans = new ArrayList<>();
	        pNN(root , low , high , ans);
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
