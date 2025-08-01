package nittan.oops.abstraction;

public class Main {
    public static void main(String[] args) {

//        Girl girl = new Girl();
//        girl.career();
//        girl.goal();
//        girl.normalMethod();
//        Girl.normalStaticMethod();
//        Girl.staticMethod();
//

//        Girl g = new Girl(13);
//        g.goal();

        Human human = new Human() {
            @Override
            void career() {
                System.out.println("overriding career in main class");
            }

            @Override
            void goal() {
                System.out.println("overriding goal in main class");
            }
        };
        human.career();
        human.goal();

        // abstract methods cannot be final
        // final do not want to change it self
        // abstract want to be overriden
        // also private should not be used with abstract because it will then not allow anyone to override it.


    }
}
