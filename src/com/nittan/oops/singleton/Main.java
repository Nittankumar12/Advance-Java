package nittan.oops.singleton;

public class Main {
    public static void main(String[] args) {

        // we cannot do this because its constructor is private and do not allow us to create objects
//        Singleton singleton = new Singleton();
        // instead we can call its public method of getting instance

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.toString());
    }
}
