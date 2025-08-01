package nittan.oops.interfaces;

interface A {
     int SIZE = 10;
      String name = "Nittan"; // automatically public, static and final
//    protected int number = 8;   // not allowed here
//     private int number = 8; // not allowed

     void  greeting(); // by default it is abstract
//    final void hello(); // cannot be final because it is abstract and abstract methods require overriden
    static void hello(){
        System.out.println("hello from static method in interface");
    }

    default void hello2(){
        System.out.println("this is default method, it will get called if it is not overriden");
    }

}

