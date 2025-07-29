package com.nittan.advanceJava.AbstractAndAnonymous.FunctionalInterface;


// we use lambda experssion with functional interfaces
@FunctionalInterface
interface A{
    void show();
}

class B implements A{
    public void show(){
        System.out.println("in show of class B");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new A() {
            @Override
            public void show() {
                System.out.println(" in show");
            }
        };
        obj.show();

        A obj2 = new B();
        obj2.show();

    }
}
