package com.nittan.oops.classesAndObjects;

public class A {
    int age;
    String name;

    A(){

    }
    A(int age, String name){
        this.name = name;
        this.age = age;
    }
    A(int age){
        this.age = age;
        this.name = "Dinesh";
    }

    public A(A a5) {
        this.name = a5.name;
        this.age = a5.age;
    }
}
