package gencElevate;

public class Fcgcg {
	
	public String modify_variableName(String input1) {
		String s = "";
		int n = input1.length();
		for(int i = 0 ; i < n ; i++) {
			if(Character.isUpperCase(input1.charAt(i))) {
				s = s + "_" ;
			}
			s = s + input1.charAt(i);
		}
		s.toLowerCase();
		
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
