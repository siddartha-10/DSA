package EnumExamples;

public class Basic {
    enum Week implements A{
     Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
     // the varibales inside an enum are always public static and final
     // the type of the variables is week.


        Week() {
            System.out.println("Constructor called for "+this);
            // This is neither public or protected, this is private or default
            // we dont want to create multiple objects becuase it is not the concept of enum.
        }

        @Override
        public void hello(){
            System.out.println("Hey how are you i am overriden method in the interface A");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Sunday;
        week.hello();
//        for (Week day:Week.values()) {
//            // here Week.values() will give all the values that are in the Week enumeration.
//            System.out.println(day);
//        }
        //System.out.println(week.ordinal()); // this prints the index of the enum variable the index starts from 0
    }
}
