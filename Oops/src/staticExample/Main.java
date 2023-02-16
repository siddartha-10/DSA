package staticExample;

public class Main {
    public static void main(String[] args) {
//        Human messi = new Human(35,"Lionel",100000,true);
//        Human sid = new Human(22,"sid",1000,false);
//        Human cris = new Human(38,"cris",1000,true);
//
//        System.out.println(messi.age+"\t"+messi.name+"\t"+messi.salary+"\t"+messi.marriage);
//        System.out.println(sid.age+"\t"+sid.name+"\t"+sid.salary+"\t"+sid.marriage);
//        System.out.println(cris.age+"\t"+cris.name+"\t"+cris.salary+"\t"+cris.marriage);
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);
        fun();
    }

    static void fun(){// this is a static method Hence it doesn't need any instance of an object to be created to use it
        // now if we want to use an non-static member in a static class then we need create an object
        Main obj = new Main();
        obj.greeting();
    }

    void greeting(){ // this is a non-static method, Hence it requires an instance of an object to be created to use it
        System.out.println("Hello world");
        // we can use an static member in a non static class
        //fun();
    }
}
