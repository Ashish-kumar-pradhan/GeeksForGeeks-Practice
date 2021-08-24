package searching;

public class FloorInASortedArray {
	
	static int i;
    static void BS(long arr[], long x , int l , int r){
        if(l > r) return;
        int m = (l + r)/2;
        if(arr[m] == x) {
            i = m;
            return;
        }
        
        if(arr[m] < x){
            if(arr[m+1] > x){
                i = m;
                return;
            }
            else{
                BS(arr , x , m + 1 , r);
            }
        }
        if(arr[m] > x){
            if(arr[m-1] < x){
                i = m-1;
                return;
            }
            else{
                BS(arr , x , l , m-1);
            }
        }
        
        
    }
    static int findFloor(long arr[], int n, long x)
    {
        if(x < arr[0]) return -1;
        if(x >= arr[n-1]) return n-1;
        BS(arr , x , 1 , n-2);
        
        return i;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
