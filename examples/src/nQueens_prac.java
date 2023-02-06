public class nQueens_prac {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        System.out.println(queen(board,0));
    }

    public static int queen(boolean[][] board,int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        for(int col = 0;col<board[0].length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = true; // queeen kept
                count+=queen(board,row+1); // next row lo eda pedthav
                board[row][col] = false; // queen remove
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check the above row
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        int left = Math.min(row,col);
        for(int i=1;i<=left;i++){
            if(board[row-1][col-1]){
                return false;
            }
        }

        int right = Math.min(row,board[0].length-1-col);
        for(int i=1;i<=right;i++){
            if(board[row-i][col+i]){
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
    }

}
