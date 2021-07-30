package strings;

import java.util.Scanner;

public class WeightOfStrings {
	
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    String s1 = s.next();
		    String s2 = s.next();
		    int sum1 = 0;
		    int sum2 = 0;
		    for(int i = 0 ; i < s1.length() ; i++){
		        int x = s1.charAt(i) - 'a' + 1;
		        sum1 += x; 
		    }
		    for(int i = 0 ; i < s2.length() ; i++){
		        int x = s2.charAt(i) - 'a' + 1;
		        sum2 += x; 
		    }
		    
		    if(sum1 == sum2){
		        System.out.println("equal");
		    }
		    else if(sum1 > sum2){
		        System.out.println(1);
		    }
		    else{
		        System.out.println(2);
		    }
		}
	}

}
