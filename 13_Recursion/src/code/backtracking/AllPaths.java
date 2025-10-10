package code.backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allpath("", board, 0, 0);

        // Create a 2D integer array `path` with the same dimensions as the maze (`board`) to store
        // the step number for each cell during traversal.
        int[][] path = new int[board.length][board[0].length];
        allPathPrint("", board, 0, 0, path, 1);
    }

    // Function to print all possible paths in a maze (can move in all 4 directions)
    static void allpath(String p, boolean[][] maze, int r, int c){
        // Base case: if we reached the destination (bottom-right corner)
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        // If the current cell is blocked or already visited, stop exploring
        if(!maze[r][c]){
            return;
        }

        // Mark the current cell as visited (so we don’t visit it again in this path)
        // This prevents infinite loops when moving up, down, left, and right
        maze[r][c] = false;

        if(r < maze.length-1){
            allpath(p+'D', maze, r+1, c);
        }
        if(c < maze[0].length-1){
            allpath(p+'R', maze, r, c+1);
        }
        if(r > 0){
            allpath(p+'U', maze, r-1, c);
        }
        if(c > 0){
            allpath(p+'L', maze, r, c-1);
        }

        // BACKTRACKING STEP:
        // Before returning, restore the cell to true
        // This allows other recursive paths to use this cell later
        maze[r][c] = true;
    }

    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == maze.length-1 && c == maze[0].length-1){
            // Mark the last cell with the final step number (you just entered it)
            path[r][c] = step;

            // Print the path matrix showing step order
            for (int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }

            // Print the actual path string (sequence of moves)
            System.out.println(p);
            System.out.println();
            return;
        }

        // If the current cell is blocked or already visited, stop exploring
        if(!maze[r][c]){
            return;
        }

        // Mark the current cell as visited
        maze[r][c] = false;
        // Record the step number in the path matrix
        path[r][c] = step;    // Step tracking

        if(r < maze.length-1){
            allPathPrint(p+'D', maze, r+1, c, path, step+1);
        }
        if(c < maze[0].length-1){
            allPathPrint(p+'R', maze, r, c+1, path, step+1);
        }
        if(r > 0){
            allPathPrint(p+'U', maze, r-1, c, path, step+1);
        }
        if(c > 0){
            allPathPrint(p+'L', maze, r, c-1, path, step+1);
        }

        // BACKTRACKING STEP:
        // Before returning, reset the current cell:
        // - Unmark it as visited (so it can be used in another path)
        // - Reset the step number to 0
        maze[r][c] = true;
        path[r][c] = 0;     // Removes the step number during backtracking
    }
}
