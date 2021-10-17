package greedy;

public class TheSpiderSteps {
	
	static int minStep(int H, int U, int D){
        // code here
        int sum = 0;
        int c = 0;
        while(sum < H){
            sum += U;
            c++;
            if(sum > H){
                break;
            }
            sum -= D; 
        }
        
        return c;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
