public class Recursion_Basic_Problems_Striver {
    public static int c = 0; // global varibale assigning.
    public static void main(String[] args) {
        print();
    }

    public static void print(){
        if(c==5){
            return;
        }
        System.out.println("Messi");
        c++;
        print();
    }

}