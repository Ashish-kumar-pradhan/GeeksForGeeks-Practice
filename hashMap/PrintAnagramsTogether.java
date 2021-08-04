package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class PrintAnagramsTogether {
	
	public static List<List<String>> Anagrams(String[] string_list) {
        
        // Your Code here
        int n = string_list.length;
        List<List<String>> ans = new ArrayList<>();
        HashMap<String , HashMap<Character , Integer>> ana = new HashMap<>();
        
        for(int i = 0 ; i < n ; i++){
        	HashMap<Character , Integer> hp = new HashMap<>();
            mapFill(string_list[i] , hp);
            ana.put(string_list[i] , hp);
        }
        
        boolean visited[] = new boolean[n]; 
        for(int i = 0 ; i < n ; i++){
        	if(!visited[i]) {
        		List<String> smArr = new ArrayList<>();
        		smArr.add(string_list[i]);
        		visited[i] = true;
        		int j = i + 1;
        		while(j < n) {
        			if(!visited[j] && ana.get(string_list[i]).equals(ana.get(string_list[j]))) {
        				smArr.add(string_list[j]);
                		visited[j] = true;
                		j++;
        			}
        		}
        		ans.add(smArr);
        	}
        }
        return ans;
        
    }

	private static void mapFill(String s, HashMap<Character, Integer> hp) {
		for(int i = 0 ; i < s.length() ; i++) {
			if(hp.containsKey(s.charAt(i))) {
				hp.put(s.charAt(i), 1 + hp.get(s.charAt(i)));
			}
			else {
				hp.put(s.charAt(i), 1);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[] = {"act" , "god" , "cat" , "dog" ,"tac"};
		List<List<String>> ans = Anagrams(s);
		
		for(int i = 0 ; i < ans.size() ; i++) {
			for(int j = 0 ; j < ans.get(i).size() ; j++) {
				System.out.print(ans.get(i).get(j) + " ");
			}
			System.out.println();
		}

	}

}
