package arrays;

public class ShuffleIntegers {
	
	void shuffleArray(long arr[], int n)
    {
        // Your code goes here
        long temp[] = new long[n];
        for(int i = 0 ; i < n ; i++){
            temp[i] = arr[i];
        }
        for(int i = 0 ; i < n/2 ; i++){
            arr[2*i] = temp[i];
            arr[2*i + 1] = temp[n/2 + i];
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
