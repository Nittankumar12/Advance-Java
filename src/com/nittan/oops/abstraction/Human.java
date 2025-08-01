package nittan.oops.abstraction;

public abstract class Human {
    abstract void career();
    abstract void goal();

    Human(){

    }
    static void staticMethod(){
        System.out.println("staticMethod of human");
    }
    int a;
    Human(int a){
        this.a = a;
    }
    void getA(){
        System.out.println("getA called");
    }
}
