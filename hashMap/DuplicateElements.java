package hashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateElements {
	
	public static void SortedDuplicates(int arr[], int n)
    {
        //Your code here
         HashMap<Integer , Integer> hp = new HashMap<>();
	     ArrayList<Integer> ans = new ArrayList<>();
	        for(int i = 0 ; i < n ; i++){
	            if(hp.containsKey(arr[i])){
	                if(hp.get(arr[i]) == 1){
	                    ans.add(arr[i]);
	                }
	                hp.put(arr[i] , hp.get(arr[i]) + 1);
	            }
	            else {
	                hp.put(arr[i] , 1);
	            }
	        }
	        
	        if(ans.size() == 0){
	            System.out.print(-1);
	        }
	        
	        Collections.sort(ans);
	        
	        for(int i = 0 ; i < ans.size(); i++){
	            System.out.print(ans.get(i) + " ");
	        }
	        
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
