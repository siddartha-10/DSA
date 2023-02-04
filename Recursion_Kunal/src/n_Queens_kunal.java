public class n_Queens_kunal {
    public static void main(String[] args) {
        int n =4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board,0));
    }

    public static int queens(boolean[][] board,int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        
        int count = 0;
        for(int col = 0;col < board.length;col++){
            if(isSafe(board,row,col)) {
                board[row][col] = true;
                count = count + queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // this is used to check the above part of that particular row in which queen is placed
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        // this is used to see if the queen is present on the left diagonal
        int maxLeft = Math.min(row,col);
        for (int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        // this is used to see if the queeen is present on the right diagonal
        int maxRight = Math.min(row,board.length-1-col);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row:board) {
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
    }

}
