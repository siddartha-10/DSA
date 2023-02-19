package access;

public class ObjectDemo {
    int num;
    float num2;

    public ObjectDemo(int num,float num2) {
        this.num = num;
        this.num2 = num2;
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

        return this.num ==((ObjectDemo)obj).num;
    }

    @Override
    // the hasCode values are just the unique number that are used to differentiate between the objects
    // to see if they are the same or not
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
//        ObjectDemo obj1 = new ObjectDemo(34);
//        ObjectDemo obj2 = new ObjectDemo(34);
//        System.out.println(obj1.hashCode());
//        System.out.println(obj2.hashCode());
//        // the above 2 print statemnets print 2 different hashCode values as the objects of both of them are different
//        // but the below 2 prints the same hashCode values because they are pointing to the same objects
//        ObjectDemo obj3 = new ObjectDemo(34);
//        ObjectDemo obj = obj3;
//        System.out.println(obj3.hashCode());
//        System.out.println(obj.hashCode());

        ObjectDemo obja = new ObjectDemo(12,75.5f);
        ObjectDemo objb = new ObjectDemo(12,78.9f);

        if(obja == objb){
            System.out.println("obja is equal to objb");
        }

        if(obja.equals(objb)){
            System.out.println("obja is equal to objb");
        }

        System.out.println(obja.getClass());
    }
}
