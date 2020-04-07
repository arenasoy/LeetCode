package problems;

public class NumberOfIslands0200 {

    private char m[][];
    
    public int numIslands(char[][] grid) {
        
        this.m = grid;
        
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                count += verify(i, j);        
            }
        }
        return count;
    }
    
    private int verify(int i, int j) {
        if (i >= m.length || i < 0 || j >= m[0].length || j < 0)
            return 0;
        
        if (m[i][j] == '1') {
            m[i][j] = 'v';
            verify(i, j+1);
            verify(i, j-1);
            verify(i+1, j);
            verify(i-1, j);
            return 1;
        }
        
        return 0;
    }

}