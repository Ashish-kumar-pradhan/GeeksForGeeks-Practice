package strings;

public class ImplementStrstr {
	
	int strstr(String s, String x)
    {
		
       int n = s.length();
       int l = x.length();
       for(int i = 0 ; i <= n-l ; i++){
           if(x.equals(s.substring(i , i + l))){
               return i;
           }
       }
       return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
