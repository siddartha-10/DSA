// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class Smallest_number {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'j';
        char a = ceiling(letters,target);
        System.out.println(a);
    }
    public static char ceiling(char[] arr,char target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int middle = start + (end - start) / 2;
            if (arr[middle]>target) {
                end = middle - 1;
            }
            else{
                start = middle + 1;
            }
        }
        return arr[start % arr.length];
    }
}
