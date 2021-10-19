package binaryTree;

public class InsertANodeInBST {
	
	void in(Node root, int key , Node newNode) {
        if(root.data < key){
            if(root.right == null){
                root.right = newNode;
            }
            in(root.right , key , newNode);
        }
        else if(root.data > key){
            if(root.left == null){
                root.left = newNode;
            }
            in(root.left , key , newNode);
        }
    }
    Node insert(Node root, int key) {
        // your code here
        Node newNode = new Node(key);
        in(root , key , newNode);
        
        return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
