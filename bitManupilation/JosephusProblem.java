package bitManupilation;

public class JosephusProblem {
	

    public int jose(int n, int k){
        if(n == 1){
            return 0;
        }
        int x = jose(n-1, k);
        int y = (x + k) % n;
        return y; 
   }
   
   public int josephus(int n, int k)
   {
       return 1 + (jose(n, k));
       
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
