public class maze_problem_kunal {
    public static void main(String[] args) {
        //System.out.println(count(3,3));
        path("",3,3);
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

}
