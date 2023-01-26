import java.util.Scanner;

public class Recursion_Basic_Problems_Striver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //print(1,n);
        //print1(1,n);
        //print2(1,n);
        //print3(n,n);
        print4(1,n);
    }

    // question 1:- print name 5 times
    public static void print(int i, int n){
        if(i>n){
            return;
        }
        System.out.println("Messi");
        i++;
        print(n,1);
    }

    // question 2:- print linearly from 1 to n
    public static void print1(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        i++;
        print1(i,n);
    }
    // question 3:- print linearly from n to 1
    public static void print2(int i, int n){
        if(n<i){
            return;
        }
        System.out.println(n);
        n--;
        print2(i,n);
    }
    // question 4:- print linearly from 1 to n (by backtracking)
    public static void print3(int i, int n){
        if(i<1){
            return;
        }
        print3(i-1,n);
        System.out.println(i);
    }
    // question 5:- print linearly from n to 1 (by backtracking)
    public static void print4(int i, int n){
        if(i>n){
            return;
        }
        print4(i+1,n);
        System.out.println(i);
    }
}