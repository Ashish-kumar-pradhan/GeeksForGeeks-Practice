package dp;

import java.math.BigInteger;

public class NthCatalanNumber {
	
	public static BigInteger findCatalan(int n)
    {
        //Your code here
        BigInteger[] catalan = new BigInteger[101];
        catalan[0] = BigInteger.ONE;
        catalan[1] = BigInteger.ONE;
        for(int i = 2 ; i <= n ; i++){
            catalan[i] = BigInteger.ZERO;
            for(int j = 0 ; j < i ; j++){
                catalan[i] = catalan[i].add(catalan[j].multiply(catalan[i-j-1]));
            }
        }
        
        return catalan[n];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
