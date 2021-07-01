package searching;

public class BinarySearch {
	
	 int BS(int arr[], int i, int j , int k){
	        if(j < i){
	            return  -1;
	        }
	        int mid = (i + j)/2;
	        if(arr[mid] == k){
	            return mid;
	        }
	        else if(arr[mid] > k){
	            return BS(arr , i , mid - 1 , k);
	        }
	        else {
	            return BS(arr , mid + 1 , j , k);
	        }
	    }
	    int binarysearch(int arr[], int n, int k){
	       
	        return BS(arr , 0 , n - 1 , k);
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
