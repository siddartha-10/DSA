package access;

public class A {
//    private int num;
    // as this variable is private it can be only used in this particular class and cannot be used outisde it.
    protected int num;
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

}
