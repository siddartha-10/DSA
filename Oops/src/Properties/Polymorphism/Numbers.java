package Properties.Polymorphism;

public class Numbers {
    // In the below 2 functions we can see that both the function have same names but the number of parameters
    // are different Hence this is called as method overloading
    // this is called compile time polymorphism because the machine determines that which method or constructor to be called
    // during the program.
    int sum(int a,int b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b;
    }

    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.sum(2,3); // this calls the sum method with 2 paramaeters
        num.sum(2,3,4); // this calls the sum method with 3 parameters
    }
}
