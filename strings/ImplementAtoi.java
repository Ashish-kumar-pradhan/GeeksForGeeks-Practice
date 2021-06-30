package strings;

public class ImplementAtoi {
	
	 int atoi(String str)
	    {
		int ans = 0;
		int i=0;
		int n = str.length();
		if(str.charAt(0) == '-'){
		    i = 1;
		}
		for(;i< n ;i++) {
		  int cur = Character.getNumericValue(str.charAt(i));
		  if(cur>= 0 && cur<= 9 ){
		      ans = 10*ans + cur;
		  }
	      else return -1;
	    }
	    
	    if(str.charAt(0) == '-'){
		    ans *= -1;
		}
	    
	    return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
