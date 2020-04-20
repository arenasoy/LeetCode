package problems;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumPathSum0064 {
    
    class Node {
        int i;
        int j;
        int val;
        int dist;
        
        public Node(int i, int j, int val, int dist) {
            this.i = i;
            this.j = j;
            this.val = val;
            this.dist = dist;
        }
    }
    
    class Comp implements Comparator<Node> {

        @Override
        public int compare(Node a, Node b) {
            return a.dist > b.dist ? 1 : -1;
        
        }
    }
    
    public int minPathSum(int[][] grid) {
     
        PriorityQueue<Node> queue = new PriorityQueue<Node>(new Comp());
        boolean vis[][] = new boolean[grid.length][grid[0].length];
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                vis[i][j] = false;
            }
        }
        
        Node cur = new Node(0, 0, grid[0][0], grid[0][0]);
        
        queue.add(cur);
        
        while (!queue.isEmpty()) {
            
            cur = queue.poll();
            if (vis[cur.i][cur.j])
                continue;
            
            if (cur.i == grid.length - 1 && cur.j == grid[0].length - 1) {
                return cur.dist;
            }
            
            if (cur.i + 1 < grid.length) {
                queue.add(new Node(cur.i + 1, cur.j, grid[cur.i + 1][cur.j], cur.dist + grid[cur.i + 1][cur.j]));
            }
            
            if (cur.j + 1 < grid[0].length) {
                queue.add(new Node(cur.i, cur.j + 1, grid[cur.i][cur.j + 1], cur.dist + grid[cur.i][cur.j + 1]));
            }
            
            vis[cur.i][cur.j] = true;
        }
        
        return -1;
        
    }

}