package Generics.Comparisons;

public class Main {
    public static void main(String[] args) {
        Student messi = new Student(10,100);
        Student cris = new Student(07,100f);

        if (messi.compareTo(cris) < 0){
            System.out.println("cris has more marks");
        }
        else if (messi.compareTo(cris) > 0) {
            System.out.println("messi has more marks");
        }
        else{
            System.out.println("both are equal");
        }
    }
}
