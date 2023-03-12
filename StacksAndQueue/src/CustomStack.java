public class CustomStack {
    protected int[] data;
    private static final int Default_Size = 10;
    int ptr = -1;

    /*
    Here we are using this keyword to call the constructor with a parameter as size.
    Whenever we want to call the default constructor we will use the default size.
     */
    public CustomStack() {
        this(Default_Size);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    private boolean isFull() {
        return ptr == data.length - 1;
    }
}
