package backtracking;

public class FindWhetherPathExist {
	
	public static boolean solveMaze(int maze[][] , int i , int j , int path[][]) {
		int n = maze.length;
		if(i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
			return false;
		}
		path[i][j] = 1;
		if(maze[i][j] == 2) {
			return true;
		}
		if(solveMaze(maze , i - 1 , j , path)) {
			return true;
		}
		if(solveMaze(maze , i , j + 1 , path)) {
			return true;
		}
		if(solveMaze(maze , i + 1 , j , path)) {
			return true;
		}
		if(solveMaze(maze , i , j - 1 , path)) {
			return true;
		}
		return false;
	}
	
	
    public boolean is_Possible(int[][] grid)
    {
        // Code here
        int sorRow = -1 ;
        int sorCol = -1 ;
        int n = grid.length;
        int[][] path = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(grid[i][j] == 1){
                    sorRow = i ;
                    sorCol = j ;
                }
            }
        }
        
        return solveMaze(grid , sorRow , sorCol , path);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
