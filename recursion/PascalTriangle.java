package recursion;

import java.util.ArrayList;

public class PascalTriangle {
	
	ArrayList<Long> nRPT(int n , ArrayList<Long> arr , int i , long big){
        if(i == n ){
            return arr;
        }
        if(i > 0){
            long pre = arr.get(0);
            for(int j = 1 ; j < arr.size() ; j++){
                long cur = arr.get(j);
                arr.set(j , (pre + cur)%big);
                pre = cur;
            }
        }
        
        long l = 1;
        arr.add(l);
        
        return nRPT(n , arr , i + 1 , big); 
    }
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Long> arr = new ArrayList<Long>();
        return nRPT(n , arr , 0 , 1000000007);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
