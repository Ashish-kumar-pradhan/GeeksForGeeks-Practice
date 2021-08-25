package arrays;

public class ThirdLargestElement {
	
	int thirdLargest(int arr[], int n)
    {
	    // Your code here
	    if(n < 3) return -1;
	    
	    int fm = Integer.MIN_VALUE;
	    int sm = Integer.MIN_VALUE;
	    int tm = Integer.MIN_VALUE;
	    for(int i = 0 ; i < n ; i++){
	        if(fm < arr[i]){
	             tm = sm;
	             sm = fm; 
	             fm = arr[i];
	        }
	        else if(sm < arr[i]){
	            tm = sm;
	            sm = arr[i];
	        }
	        else if(tm < arr[i]){
	            tm = arr[i];
	        }
	    }
	    
	    return tm;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
