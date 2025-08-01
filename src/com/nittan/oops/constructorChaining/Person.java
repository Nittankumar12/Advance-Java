package nittan.oops.constructorChaining;

public class Person {

    String name;
    int age;

    // this is called constructor chaining with this keyword
    public Person(){
        System.out.println("I am in no arg constructor");
    }
    public Person(int age){
        this();
        this.age = age;
        System.out.println("I am in age arg constructor");
    }
    public Person(String name, int age){
        this(age); // calling this constructor will set the values to age.
        this.name = name;
        System.out.println("I am in name and age arg constructor");
    }
}
