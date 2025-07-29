package com.nittan.advanceJava.AbstractAndAnonymous.AbstractKeyword;

/*
In abstract classes:
1. we can have all abstract methods
2. we can have partial abstract and other methods
3. we can have all defined methods in it
4. concrete class' object is created
5. abstract class' object is not created
 */

// abstract class
abstract class Animal{
    public abstract void eat();
    //instead of defining we can declare a method by using abstract keyword
    // and implement this in other class which is called as concrete class
    public void walk(){
        System.out.println("Animals can walk");
    }
    public abstract void speak();
}

// concrete class
class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("Dog can eat");
    }

    public void speak() {
        System.out.println("Dog can speak");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.walk();
        animal.eat();
        animal.speak();
    }
}
