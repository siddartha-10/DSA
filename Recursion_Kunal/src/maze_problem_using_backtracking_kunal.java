public class maze_problem_using_backtracking_kunal {
    public static void main(String[] args) {
        boolean[][] maze =  {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        backtrack("",maze,0,0);
    }

    public static void backtrack(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c== maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c]==false){
            return;
        }

        // as we are now entering the function we need to make sure that no stackover flow occurs
        // hence we will mark all the visting blocks as false

        maze[r][c] = false;

        if(r<maze.length-1){
            backtrack(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            backtrack(p+"R",maze,r,c+1);
        }
        if(r>0){
            backtrack(p+"U",maze,r-1,c);
        }
        if(c>0){
            backtrack(p+"L",maze,r,c-1);
        }

        // now that all the function calls are over we need to make sure that all the visited blocks
        // must be reverted to their original state that is make them true.

        maze[r][c] = true;
    }

}
