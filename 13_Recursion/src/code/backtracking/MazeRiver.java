package code.backtracking;

public class MazeRiver {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestrictions("", board, 0, 0);
    }

    static void pathRestrictions(String p, boolean[][] maze, int r, int c){
        // Base condition: if we have reached the bottom-right corner
        // (destination cell), print the path and return
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        // If the current cell is blocked (false), stop exploring this path
        if(!maze[r][c]){
            return;
        }
        // Move Down
        if(r < maze.length - 1){
            pathRestrictions(p + 'D', maze ,r+1, c);
        }
        //Move Right
        if(c < maze[0].length - 1){
            pathRestrictions(p + 'R', maze, r, c+1);
        }
    }
}
