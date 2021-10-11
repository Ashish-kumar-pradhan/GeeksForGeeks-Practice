package arrays;

public class RedORGreen {
	
	static int RedOrGreen(int N, String S) {
        //code here
        int cR = 0;
        int cG = 0;
        for(int i = 0 ; i < N ; i++){
            if(S.charAt(i) == 'R'){
                cR++;
            }
            else{
                cG++;
            }
        }
        
        return Math.min(cG , cR); 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
