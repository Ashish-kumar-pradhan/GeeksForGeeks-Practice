package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintPattern {
	
	static void fill(List<Integer> ans , int N , int i){
        if(i <= 0){
            ans.add(i);
            return;
        }
        ans.add(i);
        fill(ans , N , i - 5);
        ans.add(i);
    }
    static List<Integer> pattern(int N){
        // code here
        List<Integer> ans = new ArrayList<>();
        fill(ans , N , N);
        
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
