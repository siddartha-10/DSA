package Cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,7};
    }

    // even without the below code till 16 we can clone the object using objectname.clone().
//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//    }

    // this is called as showllow copy
//    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }

    public Object clone() throws CloneNotSupportedException{
        Human twin = (Human)super.clone();
        twin.arr = new int[twin.arr.length]; // this is called as deep copy
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
