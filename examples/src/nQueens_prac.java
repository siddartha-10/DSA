public class nQueens_prac {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        System.out.println(queen(board,0));
    }

    public static int queen(boolean[][] board, int row){
        if(row== board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count  = 0;

        // we will start from 0 column as we are going to start from 0th column to board.length
        for (int i = 0; i < board.length; i++) {
            // now we need to place the queen if it is safe.
            if(isSafe(board,row,i)){
                board[row][i] = true;
                count = count + queen(board,row+1);
                board[row][i] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        int maxleft = Math.min(row,col);
        for(int i=1;i<=maxleft;i++){
            if(board[row-1][col-1]){
                return false;
            }
        }
        int maxright = Math.min(row,board[0].length-col-1);
        for (int i = 0; i < maxright; i++) {
            if(board[row-1][col+1]){
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row:board){
            for(boolean ele:row){
                if(ele){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        return;
    }


}
