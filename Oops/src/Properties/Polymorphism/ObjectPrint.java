package Properties.Polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj); // this print happens because java uses it's own toString method that is in the object class
        // if we create our own toString method then java doesn't go the ibject class but instead uses our tostring
        // method which we have overridden.
        // As mentioned in line 11-15;
    }
}
