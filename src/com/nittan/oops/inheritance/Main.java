package nittan.oops.inheritance;

public class Main {
    public static void main(String[] args) {
        // works because protected
//        LivingBeings livingBeings = new LivingBeings();
//        // works because it is public
//        LivingBeings livingBeings1 = new LivingBeings(12,"Animal",true);

        // do not work because private
//        LivingBeings livingBeings2 = new LivingBeings("Human");


//        livingBeings.publicMethod();
//        livingBeings.protectedMethod();
////        livingBeings.privateMethod(); // cannot access it because it is private
//        LivingBeings.staticFinalMethod();

//        Beings being = new Person();
//        being.protectedMethod();  // it is object of Beings but it will call methods of person
//        being.publicMethod();
//        being.greeting(); // this can also be called although it is not overriden
//
//        Person person = new Person();
//        person.protectedMethod();
//        person.greeting();
//        person.publicMethod();
//
//        Beings being2 = new Beings();
//        being2.protectedMethod();
//        being2.publicMethod();
//        being2.greeting();

//        Beings beings = new Beings();
//        Beings.Birds birds = beings.new Birds();
//        birds.publicMethod();
//        birds.protectedMethod();
//

        Animal dog = new Animal("Dog");
        dog.protectedMethod();
        dog.publicMethod();
        dog.greeting();
        dog.protectedMethodBeing();
        Beings.Birds.staticFinalMethod();

        Dog dog1 = new Dog("Bull", "Gimmy");
        dog1.protectedMethodBeing();
        dog1.publicMethod();





    }
}
