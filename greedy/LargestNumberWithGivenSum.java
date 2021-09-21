package greedy;

public class LargestNumberWithGivenSum {
	
	static String largestNumber(int n, int sum)
    {
        // add your code here
        if(sum > n*9) return "-1";
        
        String ans = "";
        for(int i = 0 ; i < n ; i++){
            if(sum == 0){
                ans += 0;
            }
            else if(sum < 9){
                ans += sum;
                sum = 0;
            }
            else{
                ans += 9;
                sum -= 9;
            }
        }
        
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
