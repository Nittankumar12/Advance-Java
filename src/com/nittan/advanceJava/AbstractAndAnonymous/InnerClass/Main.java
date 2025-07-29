package com.nittan.advanceJava.AbstractAndAnonymous.InnerClass;

class Outer{
    int a = 10;
    public void method1(){
        System.out.println("Outer method");
    }


//    class Inner{
    static class Inner{ // if static we can directly create object of it
        public void method2(){
            System.out.println("Inner method");
        }
        int b = 50;
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.a);
        outer.method1();

//        Outer.Inner inner  = new Inner();
        // error because we cannot create object of inner class without an
        // object of outer class like we cannot access a variable without object of outer

//        Outer.Inner inner = new Outer.Inner();
        // still error beause there is not object of outer is used


//        Outer.Inner inner = outer.new Inner();
//        System.out.println(inner.b);
//        inner.method2();

        // we can make class inner static and then we can create object of it
        Outer.Inner inner = new Outer.Inner();
        System.out.println(inner.b);
        inner.method2();


    }
}
