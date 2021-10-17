package greedy;

import java.util.Arrays;

public class MinimizeTheSumOfProduct {
	
	public long minValue(long a[], long b[], long n) 
    {
        // Your code goes here
        int l = (int)n;
        long ans = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0 ; i < l ; i++){
            ans = ans + a[i]*b[l-i-1];
        }
        
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
