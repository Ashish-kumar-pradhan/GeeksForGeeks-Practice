package arrays;

public class RotateArrayDSteps {
	
	static void reverse(int arr[] , int l , int r){
        for(int i = 0 ; i <= (r-l)/2 ; i++){
            int temp = arr[l+i];
            arr[l+i] = arr[r-i];
            arr[r-i] = temp; 
        }
    }
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        reverse(arr , 0 , d - 1);
        reverse(arr , d , n - 1);
        reverse(arr , 0 , n - 1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
