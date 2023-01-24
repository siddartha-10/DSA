public class Main {
    public static void main(String[] args) {
        //pattern1(4);
        //pattern2(4);
        //pattern3(5);
        //pattern4(5);
        //pattern5(5);
        //pattern28(5);
        //pattern30(5);
        //pattern17(4);
        pattern31(4);
    }

    private static void pattern31(int n) {
        int originalN = n;
        n = 2*n;
        for (int row = 0; row <=n ; row++) {
            for (int cols = 0; cols <=n ; cols++) {
                int ans = originalN - Math.min(Math.min(n-row, n-cols),Math.min(row,cols));
                System.out.print(ans+" ");
            }
            System.out.println();
        }
    }

    private static void pattern17(int n) {
        for (int row = 0; row <= 2*n ; row++) {
            int totalcols = row > n? 2*n-row:row;
            int spaces = n - row;
            for (int space = 1; space <= n-totalcols; space++) {
                System.out.print(" ");
            }
            for (int cols = totalcols; cols >= 1; cols--) {
                System.out.print(cols);
            }
            for (int cols = 2; cols <= totalcols; cols++) {
                System.out.print(cols);
            }
            System.out.println();
        }
    }

    private static void pattern30(int n) {
        for(int row=1;row<=n;row++){
            int spaces = n - row;
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            for (int cols = row; cols >= 1; cols--) {
                System.out.print(cols);
            }
            for (int cols = 2; cols <= row; cols++) {
                System.out.print(cols);
            }
            System.out.println();
        }
    }

    private static void pattern28(int n) {
        for(int row = 1; row <= 2*n; row++){
            int totalcols = row > n? 2*n-row:row;
            int spaces = n-totalcols;
            for(int space = 1; space<=spaces;space++){
                System.out.print(" ");
            }
            for(int col = 1; col<= totalcols; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern5(int i) {
/*  My approach
        // first pattern
        for(int row=1; row <=i;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // second pattern reverse to the first pattern
        for(int row1=1; row1<=i-1;row1++){
            for(int col1=1;col1<=i-row1;col1++){
                System.out.print("* ");
            }
            System.out.println();
        }
*/
        // Best approach
        for(int row = 1; row <= 2*i; row++){
            int totalcols = row > i ? 2*i - row : row;
            for(int col = 1; col<= totalcols;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    private static void pattern4(int i) {
        for(int row = 1; row<=i;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern1(int n){
        for(int row = 1; row<=n;row++){
            for(int col = 1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row = 1;row <=n;row++){

            // for every row run the number of columns.
            for(int col = 1;col <=row; col++){
                System.out.print("* ");
            }
            // when one row is printed then we need to print/go to a newline.
            System.out.println("");
        }
    }

    static void pattern3(int n){
        int a = n;
        for(int row = 1;row <=n;row++){
            // for every row run the number of columns.
            for(int col = 1;col <=n-row+1; col++){ // col = n-row+1 or we can keep an external variable and do that.
                System.out.print("*");
            }
            a-=1;
            // when one row is printed then we need to print/go to a newline.
            System.out.println("");
        }
    }


}