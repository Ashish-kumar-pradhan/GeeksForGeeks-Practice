package dp;

public class KPalindrome {
	
	boolean is_k_palin(String str, int k)
    {
	// Your code here
	    int n = str.length();
	    int dp[][] = new int[n][n];
	    int max = 1;
	    for(int i = 0 ; i < n ; i++){
	        dp[i][i] = 1;
	    }
	    for(int i = 1 ; i < n ; i++){
	        if(str.charAt(i-1) == str.charAt(i)){
	            dp[i-1][i] = 2;
	        } 
	        else{
	            dp[i-1][i] = 1;
	        }
	        if(max < dp[i-1][i]) {
	            max = dp[i-1][i];
	        }
	    }
	    for(int i = 2 ; i < n ; i++){
	        for(int j = 0 ; i + j < n ; j++){
	            if(str.charAt(j) == str.charAt(i + j)){
	                dp[j][i + j] = 2 + dp[j+1][i+j-1];
    	        } 
    	        else {
    	            dp[j][i+j] = Math.max(dp[j+1][i+j] , dp[j][i+j-1]);
    	        }
    	        
    	        if(max < dp[j][i + j]) {
    	            max = dp[j][i + j];
    	        }
	        }
	    } 
	    
	    return (n - max) <= k;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
