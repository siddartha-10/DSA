// https://leetcode.com/problems/shuffle-string/
public class Shuffle_String {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] arr = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,arr));
    }

    public static String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        char[] arr = new char[indices.length];
        for (int j = 0; j < arr.length; j++) {
            arr[indices[j]] = s.charAt(j);
        }
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }

}
