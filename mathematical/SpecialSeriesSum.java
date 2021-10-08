package mathematical;

public class SpecialSeriesSum {
	
	static long sumOfTheSeries(long n){
        // code here
        long sum = 0;
        long totalSum = 0; 
        for(int i = 1 ; i <= n ; i++){
            sum += i;
            totalSum += sum;
        }
        return totalSum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
