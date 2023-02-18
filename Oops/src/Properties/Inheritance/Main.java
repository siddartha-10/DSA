package Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
/*
        Box box = new Box();
        // the above line calls the constructor with zero parameters. Hence its going to print -1.0,-1.0,-1.0
        System.out.println(box.length+"    "+ box.width+"    "+ box.height);

        Box box1 = new Box(4);
        // the above line calls the constructor with one parameters. Hence its going to print 4.0,4.0,4.0
        System.out.println(box1.length+"    "+ box1.width+"    "+ box1.height);

        Box box2 = new Box(4,5,6);
        // the above line calls the constructor with three parameters. Hence its going to print 4.0,5.0,6.0
        System.out.println(box2.length+"    "+ box2.width+"    "+ box2.height);

        Box box3 = new Box(box2);
        // the above line calls the constructor with old constructor as parameter. Hence its going to print 4.0,5.0,6.0
        System.out.println(box3.length+"    "+ box3.width+"    "+ box3.height);


        BoxWeights box = new BoxWeights();
        // the above line what it does is it already extends/Inherits the Box class and in the box class we already have
        // the height, length, width to be set to -1 if the call is emtpy hence it prints -1;
        System.out.println(box.height+"  "+box.weight);


        //now we want to pass the length, widht, height and also weight
        BoxWeights box1 = new BoxWeights(1,2,3,10);
        System.out.println(box1.length+"  "+box1.width+"  "+box1.height+"  "+box1.weight);


        BoxWeights box = new BoxWeights(1,2,3,4);
        System.out.println(box.weight);


        BoxWeights box1 = new BoxWeights(box);
        System.out.println(box1.length+"  "+box1.width+"  "+box1.height+"  "+box1.weight);


        BoxPrice box = new BoxPrice();
        // the below line must print -1,-1,-1,-1,-1
        System.out.println(box.length+" "+ box.width+" "+box.height+" "+ box.weight+" "+ box.price);

        BoxPrice box1 = new BoxPrice(1,2,3,4,5);
        // the below line will print 1,2,3,4,5.
        System.out.println(box1.length+" "+ box1.width+" "+box1.height+" "+ box1.weight+" "+ box1.price);


        BoxPrice box2 = new BoxPrice(box1);
        // this line has to print 1,2,3,4,5 because we are passing the old BoxPrice whihc has the values
        // of length,width,height,weight,price
        System.out.println(box2.length+"    "+ box2.width+"    "+ box2.height+"    "+ box2.weight+"   "+ box2.price);
        */

        Box b1 = new BoxWeights(); // here we can see that it's taking only the varibales that are in box and not boxweight
        // because the reference is Box and not BoxWeight
        System.out.println(b1.length+" "+b1.height+" "+b1.width);



    }
}
