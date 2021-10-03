package dp;

public class OptimalWalk {
	
	static long optimalWalk(long N, long A, long B)
    {
        // code here
        int n = (int)N;
        long dp[] = new long[n+1];
        dp[0] = 0;
        for(int i = 1 ; i <= n ; i++){
            long op1 = A + dp[i-1];
            long op2 = Long.MAX_VALUE;
            if(i%2==0){
                op2 = B + dp[i/2];
            }
            
            dp[i] = Math.min(op1 , op2);
        }
        
        return dp[n];
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
