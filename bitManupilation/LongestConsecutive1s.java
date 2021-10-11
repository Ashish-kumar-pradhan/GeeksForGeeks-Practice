package bitManupilation;

public class LongestConsecutive1s {
	
    public static int maxConsecutiveOnes(int N) {
        
        // Your code here
        int cm = 0;
        int om = 0;
        while(N > 0){
            if((N & 1) == 1){
                cm++;
                if(cm > om) om = cm;
            }
            else{
                cm = 0;
            }
            
            N = N>>1;
            
        }
        
        return om;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
