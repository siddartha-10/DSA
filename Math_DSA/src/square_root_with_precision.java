public class square_root_with_precision {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.println(sqrt(n,p));
    }

    public static double sqrt(int n,int p){
        double root = 0.0;
        int start = 0;
        int end = n;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(mid*mid==n){
                return mid;
            }
            if(mid*mid>n){
                end = mid - 1;
            }
            if(mid*mid<n){
                start = mid + 1;
            }
        }
        root = end;
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while(root*root<=n){
                root = root + incr;
            }

            root = root - incr;
            incr = incr/10;
        }
        return root;
    }

}
