package mathematical;

import java.util.Arrays;

public class MaximumTipCalculator {
	
	long maxTip(int[] a, int[] b, int n, int x, int y) {
        // code here
        int arr[][] = new int[n][3];
        for(int i = 0 ; i < n ; i++){
            arr[i][0] = a[i];
            arr[i][1] = b[i];
            arr[i][2] = a[i] - b[i];
        }
        Arrays.sort(arr, (c,d) -> Integer.compare(c[2], d[2]));
        
        long sum = 0;
        for(int i = 0 ; i < n-x ; i++){
            sum += (long)arr[i][1];
        }
        for(int i = y ; i < n ; i++){
            sum += (long)arr[i][0];
        }
        
        for(int i = n - x ; i < y ; i++){
            sum += (long)Math.max(arr[i][0] , arr[i][1]);
        }
        
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
