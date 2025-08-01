package nittan.oops.polymorphism;

public class CompileTimeExample {

    int a;
    int b;

    // constructor parameters are different so this is also compile time polymorphism
    // java will check which one to call when
    // this is called constructor overloading
    public CompileTimeExample(int a, int b){
        this.a = a;
        this.b = b;
    }
    public CompileTimeExample(){

    }
    public CompileTimeExample(int a){
        this.a = a;
    }
    // below is called method overloading
    public int sum(int a, int b){
        return a + b;
    }
    public int sum (int a , int b, int c){
        return a + b + c;
    }
}
