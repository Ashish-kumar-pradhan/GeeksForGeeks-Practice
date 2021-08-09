package stack;

public class ImplementStackUsingArray {
	
	int top = -1;
	int arr[] = new int[1000];

   
	//Function to push an integer into the stack.
    void push(int a)
	{
	    // Your code here
	    top++;
	    arr[top] = a;
	} 
	
    //Function to remove an item from top of the stack.
	int pop()
	{
        // Your code here
        if(top < 0){
            return -1;
        }
        return arr[top--];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
