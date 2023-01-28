public class count_zeros_recursion {
    public static void main(String[] args) {
        int n = 30204;
        System.out.println(count(n));
    }
/*
    static int count = 0;
    public static int count_zeros(int n){
        if(n!=0){
            if(n%10==0){
                count = count + 1;
                count_zeros(n/10);
            }
            else{
                count_zeros(n/10);
            }
        }
        return count;
    }
*/
    public static int count(int n){
        return helper(n,0);
    }

    public static int helper(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
            return helper(n/10,count+1);
        }
        return helper(n/10,count);
    }

}
