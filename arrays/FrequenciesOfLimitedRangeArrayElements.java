package arrays;

public class FrequenciesOfLimitedRangeArrayElements {
	
	 public static void frequencyCount(int arr[], int N, int P)
	    {
	        // code here
	        for(int i = 0 ; i < N ; i++){
	            if(arr[i] > N) arr[i] = 0;
	        }
	        int v = N + 1 ;
	        for(int i = 0 ; i < N ; i++){
	            int a = (arr[i] % v);
	            if(a != 0){
	                arr[a-1] += v;
	            }
	        }
	        
	        for(int i = 0 ; i < N ; i++){
	            arr[i] = arr[i]/v;
	        }
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
