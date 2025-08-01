package nittan.oops.interfaces;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.greeting();
        System.out.println(Person.SIZE); // Size can be accessed by object of person class
        System.out.println(Person.name); // can also be accessed by person and interface directly
        System.out.println(A.name);
        A.hello();  // directly call static method in interface A
        person.hello2();  // this default requires object for call
    }
}
