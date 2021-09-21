package greedy;

import java.util.Arrays;

public class MaximizeToys {
	
	 static int toyCount(int N, int K, int arr[])
	    {
	        // code here
	        Arrays.sort(arr);
	        int c = 0;
	        for(int i : arr){
	            K -= i;
	            if(K >= 0) c++;
	            if(K < 0) break;
	        }
	        
	        return c;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
