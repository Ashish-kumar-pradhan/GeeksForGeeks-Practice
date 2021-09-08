package dp;

public class CountNumbersContaining4 {
	
	static int countNumberswith4(int N) {
        // code here
        int value[] = {0 , 1 , 19 , 271 , 3439 , 40951 , 468559};
        String s = String.valueOf(N);
        int l = s.length();
        int count = 0;
        for(int i = 0 ; i < l ; i++){
            int c = s.charAt(i) - '0';
            int rp = l - i - 1;
            if(c == 4){
               count = count + 4*value[rp] + 1 + (int)(N%Math.pow(10 , rp));
               break;
            }
            else if(c < 4){
                count = count + (c)*value[rp];
            }
            else {
                count = count + (c-1)*value[rp] + (int)Math.pow(10 , rp);
            }
        
        }
        return count;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
