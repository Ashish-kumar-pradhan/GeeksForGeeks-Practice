package hashMap;

import java.util.HashMap;

public class TwiceCounter {
	
	public int countWords(String list[], int n)
    {
        // code here 
        int count = 0;
        HashMap<String , Integer> hp = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            if(hp.containsKey(list[i])){
                hp.put(list[i] , 1 + hp.get(list[i]));
            }
            else {
                hp.put(list[i] , 1);
            }
        }
        
        for(int i = 0 ; i < n ; i++){
            if(hp.get(list[i]) == 2){
                count++;
            }
        }
        return count/2;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
