public class Comparision {
    public static void main(String[] args) {

        String c = "Messi";
        String d = "Messi";
        //System.out.println(c==d); // this will return true because both the reference varibales point to the same object
        String a = new String("Messi");
        String b = new String("Messi");
        //System.out.println(a==b); // this will return false as both the reference variables are point to different objects
        // as we used the new keyword

        // compare only the values and not the reference then we use .equals() method
        System.out.println(a.equals(b));
    }
}
