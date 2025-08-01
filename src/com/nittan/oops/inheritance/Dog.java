package nittan.oops.inheritance;

public class Dog extends Animal{
    String variety;

    Dog(String variety, String name){
        super(name);
        this.variety = this.variety;
    }

    @Override
    public void AnimalMethod(){
        System.out.println("Animalmethod is overriden in dog class");
    }

    // overriding method of its parent's parent class
    @Override
    protected void protectedMethodBeing(){
        System.out.println("protectedmethodbeing in dog class");
    }
}
