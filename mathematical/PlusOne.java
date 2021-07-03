package mathematical;

import java.util.ArrayList;

public class PlusOne {
	
	static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        
        int nine = 0;
        int i = N - 1;
        while(i >= 0 && arr.get(i) == 9){
           i--;
           nine++;
        }
        
        if(nine == N){
            arr.set(0 , 1);
            for(int j = 1 ; j < N ; j++){
                arr.set(j , 0);
            }
            arr.add(0);
        }
        else {
            for(int j = N - nine ; j < N ; j++){
                arr.set(j , 0);
            }
            arr.set(N - 1 - nine , arr.get(N - 1 - nine) + 1);
        }
        
        return arr;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
