package com.nittan.oops.classesAndObjects;

public class Main {
    public static void main(String[] args) {

//        A a1 = new A();
//        int age = a1.age;
//        String name = a1.name;
//
//        System.out.println(age); // default value  is null
//        System.out.println(name); // default value of string is null
//        System.out.println(a1); // print some address type
//        System.out.println(a1.toString()); // same object address type something
//        System.out.println(a1.hashCode()); // some hash code
//        System.out.println(a1.getClass()); // return the class name with proper package
//        System.out.println(a1.getClass().getAnnotations()); // some annoations

//        A a2 = new A(13,"Nittan");
//        System.out.println(a2.age);
//        System.out.println(a2.name);
//
//        A a3 = new A(14);
//        System.out.println(a3.age);
//        System.out.println(a3.name);
//
//        A a4 = a3;  // this will point exactly to same thing in heap memory, but they are different in stack memory
//        System.out.println(a4.age);
//        System.out.println(a4.name);
//
//        System.out.println(a3);  // both refer to same object ( instance is same)
//        System.out.println(a4);  // both have refer to same address in heap memory
//
//        a4.age = 15;
//        a4.name = "Rahul";
//        System.out.println(a4.name +  " " + a4.age);
//        System.out.println(a3.name +  " " + a3.age);

//        A a5 = new A(15, "Himesh"); // creates a new object
//        A a6  = new A(a5);  // copy constructor
//        System.out.println(a5.name + " " + a5.age);
//        System.out.println(a6.name + " " + a6.age);
//
//        a6.name = "Rahul chalotra";
//        a6.age = 16;
//
//        a5.name = "Himmat";
//        a6 = a5;
//        System.out.println(a5.name + " " + a5.age);
//        System.out.println(a6.name + " " + a6.age);
//
//        a5.name = "Jitesh";
//        System.out.println(a5.name);
//        System.out.println(a6.name);

        // shallow copy is when reference is different but actual object is pointing to same instance.
        // whenever we make changes in any of the objects it gets reflected in other as well
        // deep copy is when there is no impact if we change any of the objects.
        // in deep copy objects points to different addresses

        // if we want to have deep copy
        // then we have to explicitly mention, or we have to create a new instance of the object when we copy the object

//        Integer number = 16;
//        WrapperExample obj = new WrapperExample(number); // call wrapper constructor
//        System.out.println(obj.a);
//
//        WrapperExample obj2 = new WrapperExample(20); // call primitive constructor
//        System.out.println(obj2.a);

//        final int a = 19;
////        a = 16; // cannot reassign it because it is final
//        System.out.println(a);
//        WrapperExample obj;
//
//
//        // finalize is called because it is creating large number of objects, so garbage collection destroys the object
//        for (int i = 0; i < 1000000000; i++){
//            obj = new WrapperExample();
//        }





    }
}
