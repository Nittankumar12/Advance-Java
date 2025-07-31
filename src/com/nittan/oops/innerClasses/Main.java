package nittan.oops.innerClasses;
import nittan.oops.innerClasses.InnerClassExample.InnerClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("In main method");
//        InnerClassExample obj = new  InnerClassExample();
//        System.out.println(InnerClassExample.InnerClass.c);
//
//        InnerClassExample.InnerClass2.staticMethod();
//        InnerClassExample.InnerClass2.getSum();
//        int num2 = InnerClassExample.InnerClass2.num2;
//        System.out.println(num2);
//        System.out.println(obj.toString());

        // we cannot directly create the object of inner class because it depends on the object of outer class
        // we first create object of outer class and using that outer class we actually do the  object creation of inner class
//        InnerClassExample obj = new InnerClassExample();
//        InnerClassExample.InnerClass obj2 = obj.new InnerClass(5,6);
//        System.out.println(obj2.getSum());
//        InnerClassExample.InnerClass.staticMethod(); // do not need object to call because it is static
//
//        obj2.getSum();



        // this is used to call the non static method in inner class which is static also
//        InnerClassExample.InnerClass2 innerClass = new InnerClassExample.InnerClass2();
//        innerClass.getNum1();

    }
}
