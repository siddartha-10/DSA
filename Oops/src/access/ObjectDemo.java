package access;

public class ObjectDemo {
    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    // we have already seen the finalize and tostring method
    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    // the hasCode values are just the unique number that are used to differentiate between the objects
    // to see if they are the same or not
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(34);
        ObjectDemo obj2 = new ObjectDemo(34);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        // the above 2 print statemnets print 2 different hashCode values as the objects of both of them are different
        // but the below 2 prints the same hashCode values because they are pointing to the same objects
        ObjectDemo obj3 = new ObjectDemo(34);
        ObjectDemo obj = obj3;
        System.out.println(obj3.hashCode());
        System.out.println(obj.hashCode());
    }
}
