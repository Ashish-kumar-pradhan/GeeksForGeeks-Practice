package searching;

public class IndexOfExtraElement {
	
	void Help(int a[] , int b[] , int i , int j , int[] ans){
        if(i > j){
            return;
        }
        int mid = (i + j)/2;
        if(a[mid] == b[mid]){
            if(a[mid+1] != b[mid+1]) {
                ans[0] = mid + 1;
                return;
            }
            else {
                Help(a , b , mid + 1 , j , ans);
            }
        }
        else if(a[mid] != b[mid]){
            if(a[mid-1] == b[mid - 1]) {
                ans[0] = mid;
                return;
            }
            else {
                Help(a , b , i , mid - 1, ans);
            }
        }
    }
    public int findExtra(int a[], int b[], int n) {
        // add code here.
        if(a[0] != b[0]){
	        return 0;
	    }
	    if(a[n - 2] == b[n-2]){
	        return n-1;
	    }
	    int ans[] = {0};
	    Help(a , b , 0 , n - 1 , ans);
	    
	     return ans[0];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
