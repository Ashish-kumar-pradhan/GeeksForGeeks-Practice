package binaryTree;

public class SumOfLeafNodes {
	
    public void sum(Node root , int s[]){
        
        if(root == null){
            return;
        }
        
        if(root.left == null && root.right == null){
            s[0] += root.data;
        }
        
        sum(root.left , s);
        sum(root.right , s);
        
    }
    public int SumofLeafNodes(Node root)
    {
    	
        int s[] = {0};
        sum(root , s );
        return s[0];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
