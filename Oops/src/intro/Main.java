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

        //System.out.println(student1.numbers + "\n"+ student1.marks+ "\n"+ student1.names);

        // we can only use the varibales that are present in the class template because java is a static language
        // but in python we can do that as well



        // we are calling a parameterised constructor

        student messi = new student(10,"Lionel Messi",100.0f);
        //System.out.println(messi.numbers + "\n"+ messi.marks+ "\n"+ messi.names);


        student ronny = new student();
        //System.out.println(ronny.numbers + "\n" + ronny.names + "\n" + ronny.marks);


        // this is an example of how one class is effected by another
        student one = new student();
        student two = one;

        // now when i change the one.name to something then when i print two.name it prints something
        // because the object in the heap is the same for both the objects one and two.

        one.names = "something something";
        System.out.println(two.names);
    }
}

// template of a class or an example of how a class is created
// this is used for every single student
class student{
    int numbers;
    String names;
    float marks;

    // we need a way to assign the values to it's varinale


    // this is how we call one constructor from another constructor
    student(){
        this (13,"default person",100.0f);
    }


    student(int rno,String name,float marks){
        this.numbers = rno;
        this.names = name;
        this.marks = marks;
    }

}