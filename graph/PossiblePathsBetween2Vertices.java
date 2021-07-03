package graph;

import java.util.ArrayList;

public class PossiblePathsBetween2Vertices {
	
public static void countPathDFS(ArrayList<ArrayList<Integer>> adj , int s, int d , boolean[] visited , int[] c) {
		
		int n = adj.size();
		visited[s] = true;
		if(s == d) {
			c[0]++;
		}
		else {
    		ArrayList<Integer> list = adj.get(s);
    		for(int i = 0 ; i < list.size() ; i++) {
    			if(!visited[list.get(i)]) {
    				countPathDFS(adj , list.get(i) , d , visited , c);
    				visited[list.get(i)] = false;
    			} 
    		}
		}
	}

    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source, int destination)
    {
        
        boolean visited[] = new boolean[V];
		int[] c = new int[1];
		countPathDFS(adj , source , destination , visited , c );
		
		return c[0];
        
    }


}
