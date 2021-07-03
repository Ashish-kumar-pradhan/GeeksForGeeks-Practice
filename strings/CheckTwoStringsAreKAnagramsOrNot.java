package strings;

public class CheckTwoStringsAreKAnagramsOrNot {
	
	boolean areKAnagrams(String a, String b, int k)
    {
     //add code here.
     if(a.length() != b.length()){
         return false;
     }
      int arr[] = new int[256];
       int brr[] = new int[256];
       int sum = 0;
       for(int i = 0 ; i < a.length() ; i++){
           arr[a.charAt(i)] += 1; 
       }
       for(int i = 0 ; i < b.length() ; i++){
           brr[b.charAt(i)] += 1; 
       }
       for(int i = 0 ; i < 256 ; i++){
           sum += Math.abs(arr[i] - brr[i]);  
       }
       
       if(k < sum/2){
           return false;
       } 
           
       return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
