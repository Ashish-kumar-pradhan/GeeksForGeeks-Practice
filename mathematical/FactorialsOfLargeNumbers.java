package mathematical;

import java.util.ArrayList;
import java.util.Collections;

public class FactorialsOfLargeNumbers {
	
	static void mul(int m , ArrayList<Integer> arr){
        
        int carry = 0;
        int n = arr.size();
        for(int i = 0 ; i < n ; i++){
            int val = (m*arr.get(i) + carry)%10;
            carry = (m*arr.get(i) + carry)/10;
            arr.set(i , val);
        }
        while(carry > 0){
            arr.add(carry%10);
            carry = carry/10;
        }
    }
    
    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        for(int i = 2 ; i <= N ; i++){
            mul(i , arr);
        }
        Collections.reverse(arr);
        return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
