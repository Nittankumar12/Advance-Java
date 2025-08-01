package nittan.oops.constructorChaining;

public class Nittan extends Person{
    String passion;

    public Nittan(){
        System.out.println("Nittan no args constructor");
    }
    // calling the constructor of other class using super keyword
    // means its just upper parent class (level 1 up to it)
    public Nittan(String name, int age, String passion){
        super(name,age);
        this.passion = passion;
        System.out.println("Nittan constructor with all args");
    }
}
