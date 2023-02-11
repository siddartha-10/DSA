import java.util.Arrays;

public class Flipping_image_leetcode_832 {
    public static void main(String[] args) {
        int[][] arr= {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(arr);
        for(int[] row:arr){
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] row:image){
            for(int i=0;i<(image[0].length+1)/2;i++){
                // here we are swapping aswell as Xoring the values
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length-i-1] ^ 1;
                row[image[0].length-i-1] = temp;
            }
        }
        return image;
    }

}
