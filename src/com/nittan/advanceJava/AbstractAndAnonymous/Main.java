package com.nittan.advanceJava.AbstractAndAnonymous;



abstract class  A{
    abstract void show();
    abstract  void show2();
}
public class Main {
    public static void main(String[] args) {
        A obj1 = new A(){ // instead of creating a new concrete class we can implement a abstract class method by anonymous class
            public void show(){
                System.out.println("In show");
            }
            public void show2(){
                System.out.println("In show 2 ");
            }
        };
        obj1.show();
        obj1.show2();
    }
}
