package arrays;

public class CyclicallyRotateArrayByOne {
	
	public void rotate(long arr[], long n)
    {
        int l = (int)n;
        long last = arr[l - 1];
        for(int i = l - 1 ; i > 0 ; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
