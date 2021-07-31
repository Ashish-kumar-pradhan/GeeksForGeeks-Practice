package mathematical;

public class CommonDivisors {
	
	static long commDiv(long a, long b){
        
        long count = 0;
        long fix = Math.min(a,b);
        for(int i = 1; i <= fix ; i = i+1){
            if(a % i == 0 && b % i == 0){
                count = count+1;
            }
        }
        
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
