public class FindTheIthBit {
    public static void main(String[] args) {
        System.out.println(Ith(23,1));
    }

    public static int Ith(int n,int k){
        return n&(1<<(k-1));
    }

}
