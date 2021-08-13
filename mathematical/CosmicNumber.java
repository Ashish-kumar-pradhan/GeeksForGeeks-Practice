package mathematical;

import java.util.Scanner;

public class CosmicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int n = s.nextInt();
    		String str = "";
    		if(n == 0){
    		    str = "0";
    		}
    		int v = n;
    		while(v >= 9){
    		    str = "9" + str;
    		    v = v - 9;
    		}
    		
    		if(v != 0){
    		    str = Integer.toString(v) + str;
    		}
    		
    		for(int i = 0 ; i < n ; i++){
    		    str += "0";
    		}
    		
    		System.out.println(str);
		}

	}

}
