package com.nittan.advanceJava.AbstractAndAnonymous.AnonymousClass;

class A{
    public void show(){
        System.out.println("In class A");
    }
}

class B extends A{
    public void show(){
        System.out.println("In class B");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        System.out.println("obj1");
        obj1.show();

        B obj2 = new B();
        System.out.println("obj2");
        obj2.show();

        A obj3 = new B();
        System.out.println("obj3");
        obj3.show();

        A obj4 = new A() {
            // anonymous inner class because it do not have any name and it is given priority as compare to its original class
            public void show() {
                System.out.println("In inner class with obj4");
            }
        };
        obj4.show();

        A obj5 = new B(){
            public void show(){
                System.out.println("In inner class with obj5");
            }
        };
        obj5.show();

        B obj6 = new B(){

            public void show(){
                System.out.println("In inner class with obj6");
            }
        };
        obj6.show();

    }
}
