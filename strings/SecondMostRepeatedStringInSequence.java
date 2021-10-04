package strings;

import java.util.HashMap;

public class SecondMostRepeatedStringInSequence {
	
	String secFrequent(String arr[], int N)
    {
        // your code here
        HashMap<String , Integer> hp = new HashMap<>();
        
        for(int i = 0 ; i < N ; i++){
            if(hp.containsKey(arr[i])){
                hp.put(arr[i] , 1 + hp.get(arr[i]));
            }
            else {
                hp.put(arr[i] , 1);
            }
        }
        
        String ms = "";
        int m = -1;
        
        for(int i = 0 ; i < N ; i++){
            if(m < hp.get(arr[i])){
                ms = arr[i];
                m = hp.get(arr[i]);
            }
        }
        
        hp.put(ms , 0);
        ms = "";
        m = -1;
        
        for(int i = 0 ; i < N ; i++){
            if(m < hp.get(arr[i])){
                ms = arr[i];
                m = hp.get(arr[i]);
            }
        }
        
        return ms;
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
