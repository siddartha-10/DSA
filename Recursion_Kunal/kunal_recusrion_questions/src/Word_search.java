import java.util.Arrays;

public class Word_search {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
//        char[][] board = {{'a', 'b'}, {'c', 'd'}};
        int m = board.length;
        int n = board[0].length;
        boolean[][] board1 = new boolean[m][n];
        String word = "AC";
        StringBuilder sb = new StringBuilder();
        System.out.println(find(board, board1, word, sb, 0));
    }

    public static boolean find(char[][] board,boolean[][] board1,String word,StringBuilder sb,int index){
        if(index==word.length()){
            return true;
        }
        char ch = word.charAt(0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(isSafe(board1,i,j,ch,board) && board[i][j]==ch){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSafe(boolean[][] board1,int r,int c,char ch,char[][] board){
        if(isValid(board1,r,c-1,ch,board)){
            if(board1[r][c-1]){
                return false;
            }
        }
        else if(isValid(board1,r,c+1,ch,board)){
            if(board1[r][c+1]){
                return false;
            }
        }
        else if(isValid(board1,r+1,c,ch,board)){
            if(board1[r+1][c]){
                return false;
            }
        }
        else if(isValid(board1,r-1,c,ch,board)){
            if(board1[r-1][c]){
                return false;
            }
        }
        return true;
    }
    public static boolean isValid(boolean[][] board1, int r,int c,char ch,char[][] board){
        if(r>=0 && r<=board.length-1 && c>=0 && c<=board[0].length-1 && board[r][c]==ch){
            return true;
        }
        else{
            return false;
        }
    }

}