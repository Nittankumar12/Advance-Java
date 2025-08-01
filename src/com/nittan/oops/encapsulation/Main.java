package nittan.oops.encapsulation;

public class Main {
    public static void main(String[] args) {
//        Human human = new Human();
//        human.setAge(14);
//        human.setName("Nittan");
//        System.out.println(human.toString());

        // we can add logic for validations during setting feilds of human object.
        // also we cannot directly access the members of human because it is private
        // we have the control of things what needs to be shown to user and what not

        // Main concept of doing this is data hiding
        // if any thing changes we only need to look into the human class that'it.

        // example the buttons are the only way to interact with the remote.
        // actual circuit is hidden from us.
        // this is called encapsulaton

        // abstraction means hiding the complex implementation and showing only essential one
        // primary thing to simply the complexity

        Human human = new Human();
        human.setAge(-11);
        human.setName("Nittan Kumar");
        System.out.println(human);
    }
}
