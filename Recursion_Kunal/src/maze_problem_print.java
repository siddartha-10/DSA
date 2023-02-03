import java.util.ArrayList;
import java.util.Arrays;

public class maze_problem_print {
    public static void main(String[] args) {
        boolean[][] maze =  {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] arr = new int[maze.length][maze[0].length];
        printall("",maze,0,0,arr,1);
    }

    public static void printall(String p,boolean[][] maze,int r,int c,int[][] arr,int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            arr[r][c] = step;
            for(int[] a:arr){
                System.out.println(Arrays.toString(a));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(maze[r][c]==false){
            return;
        }
        // we are visiting so put maze[r][c] = false;
        maze[r][c] = false;
        arr[r][c] = step;

        if(r<maze.length-1){
            printall(p+"D",maze,r+1,c,arr,step+1);
        }
        if(c<maze[0].length-1){
            printall(p+"R",maze,r,c+1,arr,step+1);
        }
        if(r>0){
            printall(p+"U",maze,r-1,c,arr,step+1);
        }
        if(c>0){
            printall(p+"L",maze,r,c-1,arr,step+1);
        }

        maze[r][c] = true;
        arr[r][c] = 0;

    }

}
