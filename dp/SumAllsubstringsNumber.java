package dp;

public class SumAllsubstringsNumber {

	public static long sumSubstrings(String s)
    {
    //Your code 
        int n = s.length();
        long dp[] = new long[n+1];
        for(int i = 1 ; i <= n ; i++){
            long v = s.charAt(i-1) - '0';
            dp[i] = (i*v + 10*dp[i-1])%1000000007;
        }
        long sum = 0;
        
        for(int i = 1 ; i <= n ; i++){
            sum = (sum + dp[i])%1000000007; 
        }
        return sum;
      
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
