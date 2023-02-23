package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            int c = a/b;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This will run no matter what happens even if there is no excpetion This code block will run");
        }
    }
}
