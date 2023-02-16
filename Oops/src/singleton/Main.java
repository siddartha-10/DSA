package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        // when the above line is run it goes to the singleton class it checks if the instance is created or not
        // if not then it will create an instance and return it
        Singleton obj2 = Singleton.getInstance();
        // when the above line is run it goes to singleton.getInstances() and will check if the instacne =null whoch is false
        // as we have already created an object for it then it says
        // Hey i have already vreated an object please point to it.
        Singleton obj3 = Singleton.getInstance();
    }
}
