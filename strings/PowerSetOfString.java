package strings;

import java.util.ArrayList;

public class PowerSetOfString {
	
	static void powerSet(String str, int index, String curr , ArrayList<String> arr){
    int n = str.length();
 
    if (index == n)
    {
        arr.add(curr);
        return;
    }
    powerSet(str, index + 1, curr + str.charAt(index) , arr);
    powerSet(str, index + 1, curr , arr);
 
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr = new  ArrayList<String>();
		
		String S = "Ashish";
		powerSet(S , 0 , "" , arr);
		
		System.out.println(arr.size());
		
		for(int i = 0 ; i < arr.size() ; i++) {
			System.out.println(arr.get(i));
		}

	}

}
