import java.util.Arrays;

public class Main {
//* * * * *
//* * * *
//* * *
//* *
//*
    public static void main(String[] args) {
        int[] arr = {4,2,3,5,1};
        int n = 5;
        for (int i = 0; i < n; i++) {

        }
    }

//    public static void bubble_sort(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length-i-1; j++) {
//                if(arr[j+1]<arr[j]){     // arr[i]  = 5  arr[j] = 4 5>4
//                    swap(arr,j+1,j);
//                }
//            }
//        }
//    }
//
//    private static void swap(int[] arr,int i, int j) {
//        int temp  =arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

}



/* 4 2 3 5 1
*  5<4 swap(5,4)    4 5 3 2 1    i = 0
*  5<3 swap(5,3)    4 3 5 2 1
*  5<2 swap(5,2)    4 3 2 5 1
*  5<1 swap(5,1)    4 3 2 1 5  i = 0
*
*   4<3 swap(4,3)   3 4 2 1      5    i = 1
*   4<2 swap(4,2)   3 2 4 1
*   4<1 swap(4,1)   3 2 1 4
*
*   3<2 swap(3,2)   2 3 1   i=2
*   3<1 swap(3,1)   2 1 3
*
*   2<1 swap(2,1)   1 2  i=3
* */



















