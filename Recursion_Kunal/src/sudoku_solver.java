public class sudoku_solver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if(solve(board)){
            display(board);
        }
        else{
            System.out.println("Cannot be solved");
        }
    }

    private static void display(int[][] board) {
        for (int[] row:board) {
            for (int num:row) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    public static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;
        // creating a boolean variable to check if the particular cell is empty or not.
        boolean isNotEmpty = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j]==0){
                    row = i;
                    col = j;
                    isNotEmpty = false;
                    break;
                }
            }
            if(isNotEmpty==false){
                break;
            }
        }
        if(isNotEmpty==true){
            return true; //  sudoku is solved
        }

        // here we are keeping each number in that blank cell to complete the sudoku
        for (int number = 1; number <= 9; number++) {
            if(isSafe(board,row,col,number)){
                board[row][col] = number;
                if(solve(board)){
                    return true; // if the board is solved return true;
                }
                else{
                    board[row][col] = 0;
                }
            }
        }
        return false; // if the above conditions do not return true then that means the sudoku cannot be solved.
    }

    public static boolean isSafe(int[][] board,int row,int col,int num){
        // this is to check if the row has the number
        for (int i = 0; i < board.length; i++) {
            if(board[row][i]==num){
                return false;
            }
        }

        // this is to check if the col has the number
        for (int i = 0; i < board.length; i++) {
            if(board[i][col]==num){
                return false;
            }
        }

        // to check the submatrix
        int sqrt = (int)(Math.sqrt(board.length));
        int start = row - row % sqrt;
        int end = col - col % sqrt;
        for (int i = start; i < start+sqrt; i++) {
            for (int j = end; j < end+sqrt; j++) {
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }

}
