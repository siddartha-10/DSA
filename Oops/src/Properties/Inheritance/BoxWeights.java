package Properties.Inheritance;

public class BoxWeights extends Box{
    double weight;

    BoxWeights() {
        this.weight = -1;
    }

    public BoxWeights(double length, double width, double height, double weight) {
        super(length, width, height);
        // what does super mean
        // It is calling the parent class constructor which has 3 parameters
        this.weight = weight;
    }
}
