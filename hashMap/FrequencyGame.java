package hashMap;

import java.util.HashMap;

public class FrequencyGame {
	
	 public static int LargButMinFreq(int arr[], int n)
	    {
	        // Your code here
	        
	        HashMap<Integer , Integer> hp = new HashMap<>();
	        
	        for(int i = 0 ; i < n ; i++){
	            if(hp.containsKey(arr[i])){
	                hp.put(arr[i] , hp.get(arr[i]) + 1);
	            }
	            else {
	                hp.put(arr[i] , 1);
	            }
	        }
	        
	        int minI = Integer.MAX_VALUE;
	        int maxV = 0;
	        
	        for(int i = 0 ; i < n ; i++){
	           
	            if(minI > hp.get(arr[i])){
	                minI = hp.get(arr[i]);
	                maxV = arr[i];
	            }
	            else if(minI == hp.get(arr[i])){
	                
	                if(maxV < arr[i]){
	                    maxV = arr[i];
	                }
	            }
	        }
	        return maxV;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
