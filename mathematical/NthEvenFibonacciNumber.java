package mathematical;

public class NthEvenFibonacciNumber {
	
	static long nthEvenFibonacci(long n){
        // code here
        int l = 3*(int)n;
        long dp[] = new long[l+1];
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3 ; i <= l ; i++){
            dp[i] = (dp[i-1] + dp[i-2])%1000000007;
        }
        return dp[l];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
