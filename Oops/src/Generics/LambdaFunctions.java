package Generics;

public class LambdaFunctions {
    public static void main(String[] args) {
        Operation sum = (a,b) -> a+b;
        Operation sub = (a,b) -> a-b;
        Operation mul = (a,b) -> a*b;
        LambdaFunctions mycalc = new LambdaFunctions();
        System.out.println(mycalc.operate(5,3,sum));
        System.out.println(mycalc.operate(5,3,sub));
        System.out.println(mycalc.operate(5,3,mul));
    }

    private int operate(int a,int b,Operation op){
        return op.operation(a,b);
    }
}

interface Operation{
    int operation(int a,int b);
}
