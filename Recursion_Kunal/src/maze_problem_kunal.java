public class maze_problem_kunal {
    public static void main(String[] args) {
        //System.out.println(count(3,3));
        //path("",3,3);
        path_with_diagonals("",3,3);
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

}
