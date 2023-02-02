public class count_maze_problem_kunal {
    public static void main(String[] args) {
        System.out.println(count(3,3));
    }

    public static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int right = 0;
        right = right + count(r,c-1);
        int left = 0;
        left = left + count(r-1,c);
        return left + right;
    }

}
