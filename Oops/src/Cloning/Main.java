package Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human messi = new Human(10,"Lionel messi");
        /*
        * We use clone because it takes less processing time to use new keyword hence we use clone.
        * */
        //Human twin_messi = new Human(messi);

        Human twim = (Human)messi.clone();
        System.out.println(twim.age + " "+twim.name);
        // what clone does is copy the values of one object to another
    }
}
