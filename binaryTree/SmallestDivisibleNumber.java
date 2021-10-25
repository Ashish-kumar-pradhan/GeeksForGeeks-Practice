package binaryTree;

public class SmallestDivisibleNumber {
	
	public static long getSmallestDivNum(int n){
        // code here
        long pr[] = {2 , 3 , 5 , 7 , 11 , 13 , 17 , 19 , 23};
        long ans = 1;
        for(int i = 0 ; i < pr.length ; i++){
            long t = (long)n;
            if(pr[i] > t){
                break;
            }
            while(t >= pr[i]){
                t = t/pr[i];
                ans = ans*pr[i];
            }
            
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
