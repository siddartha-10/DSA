public class OddOrEvenUsingAnd {
    public static void main(String[] args) {
        System.out.println((5&1));
        System.out.println(and(5));
    }

    public static boolean and(int n){ 
        if((n&1)==0){
            return true;
        }
        else{
            return false;
        }
    }

}