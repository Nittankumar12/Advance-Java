package nittan.oops.singleton;

public class Singleton {

    // it prevents the creation of object multiple times, it only creates one instance and cannot be used by anyone
    // only return the same instance whenever required
    private static Singleton instance;
    private Singleton(){}


    public static  Singleton getInstance(){
        if(instance == null){
            return new Singleton();
        }
        return instance;
    }
}
