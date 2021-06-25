package strings;

import java.util.ArrayList;
import java.util.TreeSet;

public class StringSubsequenceGame {
	
	static boolean chv(char a){
        if(a == 'a' || a == 'i' || a == 'e' || a == 'o' || a == 'u') return true;
        else return false;
    }
	
	static void powerSet(String str, int index, String curr , ArrayList<String> arr ){
	    int n = str.length();
	    if (index == n)
	    {
	        arr.add(curr);
	        return;
	    }
	    powerSet(str, index + 1, curr + str.charAt(index) , arr);
	    powerSet(str, index + 1, curr , arr);
	 
	}
	static TreeSet<String> allPossibleSubsequences(String s) {
		
		ArrayList<String> arr = new ArrayList<String>();
		powerSet(s , 0, "" , arr);
		TreeSet<String> ans = new TreeSet<String>();
		for(int i = 0; i < arr.size() ; i++) {
			String str = arr.get(i);
			int l = str.length();
			if(l > 1 && chv(str.charAt(0)) && !chv(str.charAt(l - 1))){
			ans.add(arr.get(i));
			}
		}
		return ans;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
