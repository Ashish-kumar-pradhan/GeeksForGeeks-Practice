package mathematical;

public class ForLoopPrimeCheck {
	
	static String isPrime(int n) {
        
        if(n < 2){
            return "No";
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return "No";
            }
        }
        
        return "Yes";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
