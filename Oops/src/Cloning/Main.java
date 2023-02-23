package Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human messi = new Human(10,"Lionel messi");
        /*
        * We use clone because it takes less processing time to use new keyword hence we use clone.
        * */
        //Human twin_messi = new Human(messi);

        Human twin = (Human)messi.clone();
        System.out.println(twin.age + " "+twin.name);
        // what clone does is copy the values of one object to another
        System.out.println(Arrays.toString(twin.arr));
        // lets say we change the first element of the cloned object to 100
        // and check if it's actually changing the original object as well
        twin.arr[0] = 100;
        twin.name = "String";
        twin.age =20;
        System.out.println(twin.age + " "+twin.name);
        System.out.println(messi.age + " "+messi.name);
        System.out.println("This is the array of the twin object"+" "+Arrays.toString(twin.arr));
        System.out.println("This is the array of the messi object"+" "+Arrays.toString(messi.arr));

        // since changing the cloned object effects or changes the elements in a real object this is called as
        // shallowed copying
    }
}
