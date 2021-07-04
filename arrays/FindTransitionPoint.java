package arrays;

public class FindTransitionPoint {
	
	 void tpH(int arr[] , int i , int j , int[] ans){
	        if(i > j){
	            return;
	        }
	        int mid = (i + j)/2;
	        if(arr[mid] == 0){
	            if(arr[mid+1] == 1) {
	                ans[0] = mid + 1;
	                return;
	            }
	            else {
	                tpH(arr , mid + 1 , j , ans);
	            }
	        }
	        else if(arr[mid] == 1){
	            if(arr[mid-1] == 0) {
	                ans[0] = mid;
	                return;
	            }
	            else {
	                tpH(arr , i , mid - 1 , ans);
	            }
	        }
	    }
	    int transitionPoint(int arr[], int n) {
	        // code here
	        if(arr[0] == 1){
	            return 0;
	        }
	        if(arr[n - 1] == 0){
	            return -1;
	        }
	        int ans[] = {0};
	        tpH(arr , 0 , n - 1 , ans);
	        
	         return ans[0];
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
