package nittan.oops.inheritance;


public class Person extends Beings{

    public Person(int id, String livingName, boolean canEat) {
        super(id, livingName, canEat);
    }
    public Person() {}

    @Override
    protected void protectedMethod(){
        System.out.println("protectedMethod: overriden in child class");
    }
    @Override
    public void publicMethod(){
        System.out.println("publicMethod: overriden in child class");
    }
}
