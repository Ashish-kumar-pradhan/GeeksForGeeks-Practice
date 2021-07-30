package strings;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
	
	public static void main (String[] args) {
		//code
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    String str = s.next();
		    int n = str.length();
		    char arr[] = new char[n];
		    for(int i = 0 ; i < n ; i++){
		        arr[i] = str.charAt(i);
		    }
		    
		    Arrays.sort(arr);
		    str = "";
		    for(int i = 0 ; i < n ; i++){
		        str += arr[i];
		    }
		    System.out.println(str);
		}
	}

}
