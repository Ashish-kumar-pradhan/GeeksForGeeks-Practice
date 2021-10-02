package strings;

import java.util.ArrayList;
import java.util.Collections;

public class ExtractTheNumberFromTheString {
	
	long ExtractNumber(String S){
        //code here
        int n = S.length();
        ArrayList<Long> arr = new ArrayList<>();
        long num = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(S.charAt(i) >= '0' && S.charAt(i) <= '9'){
                num = num*10 + (long)(S.charAt(i) - '0');
                if(S.charAt(i) == '9'){
                    num = -1;
                }
            }
            else if(num > 0) {
                arr.add(num);
                num = 0;
            }
            else {
                num = 0;
            }
        }
        if(num > 0) {
            arr.add(num);
        }
        
        if(arr.size() == 0){
            return -1;
        }
        
        return Collections.max(arr);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
