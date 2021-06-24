package recursion;

public class PowerOfNumbers {
	
	static long fastPower(long a, long b, int n) {
		
		long res = 1;
		while ( b > 0) {
			if ((b&1) != 0) {
				res = (res * a % n) % n;
			}
			a = (a % n * a % n) % n;
			b =  b >> 1;
		}
		return res;
	}
        
    long power(int N,int R)
    {
        long a = (long)N;
        long b = (long)R;
        int big = 1000000007; 
        return fastPower(a,b,big);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
