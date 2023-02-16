/* what is singleton class?
* It is a class for which we can create only one object.
* */

package singleton;

public class Singleton {
    private Singleton(){

    }

    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
