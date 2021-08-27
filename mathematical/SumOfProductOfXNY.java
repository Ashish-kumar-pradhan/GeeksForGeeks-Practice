package mathematical;

public class SumOfProductOfXNY {
	
	public long sumofproduct(int n)
    {
        // code here
        int y = 0;
        long sum = 0;
        for(int x = 1 ; x <= n ; x++){
            y=n/x;
            sum += (long)(x*y);
        }
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
