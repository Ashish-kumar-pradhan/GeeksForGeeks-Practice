package linkedList;

public class LinkedListOfStringsFormsPalindrome {
	
	public static boolean isP(String s){
        int n = s.length();
        for(int i = 0 ; i < n/2 ; i++){
            if(s.charAt(i) != s.charAt(n-i-1)) return false;
        }
        
        return true;
    }
    public static boolean compute(Node node)
    {
        String s = "";
        Node temp = node;
        while(temp != null){
            s += temp.data;
            temp = temp.next;
        }
        
        return isP(s);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
