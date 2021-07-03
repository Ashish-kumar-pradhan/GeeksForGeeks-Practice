package strings;

import java.util.HashMap;

public class Anagram {
	
	
	public static boolean isAnagramHashing(String a,String b)
    {
        
        if(a.length() != b.length()){
            return false;
        }
        
        HashMap<Character , Integer> hp = new HashMap<>();
        
        for(int i = 0 ; i < a.length() ; i++){
            if(hp.containsKey(a.charAt(i))) {
            	hp.put(a.charAt(i), hp.get(a.charAt(i)) + 1);
            }
            else {
            	hp.put(a.charAt(i), 1);
            }
        }
        for(int i = 0 ; i < b.length() ; i++){
        	if(hp.containsKey(b.charAt(i)) && hp.get(b.charAt(i)) > 0) {
            	hp.put(b.charAt(i), hp.get(b.charAt(i)) - 1);
            }
            else {
            	return false;
            }
        }
       
        return true;
    }
	
	
	
	public static boolean isAnagramASCII(String a,String b)
    {
        
        if(a.length() != b.length()){
            return false;
        }
        int arr[] = new int[256];
        int brr[] = new int[256];
        for(int i = 0 ; i < a.length() ; i++){
            arr[a.charAt(i)] += 1; 
        }
        for(int i = 0 ; i < b.length() ; i++){
            brr[b.charAt(i)] += 1; 
        }
        for(int i = 0 ; i < 256 ; i++){
            if(arr[i] != brr[i]) return false; 
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
