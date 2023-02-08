// https://leetcode.com/problems/word-search/description/
import java.util.Arrays;
public class Word_search {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
//        char[][] board = {{'a', 'b'}, {'c', 'd'}};
        String word = "ABCB";
        System.out.println(find(board, word, 0));
    }

    public static boolean find(char[][] board,String word,int index){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(isSafe(i,j,board,word,index)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSafe(int r,int c,char[][] board,String word,int index){
        if(r>=0 && r<=board.length-1 && c>=0 && c<=board[0].length-1){
            if(board[r][c]!=word.charAt(index)){
                return false;
            }
            if(index==word.length()-1){
                return true;
            }
            char a = board[r][c];
            board[r][c] = 'T';
            boolean result = isSafe(r,c-1,board,word,index+1) || isSafe(r,c+1,board,word,index+1) ||
                    isSafe(r+1,c,board,word,index+1) || isSafe(r-1,c,board,word,index+1);
            board[r][c] = a;
            return result;
        }
        return false;
    }

}