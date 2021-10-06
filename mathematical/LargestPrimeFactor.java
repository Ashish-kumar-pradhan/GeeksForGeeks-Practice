package mathematical;

public class LargestPrimeFactor {
	
	static long largestPrimeFactor(int N) {
        // code here
        int i = 2;
        while(N != 1){
            while(N % i == 0){
                N = N/i;
            }
            i++;
        }
        
        return (long)(i-1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
