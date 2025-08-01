package nittan.oops.polymorphism;

public class RunTimeExample {

    int num1;
    int num2;

    // constructor chaining using the this operator, it is used to call the  other constructor from same one
    // more details in constructor chaining package
    public RunTimeExample(){
        System.out.println("I am in no arg constructor");
    }

    public RunTimeExample(String str){
        this();
        System.out.println("I am in 2nd level constructor");
    }
    public RunTimeExample(char ch){
        this("nittan");
        System.out.println("I am in 3rd level constructor");
    }
    public RunTimeExample(int a,int b){
        this.num1 = a;
        this.num2 = b;
    }
    public void getSum(){
        System.out.println("I got sum from runtime exammple class");
    }
}
class A extends RunTimeExample{

    @Override
    public void getSum(){
        System.out.println("I got sum from A class which is subclass of Runtime example class");
    }
}
