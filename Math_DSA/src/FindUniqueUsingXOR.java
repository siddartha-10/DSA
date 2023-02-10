public class FindUniqueUsingXOR {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(unique(arr));
    }

    private static int unique(int[] arr) {
        int ans = 0;
        for (int a:arr) {
            ans = ans ^ a;
        }
        return ans;
    }


}
