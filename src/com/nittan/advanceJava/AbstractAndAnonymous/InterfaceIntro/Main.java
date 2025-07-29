package com.nittan.advanceJava.AbstractAndAnonymous.InterfaceIntro;
/*
class to class -> extends
class to interface -> implements
interface to interface -> extends
 */



//instead of creating a abstract class we create  a inteface and then implement these interface methods
interface A{
    // if we want to declare the variables then it by default must be final and static
    String name = "Nittan";
    int age = 20;

     void show();
     void show2();
     void show3();
}
interface P{
    void showP();
}

interface Q extends P{

}

class B implements A,Q
{
    public void show() {
        System.out.println("show 1");
    }
    public void show2() {
        System.out.println("show 2");
    }

    @Override
    public void show3() {
        System.out.println("show 3 of class B ");
    }

    public void showP() {
        System.out.println("showing P of interface P");
    }
}


public class Main {
    public static void main(String[] args) {
       B obj1 = new B(){
           public void show3(){
               System.out.println("show 3 of anonymous class ");
           }
       };
       obj1.show();
       obj1.show2();
       obj1.show3();
       obj1.showP();
        System.out.println(A.age);
        System.out.println(A.name);
    }


}
