public class Main {
    public static void main(String[] args) {
        // store 5 roll numbers
        int[] numbers = new int[5];
        // store 5 names
        String[] names = new String[5];


        // this is how we create the objects and instantiate it
        student student1 = new student();
        // now the when we print the value of studen1 we the addrees of where the objects has been stored

        // to initialize some values to the variable's we use dot product

//        student1.numbers = 10;
//        student1.marks = 96.87f;
//        student1.names = "Messi";

        System.out.println(student1.numbers + "\n"+ student1.marks+ "\n"+ student1.names);

        // we can only use the varibales that are present in the class template because java is a static language
        // but in python we can do that as well

    }
}

// template of a class or an example of how a class is created
// this is used for every single student
class student{
    int numbers;
    String names;
    float marks;

    // we need a way to assign the values to it's varinale

    student(){
        this.numbers = 10;
        this.names = "Messi";
        this.marks = 56.7f;
    }

}