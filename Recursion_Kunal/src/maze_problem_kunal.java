public class maze_problem_kunal {
    public static void main(String[] args) {
        //System.out.println(count(3,3));
        //path("",3,3);
        //path_with_diagonals("",3,3);
        boolean[][] maze =  {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        //path_with_restrictions("",maze,0,0);
        //path_all_directions("",maze,0,0);
    }

    // count the number of ways to reach the end
    public static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int right = count(r,c-1);
        int left = count(r-1,c);
        return left + right;
    }

    // print all the ways that a person can reach from start to end
    public static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+"D",r-1,c);
        }
        if(c>1){
            path(p+"R",r,c-1);
        }
    }

    public static void path_with_diagonals(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1 && c>1){ // D is for diagonal
            path_with_diagonals(p+"D",r-1,c-1);
        }
        if(r>1){ // V is for vertical or going downwards
            path_with_diagonals(p+"V",r-1,c);
        }
        if(c>1){ // H is for horizontal
            path_with_diagonals(p+"H",r,c-1);
        }

    }

    public static void path_with_restrictions(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        // if there is any restriction
        if(maze[r][c]==false){
            return;
        }
        if(r<maze.length-1){
            path_with_restrictions(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            path_with_restrictions(p+"R",maze,r,c+1);
        }
    }

    public static void path_all_directions(String p,boolean[][] maze,int r,int c){
        /*
        we are going to get stack overflow if we run this because after a certain point
        we are revisitng the already visited point again and again
         */
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c]==false){
            return;
        }
        if(r<maze.length-1){
            path_all_directions(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            path_all_directions(p+"R",maze,r,c+1);
        }
        if(r>0){
            path_all_directions(p+"U",maze,r-1,c-1);
        }
        if(c>0){
            path_all_directions(p+"L",maze,r,c-1);
        }
    }

}
