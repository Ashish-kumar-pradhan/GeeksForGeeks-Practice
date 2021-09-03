package linkedList;

public class ImplementQueueUsingLinkedList {
	
QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code here
        QueueNode s = new QueueNode(a);
        if(front == null || rear == null){
            front = rear = s;
        }
        else{
            rear.next = s;
            rear = s;
        }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        if(front == null || rear == null){
            return -1;
        }
        
        int temp = front.data;
        front = front.next;
        return temp;
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
