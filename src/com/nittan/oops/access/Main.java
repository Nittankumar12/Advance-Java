package nittan.oops.access;

public class Main {
    public static void main(String[] args) {

//        A a1 = new A(1,2,3,4,5);
//        System.out.println(A.c);
//        System.out.println(a1.getA());
//        System.out.println(a1.getB());
//        System.out.println(a1.getC());
//        System.out.println(a1.getD());
//        System.out.println(a1.getE());

//        A a2 = new A(6,7,8,9,10);
//        A.c = 10;
//        System.out.println(a2);
//
//        A a3 = new SubClass(16);
////        System.out.println(a3.gettA()); // we cannot call this because the object is of type A not Subclass
//        System.out.println(a3.getC()); // we can call every method in A class
//        a3.protectedMethod();
//        a3.publicMethod();
////        a3.privateMethod(); // we cannot call private method in this.
//        // also we cannot call methods of its subclass
//
//        SubClass subClass = new SubClass(16);
//        System.out.println(subClass.getC());
//        subClass.publicMethod();
//        subClass.protectedMethod();
//        subClass.protMethod();
//        subClass.pubMethod();
//        subClass.priMethod(); // it have private access in the subclass so we can't use it.
// rest all methods from its parent class and itself we can acces those.

        SubClass obj = new SubClass(10);
        obj.protMethod();
        obj.protectedMethod();
        obj.publicMethod();
        obj.pubMethod();

//        SubClass.InnerClass.printNumber(); // we can do this if our class and method both are static





//        A obj2 = new SubClass(15);
//        obj2.protectedMethod();
//        obj2.publicMethod();



    }
}
