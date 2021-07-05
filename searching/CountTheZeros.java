package searching;

public class CountTheZeros {
	
	void czH(int arr[] ,int n, int i , int j , int[] ans){
        if(i > j){
            return;
        }
        int mid = (i + j)/2;
        if(arr[mid] == 0){
            if(arr[mid-1] == 1) {
                ans[0] = n - mid;
                return;
            }
            else {
                czH(arr , n , i , mid - 1 , ans);
            }
        }
        else if(arr[mid] == 1){
            if(arr[mid+1] == 0) {
                ans[0] = n - mid - 1;
                return;
            }
            else {
                czH(arr , n , mid + 1 , j , ans);
            }
        }
    }
	int countZeroes(int[] arr, int n) {
	    // code here
	    if(arr[0] == 0){
	        return n;
	    }
	    if(arr[n - 1] == 1){
	        return 0;
	    }
	    int ans[] = {0};
	    czH(arr , n , 0 , n - 1 , ans);
	    
	     return ans[0];
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
