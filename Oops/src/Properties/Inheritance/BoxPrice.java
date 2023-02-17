package Properties.Inheritance;

public class BoxPrice extends BoxWeights{
    double price;

    BoxPrice(){
        super();
        this.price = -1;
    }


    BoxPrice(double side,double weight,double price){
        super(side,weight);
        this.price =  price;
    }

    BoxPrice(double length, double width, double height, double weight, double price) {
        super(length, width, height, weight); // this line first will go to the boxweight then
        // the boxweight will have another line super(length,width,height) which is going to call the Box
        this.price = price;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.price = other.price;
    }

}
