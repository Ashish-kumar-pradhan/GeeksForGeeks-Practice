package graph;

import java.util.ArrayList;

public class PrintAdjacencylist {
	
	public ArrayList<ArrayList<Integer>> printGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        for (int i = 0; i < adj.size(); i++)
        adj.get(i).add(0, i);
        
        return adj;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
