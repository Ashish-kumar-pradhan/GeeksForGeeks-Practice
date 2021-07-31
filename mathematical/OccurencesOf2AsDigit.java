package mathematical;

public class OccurencesOf2AsDigit {
	
	public static long count2s(long n)
    {
        long total=0;
        for(long i = 1 ; i <= n ; i++){
            total = total + count2sinRangeAtDigit(i , 0);
        }
        return total;
        
    }
    
    public static long count2sinRangeAtDigit(long n, long d)
    {
        
        if(n<10){
            if(n==2){
                return 1;
            }
            else{
                return 0;
            }
        }
        else{
            if(n%10==2){
                return 1 + count2sinRangeAtDigit(n/10 , 0);
            }
            else{
                return 0 + count2sinRangeAtDigit(n/10 , 0);
            }
        }
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
