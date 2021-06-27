package strings;

import java.util.ArrayList;
import java.util.Collections;

public class StringPermutations {
	
	public void perH(String S , String ans ,ArrayList<String> arr){
        if(S.length() == 0){
            arr.add(ans);
            return;
        }
        for(int i = 0 ; i < S.length() ; i++){
            perH(S.substring(0 , i) + S.substring(i + 1) , ans + S.charAt(i) , arr);
        }
    }
    public ArrayList<String> permutation(String S)
    {
        ArrayList<String> arr = new ArrayList<String>();
        String ans = "";
        perH(S , ans , arr);
        Collections.sort(arr);
        return arr ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
