package Generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {

    private Object data[];
    private static int Default_Size = 10;
    private int size = 0;

    public CustomGenericArrayList() {
        this.data = new Object[Default_Size];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    public boolean isFull(){
        return data.length == size;
    }

    private void resize() {
        Object[] temp = new Object[data.length*2];

        for(int i=0;i< data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(){
        T a = (T)data[--size]; // we are casting this to T because the reference is T but the main things is object
        // So it's similar to Object is the parent T is the child we cannot create child to a parent.
        return a;
    }

    public T get(int index){
        return (T)data[index];
    }

    public void set(int index,T num){
        data[index] = num;
    }

    public int size() {
        return size;}


    @Override
    public String toString() {
        return "CustomGenericArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        /*
        * so the code whihc is commented is simple list which can only take a integer as values inside it
        * */
//        CustomGenericArrayList arr = new CustomGenericArrayList();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        System.out.println(arr);
//        arr.remove(); // what this does is just reduces the size of the array but when we try to assign something
//        // to the index that was removed then it overrides it
//        System.out.println(arr);
//        arr.add(45); // we can see how remove operation is being done.
//        System.out.println(arr);

        CustomGenericArrayList<Integer> arr = new CustomGenericArrayList<>();
        for (int i = 0; i < 14; i++) {
            arr.add(2*i);
        }
        System.out.println(arr);
    }
}
