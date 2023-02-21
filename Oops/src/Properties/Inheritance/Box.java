package Properties.Inheritance;

public class Box {

    double length;
    double width;
    double height;

    Box(){ // this will be called when there is no argument called.
        this.length=-1;
        this.height=-1;
        this.width=-1;
    }

    static void greeting(){
        System.out.println("Hey I am in box class");
    }

    Box(double side){ // this is used for a cube i.e when you pass only one argument.
        this.length = side;
        this.width = side;
        this.height = side;
    }
    Box(double length, double width, double height) { // this is called when we call 2 arguments.
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(Box old){ // this is an copy constructor
        this.length = old.length;
        this.height = old.height;
        this.width = old.width;
    }
}
