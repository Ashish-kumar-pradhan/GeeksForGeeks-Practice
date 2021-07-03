package strings;

public class AnagramOfString {
	
	public int remAnagrams(String a,String b){
        
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
        return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
