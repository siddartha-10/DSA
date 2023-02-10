public class SetTheIthBit {
    public static void main(String[] args) {
        System.out.println(set(10,2));
    }

    public static int set(int n,int k){
        return (n|(1<<(k)));
    }

}
