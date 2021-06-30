package strings;

import java.util.ArrayList;

public class MultiplyTwoStrings {
	
	public static String multiplyStrings(String s1,String s2)
    {
        //code here.
		 if(s1.equals("0") || s2.equals("0")){
	            return "0";
	        }
	        int end1 = 0;
	        int end2 = 0;
	        boolean sign = true;
	        if(s1.charAt(0) == '-' && s2.charAt(0) == '-'){
	            end1++;
	            end2++;
	        }
	        else if(s1.charAt(0) == '-'){
	            end1++;
	            sign = false;
	        }
	        else if(s2.charAt(0) == '-'){
	            end2++;
	            sign = false;
	        }
	        
	        
	        ArrayList<Integer> arr = new ArrayList<>();
	        int n1 = s1.length();
	        int n2 = s2.length();
	        int start = 0;
	        for(int i = n2 - 1 ; i >= end2 ; i--){
	            int mul = Character.getNumericValue(s2.charAt(i));  
	            int carry = 0;
	            int flow = start;
	            for(int j = n1 - 1 ; j >= end1 ; j--){
	                int cur = Character.getNumericValue(s1.charAt(j));
	                int val = (mul*cur + carry)%10;
	                carry = (mul*cur + carry)/10;
	                if(flow >= arr.size()) {
	                	arr.add(val);
	                }
	                else {
	                	int sum = (val + arr.get(flow))%10;
	                	carry += (val + arr.get(flow))/10;
	                	arr.set(flow , sum);
	                }
	                flow++;
	            }
	            arr.add(carry);
	            start++;
	        }
	        
	        String ans = "";
	        int k = arr.size() - 1;
	        while(arr.get(k)==0){
	            k--;
	        }
	        
	        for(; k >= 0 ; k--){
	            ans += arr.get(k);
	        }
	        
	        if(!sign) ans = "-" + ans;
	        
	        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(multiplyStrings("12" , "-34"));

	}

}
