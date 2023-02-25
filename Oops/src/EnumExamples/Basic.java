package EnumExamples;

public class Basic {
    enum Week{
     Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
     // these are enum constants
     // the varibales inside an enum are always public static and final
     // the type of the variables is week.
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Sunday;
        for (Week day:Week.values()) {
            // here Week.values() will give all the values that are in the Week enumeration.
            System.out.println(day);
        }
        System.out.println(week.ordinal()); // this prints the index of the enum variable the index starts from 0
    }
}
