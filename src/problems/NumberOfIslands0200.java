package problems;

public class NumberOfIslands0200 {

    public int numIslands(char[][] grid) {
            
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                count += verify(grid, i, j);        
            }
        }
        return count;
    }
    
    private int verify(char grid[][], int i, int j) {
        if (i >= grid.length || i < 0 || j >= grid[0].length || j < 0)
            return 0;
        
        if (grid[i][j] == '1') {
            grid[i][j] = 'v';
            verify(grid, i, j+1);
            verify(grid, i, j-1);
            verify(grid, i+1, j);
            verify(grid, i-1, j);
            return 1;
        }
        
        return 0;
    }

}