package nittan.oops.constructorChaining;

public class Main {
    public static void main(String[] args) {
        // example of constructor chaining using this keyword
        Person person = new Person("Nittan",22);
        System.out.println(person.name);
        System.out.println(person.age);

        // constructor chaining with super keyword

        Person nittan = new Nittan("Nittan",22,"Coding");
        System.out.println(nittan.name);
        System.out.println(nittan.age);
//        System.out.println(nittan.passion); // we cannot access passion because passion is not property of
        // person class it is of Nittan class For printing nittan's passion we have to create object of
        // Nittan class itself like below
        Nittan nittan1 = new Nittan("Nittan Kumar",21,"Coding");
        System.out.printf(nittan1.passion);
    }
}
