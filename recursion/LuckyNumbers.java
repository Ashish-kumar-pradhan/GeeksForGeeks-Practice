package recursion;

public class LuckyNumbers {
	
	public static boolean isLH(int n , int c)
    {
        if(c > n){
            return true;
        }
        if(n % c == 0){
            return false;
        }
        
        n = n - n/c;
       return isLH(n , c + 1);
        
    }
    public static boolean isLucky(int n)
    {
       return isLH(n , 2 );
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
