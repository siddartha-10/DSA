public class WrapperExample {
    public static void main(String[] args) {
        final A mes = new A("messi");
        mes.name = "lionel messi";
        System.out.println(mes.name);
    }
}

class A {
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called");
    }
}
