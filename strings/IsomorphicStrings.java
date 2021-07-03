package strings;

public class IsomorphicStrings {
	
	public static boolean areIsomorphic(String a,String b)
    {
        
         if(a.length() != b.length()){
            return false;
        }
        int arr[] = new int[256];
        int brr[] = new int[256];
        for(int i = 0 ; i < a.length() ; i++){
            arr[a.charAt(i)] += 1; 
        }
        for(int i = 0 ; i < b.length() ; i++){
            brr[b.charAt(i)] += 1; 
        }
        for(int i = 0 ; i < a.length() ; i++){
            if(arr[a.charAt(i)] != brr[b.charAt(i)]) return false; 
        }
        return true;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
