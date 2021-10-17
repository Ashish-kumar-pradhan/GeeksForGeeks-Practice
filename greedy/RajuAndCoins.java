package greedy;

import java.util.Arrays;

public class RajuAndCoins {
	
	static int maxNumbers(int n, int k, int a[]){
        // code here
        Arrays.sort(a);
        int i = 0;
        int v = 0;
        int c = 0;
        int sum = 0;
        while(sum <= k){
            v++;
            if(i < n && v == a[i]){
                i++;
            }
            else{
                sum += v;
                c++;
            }
            
        }
        
        return c - 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
