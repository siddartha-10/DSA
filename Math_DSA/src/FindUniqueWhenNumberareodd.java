public class FindUniqueWhenNumberareodd {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,2,3,4,7,6,6,5};
        System.out.println(right(arr));
    }

    public static int right(int[] arr){
        int num = 0;
        for (int r:arr){
            num = num ^ r;
        }
        return num;
    }

}
