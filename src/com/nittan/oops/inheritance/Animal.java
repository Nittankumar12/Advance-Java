package nittan.oops.inheritance;

public class Animal extends Beings{
    private String animalName;

    public Animal(String animalName){
        this.animalName = animalName;
    }

    protected void AnimalMethod(){
        System.out.println("this is animal protected method");
    }

    @Override
    public void publicMethod(){
        System.out.println("public method is overriden in animal class");
    }
    @Override
    protected void protectedMethod(){
        System.out.println("protectedMethod: overriden in Animal class");
    }

}
