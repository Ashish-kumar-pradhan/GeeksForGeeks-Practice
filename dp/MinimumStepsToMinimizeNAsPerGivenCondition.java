package dp;

public class MinimumStepsToMinimizeNAsPerGivenCondition {
	
	public int minSteps(int N) 
	{ 
	    // Your code goes 
	    int dp[] = new int[N + 1];
	    dp[1] = 0;
	    for(int i = 2; i <= N ; i++){
	        int op1 = dp[i-1];
	        int op2 = Integer.MAX_VALUE;
	        int op3 = Integer.MAX_VALUE;
	        
	        if(i%2==0){
	            op2 = dp[i/2];
	        }
	        if(i%3==0){
	            op3 = dp[i/3];
	        }
	        
	        dp[i] = 1 + Math.min(op3 , Math.min(op1 , op2));
	    }
	    
	    return dp[N];
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
