package greedy;

public class MaximumSumOfIncreasingOrderElementsFromNArrays {
	
	public static int max(int a[] , int m , int p){
        int max = 0;
        for(int i = 0 ; i < m ; i++){
            if(p > a[i] && max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
    
    public static int maximumSum (int n, int m, int arr[][]) {
        //Complete the function
        int p = 1000000;
        int sum = 0;
        for(int i = n - 1 ; i >= 0 ; i--){
            p = max(arr[i] , m , p);
            sum += p;
            if(p == 0){
                sum = 0;
                break;
            }
        }
        
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
