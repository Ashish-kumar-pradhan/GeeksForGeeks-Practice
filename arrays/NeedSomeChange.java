package arrays;

public class NeedSomeChange {
	
	public void swapElements(int[] arr, int n)
    {
        // Code here
        for(int i = 0 ; i+2 < n ; i++){
            int temp = arr[i];
            arr[i] = arr[i+2];
            arr[i+2] = temp;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
