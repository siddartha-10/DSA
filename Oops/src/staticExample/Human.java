package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean marriage;
    static long population;

    public Human(int age, String name, int salary, boolean marriage) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.marriage = marriage;
        //this.population+=1; // when we this.population we will be getting 1
        // for each of the human objects created but instread it should be the same for all the other humans
        Human.population+=1;
    }
}
