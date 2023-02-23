package Generics;

import java.util.Arrays;

public class CustomArrayList {

    private int data[];
    private static int Default_Size = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[Default_Size];
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
        int[] temp = new int[data.length*2];

        for(int i=0;i< data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove(){
        int a = data[--size];
        return a;
    }

    public int get(int index){
        return data[index];
    }

    public void set(int index,int num){
        data[index] = num;
    }

    public int size() {
        return size;}


    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        CustomArrayList arr = new CustomArrayList();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        System.out.println(arr);
//        arr.remove(); // what this does is just reduces the size of the array but when we try to assign something
//        // to the index that was removed then it overrides it
//        System.out.println(arr);
//        arr.add(45); // we can see how remove operation is being done.
//        System.out.println(arr);

        CustomArrayList arr = new CustomArrayList();
        for (int i = 0; i < 14; i++) {
            arr.add(2*i);
        }

        System.out.println(arr);
    }
}
