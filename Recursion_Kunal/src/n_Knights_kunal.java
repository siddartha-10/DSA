public class n_Knights_kunal {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight(board,0,0,n);
    }

    public static void knight(boolean[][] board,int row,int col,int target){
        if(target==0){
            display(board);
            System.out.println();
            return;
        }
        if(row== board.length-1 && col==board.length){
            return;
        }

        if(col==board.length){
            knight(board,row+1,0,target);
            return;
        }

        if(isSafe(board,row,col)){
            board[row][col] = true;
            knight(board,row,col+1,target-1);
            board[row][col] = false;
        }
        knight(board,row,col+1,target);

    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if(isValid(board,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }

        if(isValid(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }

        if(isValid(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }

        if(isValid(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }

        return true;
    }

    private static boolean isValid(boolean[][] board, int row, int col) {
        if(row>=0 && row<board.length && col>=0 && col<board.length){
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row:board) {
            for (boolean ele:row) {
                if(ele){
                    System.out.print("K ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }

    }

}
