package dp;

public class NthFibonacciNumber {
	
	static long nthFibonacci(long n){
        // code here
        if(n == 0 || n == 1 ){
            return n;
        }
        int prep = 0;
        int pre = 1;
        int cur = 1;
        for(int i = 2 ; i <= n ; i++){
            cur = (prep + pre)%1000000007;
            prep = pre;
            pre = cur;
        }
        
        return cur;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
