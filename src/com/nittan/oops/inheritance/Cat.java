package nittan.oops.inheritance;

public class Cat extends Animal {

    public Cat(String animalName) {
        super(animalName);
    }

    @Override
    public void protectedMethodBeing(){
        System.out.println("protectedMethodBeing is overriden in Cat class (extends from animal)");
    }
    public void createAnimalObject(){
        Animal animal = new Animal("Meooo");
        System.out.println(animal.canEat);
    }
}
